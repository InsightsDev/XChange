package org.knowm.xchange.bitfinex.v1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.knowm.xchange.bitfinex.v1.dto.account.BitfinexBalancesResponse;
import org.knowm.xchange.bitfinex.v1.dto.marketdata.BitfinexDepth;
import org.knowm.xchange.bitfinex.v1.dto.marketdata.BitfinexLendLevel;
import org.knowm.xchange.bitfinex.v1.dto.marketdata.BitfinexLevel;
import org.knowm.xchange.bitfinex.v1.dto.marketdata.BitfinexTicker;
import org.knowm.xchange.bitfinex.v1.dto.marketdata.BitfinexTrade;
import org.knowm.xchange.bitfinex.v1.dto.trade.BitfinexOrderStatusResponse;
import org.knowm.xchange.bitfinex.v1.dto.trade.BitfinexTradeResponse;
import org.knowm.xchange.currency.Currency;
import org.knowm.xchange.currency.CurrencyPair;
import org.knowm.xchange.dto.Order.OrderType;
import org.knowm.xchange.dto.account.Balance;
import org.knowm.xchange.dto.account.Wallet;
import org.knowm.xchange.dto.marketdata.OrderBook;
import org.knowm.xchange.dto.marketdata.Ticker;
import org.knowm.xchange.dto.marketdata.Trade;
import org.knowm.xchange.dto.marketdata.Trades;
import org.knowm.xchange.dto.marketdata.Trades.TradeSortType;
import org.knowm.xchange.dto.trade.FixedRateLoanOrder;
import org.knowm.xchange.dto.trade.FloatingRateLoanOrder;
import org.knowm.xchange.dto.trade.LimitOrder;
import org.knowm.xchange.dto.trade.OpenOrders;
import org.knowm.xchange.dto.trade.UserTrade;
import org.knowm.xchange.dto.trade.UserTrades;
import org.knowm.xchange.utils.DateUtils;

public final class BitfinexAdapters {

  public static final Logger log = LoggerFactory.getLogger(BitfinexAdapters.class);

  private BitfinexAdapters() {

  }

  public static List<CurrencyPair> adaptCurrencyPairs(Collection<String> bitfinexSymbol) {

    List<CurrencyPair> currencyPairs = new ArrayList<CurrencyPair>();
    for (String symbol : bitfinexSymbol) {
      currencyPairs.add(adaptCurrencyPair(symbol));
    }
    return currencyPairs;
  }

  public static CurrencyPair adaptCurrencyPair(String bitfinexSymbol) {

    String tradableIdentifier = bitfinexSymbol.substring(0, 3).toUpperCase();
    String transactionCurrency = bitfinexSymbol.substring(3).toUpperCase();
    return new CurrencyPair(tradableIdentifier, transactionCurrency);
  }

  public static String adaptCurrencyPair(CurrencyPair pair) {

    return (pair.base.getCurrencyCode() + pair.counter.getCurrencyCode()).toLowerCase();
  }

  public static OrderBook adaptOrderBook(BitfinexDepth btceDepth, CurrencyPair currencyPair) {

    OrdersContainer asksOrdersContainer = adaptOrders(btceDepth.getAsks(), currencyPair, OrderType.ASK);
    OrdersContainer bidsOrdersContainer = adaptOrders(btceDepth.getBids(), currencyPair, OrderType.BID);

    return new OrderBook(new Date(Math.max(asksOrdersContainer.getTimestamp(), bidsOrdersContainer.getTimestamp())),
        asksOrdersContainer.getLimitOrders(), bidsOrdersContainer.getLimitOrders());
  }

  public static OrdersContainer adaptOrders(BitfinexLevel[] bitfinexLevels, CurrencyPair currencyPair, OrderType orderType) {

    BigDecimal maxTimestamp = new BigDecimal(Long.MIN_VALUE);
    List<LimitOrder> limitOrders = new ArrayList<LimitOrder>(bitfinexLevels.length);

    for (BitfinexLevel bitfinexLevel : bitfinexLevels) {
      if (bitfinexLevel.getTimestamp().compareTo(maxTimestamp) > 0) {
        maxTimestamp = bitfinexLevel.getTimestamp();
      }

      Date timestamp = convertBigDecimalTimestampToDate(bitfinexLevel.getTimestamp());
      limitOrders.add(adaptOrder(bitfinexLevel.getAmount(), bitfinexLevel.getPrice(), currencyPair, orderType, timestamp));
    }

    long maxTimestampInMillis = maxTimestamp.multiply(new BigDecimal(1000l)).longValue();
    return new OrdersContainer(maxTimestampInMillis, limitOrders);
  }

  public static class OrdersContainer {

    private final long timestamp;
    private final List<LimitOrder> limitOrders;

    /**
     * Constructor
     *
     * @param timestamp
     * @param limitOrders
     */
    public OrdersContainer(long timestamp, List<LimitOrder> limitOrders) {

      this.timestamp = timestamp;
      this.limitOrders = limitOrders;
    }

    public long getTimestamp() {

      return timestamp;
    }

    public List<LimitOrder> getLimitOrders() {

      return limitOrders;
    }
  }

  public static LimitOrder adaptOrder(BigDecimal amount, BigDecimal price, CurrencyPair currencyPair, OrderType orderType, Date timestamp) {

    return new LimitOrder(orderType, amount, currencyPair, "", timestamp, price);
  }

  public static List<FixedRateLoanOrder> adaptFixedRateLoanOrders(BitfinexLendLevel[] orders, String currency, String orderType, String id) {

    List<FixedRateLoanOrder> loanOrders = new ArrayList<FixedRateLoanOrder>(orders.length);

    for (BitfinexLendLevel order : orders) {
      if ("yes".equalsIgnoreCase(order.getFrr())) {
        continue;
      }

      // Bid orderbook is reversed order. Insert at reversed indices
      if (orderType.equalsIgnoreCase("loan")) {
        loanOrders.add(0, adaptFixedRateLoanOrder(currency, order.getAmount(), order.getPeriod(), orderType, id, order.getRate()));
      } else {
        loanOrders.add(adaptFixedRateLoanOrder(currency, order.getAmount(), order.getPeriod(), orderType, id, order.getRate()));
      }
    }

    return loanOrders;
  }

  public static FixedRateLoanOrder adaptFixedRateLoanOrder(String currency, BigDecimal amount, int dayPeriod, String direction, String id,
      BigDecimal rate) {

    OrderType orderType = direction.equalsIgnoreCase("loan") ? OrderType.BID : OrderType.ASK;

    return new FixedRateLoanOrder(orderType, currency, amount, dayPeriod, id, null, rate);
  }

  public static List<FloatingRateLoanOrder> adaptFloatingRateLoanOrders(BitfinexLendLevel[] orders, String currency, String orderType, String id) {

    List<FloatingRateLoanOrder> loanOrders = new ArrayList<FloatingRateLoanOrder>(orders.length);

    for (BitfinexLendLevel order : orders) {
      if ("no".equals(order.getFrr())) {
        continue;
      }

      // Bid orderbook is reversed order. Insert at reversed indices
      if (orderType.equalsIgnoreCase("loan")) {
        loanOrders.add(0, adaptFloatingRateLoanOrder(currency, order.getAmount(), order.getPeriod(), orderType, id, order.getRate()));
      } else {
        loanOrders.add(adaptFloatingRateLoanOrder(currency, order.getAmount(), order.getPeriod(), orderType, id, order.getRate()));
      }
    }

    return loanOrders;
  }

  public static FloatingRateLoanOrder adaptFloatingRateLoanOrder(String currency, BigDecimal amount, int dayPeriod, String direction, String id,
      BigDecimal rate) {

    OrderType orderType = direction.equalsIgnoreCase("loan") ? OrderType.BID : OrderType.ASK;

    return new FloatingRateLoanOrder(orderType, currency, amount, dayPeriod, id, null, rate);
  }

  public static Trade adaptTrade(BitfinexTrade trade, CurrencyPair currencyPair) {

    OrderType orderType = trade.getType().equals("buy") ? OrderType.BID : OrderType.ASK;
    BigDecimal amount = trade.getAmount();
    BigDecimal price = trade.getPrice();
    Date date = DateUtils.fromMillisUtc(trade.getTimestamp() * 1000L); // Bitfinex uses Unix timestamps
    final String tradeId = String.valueOf(trade.getTradeId());
    return new Trade(orderType, amount, currencyPair, price, date, tradeId);
  }

  public static Trades adaptTrades(BitfinexTrade[] trades, CurrencyPair currencyPair) {

    List<Trade> tradesList = new ArrayList<Trade>(trades.length);
    long lastTradeId = 0;
    for (BitfinexTrade trade : trades) {
      long tradeId = trade.getTradeId();
      if (tradeId > lastTradeId) {
        lastTradeId = tradeId;
      }
      tradesList.add(adaptTrade(trade, currencyPair));
    }
    return new Trades(tradesList, lastTradeId, TradeSortType.SortByID);
  }

  public static Ticker adaptTicker(BitfinexTicker bitfinexTicker, CurrencyPair currencyPair) {

    BigDecimal last = bitfinexTicker.getLast_price();
    BigDecimal bid = bitfinexTicker.getBid();
    BigDecimal ask = bitfinexTicker.getAsk();
    BigDecimal high = bitfinexTicker.getHigh();
    BigDecimal low = bitfinexTicker.getLow();
    BigDecimal volume = bitfinexTicker.getVolume();

    Date timestamp = DateUtils.fromMillisUtc((long) (bitfinexTicker.getTimestamp() * 1000L));

    return new Ticker.Builder().currencyPair(currencyPair).last(last).bid(bid).ask(ask).high(high).low(low).volume(volume).timestamp(timestamp)
        .build();
  }

  public static Wallet adaptWallet(BitfinexBalancesResponse[] response) {

    List<Balance> balances = new ArrayList<Balance>(response.length);

    for (BitfinexBalancesResponse balance : response) {
      if ("exchange".equals(balance.getType())) {
        balances.add(new Balance(Currency.getInstance(balance.getCurrency().toUpperCase()), balance.getAmount(), balance.getAvailable()));
      }
    }

    return new Wallet(balances);
  }

  public static OpenOrders adaptOrders(BitfinexOrderStatusResponse[] activeOrders) {

    List<LimitOrder> limitOrders = new ArrayList<LimitOrder>(activeOrders.length);

    for (BitfinexOrderStatusResponse order : activeOrders) {
      OrderType orderType = order.getSide().equalsIgnoreCase("buy") ? OrderType.BID : OrderType.ASK;
      CurrencyPair currencyPair = adaptCurrencyPair(order.getSymbol());
      Date timestamp = convertBigDecimalTimestampToDate(order.getTimestamp());
      limitOrders
          .add(new LimitOrder(orderType, order.getRemainingAmount(), currencyPair, String.valueOf(order.getId()), timestamp, order.getPrice()));
    }

    return new OpenOrders(limitOrders);
  }

  public static UserTrades adaptTradeHistory(BitfinexTradeResponse[] trades, String symbol) {

    List<UserTrade> pastTrades = new ArrayList<UserTrade>(trades.length);
    CurrencyPair currencyPair = adaptCurrencyPair(symbol);

    for (BitfinexTradeResponse trade : trades) {
      OrderType orderType = trade.getType().equalsIgnoreCase("buy") ? OrderType.BID : OrderType.ASK;
      Date timestamp = convertBigDecimalTimestampToDate(trade.getTimestamp());
      final BigDecimal fee = trade.getFeeAmount() == null ? null : trade.getFeeAmount().negate();
      pastTrades.add(new UserTrade(orderType, trade.getAmount(), currencyPair, trade.getPrice(), timestamp, trade.getTradeId(), trade.getOrderId(),
          fee, Currency.getInstance(trade.getFeeCurrency())));
    }

    return new UserTrades(pastTrades, TradeSortType.SortByTimestamp);
  }

  private static Date convertBigDecimalTimestampToDate(BigDecimal timestamp) {

    BigDecimal timestampInMillis = timestamp.multiply(new BigDecimal("1000"));
    return new Date(timestampInMillis.longValue());
  }
}
