package org.knowm.xchange.cryptsy;

import java.util.HashMap;
import java.util.Map;

import org.knowm.xchange.currency.CurrencyPair;

/**
 * @author ObsessiveOrange
 */
public final class CryptsyCurrencyUtils {

  /**
   * Map containing relationships between MarketIds and CurrencyPairs CAA: 27 June 2014 This list is not final, since CryptsyBasePollingService will
   * update it on first run.
   */
  @SuppressWarnings("serial")
  public static Map<Integer, CurrencyPair> marketIds_CurrencyPairs = new HashMap<Integer, CurrencyPair>() {

    {
      put(141, new CurrencyPair("42", "BTC"));
      put(199, new CurrencyPair("AC", "BTC"));
      put(253, new CurrencyPair("AGS", "BTC"));
      put(57, new CurrencyPair("ALF", "BTC"));
      put(273, new CurrencyPair("ALN", "BTC"));
      put(43, new CurrencyPair("AMC", "BTC"));
      put(66, new CurrencyPair("ANC", "BTC"));
      put(257, new CurrencyPair("APEX", "BTC"));
      put(48, new CurrencyPair("ARG", "BTC"));
      put(160, new CurrencyPair("AUR", "BTC"));
      put(179, new CurrencyPair("BC", "BTC"));
      put(142, new CurrencyPair("BCX", "BTC"));
      put(157, new CurrencyPair("BEN", "BTC"));
      put(129, new CurrencyPair("BET", "BTC"));
      put(251, new CurrencyPair("BLU", "BTC"));
      put(10, new CurrencyPair("BQC", "BTC"));
      put(23, new CurrencyPair("BTB", "BTC"));
      put(256, new CurrencyPair("BTCD", "BTC"));
      put(49, new CurrencyPair("BTE", "BTC"));
      put(50, new CurrencyPair("BTG", "BTC"));
      put(102, new CurrencyPair("BUK", "BTC"));
      put(154, new CurrencyPair("CACH", "BTC"));
      put(221, new CurrencyPair("CAIx", "BTC"));
      put(53, new CurrencyPair("CAP", "BTC"));
      put(150, new CurrencyPair("CASH", "BTC"));
      put(136, new CurrencyPair("CAT", "BTC"));
      put(70, new CurrencyPair("CGB", "BTC"));
      put(197, new CurrencyPair("CINNI", "BTC"));
      put(227, new CurrencyPair("CLOAK", "BTC"));
      put(95, new CurrencyPair("CLR", "BTC"));
      put(74, new CurrencyPair("CMC", "BTC"));
      put(8, new CurrencyPair("CNC", "BTC"));
      put(260, new CurrencyPair("CNL", "BTC"));
      put(198, new CurrencyPair("COMM", "BTC"));
      put(266, new CurrencyPair("COOL", "BTC"));
      put(58, new CurrencyPair("CRC", "BTC"));
      put(219, new CurrencyPair("CRYPT", "BTC"));
      put(68, new CurrencyPair("CSC", "BTC"));
      put(131, new CurrencyPair("DEM", "BTC"));
      put(167, new CurrencyPair("DGB", "BTC"));
      put(26, new CurrencyPair("DGC", "BTC"));
      put(72, new CurrencyPair("DMD", "BTC"));
      put(132, new CurrencyPair("DOGE", "BTC"));
      put(155, new CurrencyPair("DRK", "BTC"));
      put(274, new CurrencyPair("DRKC", "BTC"));
      put(40, new CurrencyPair("DVC", "BTC"));
      put(139, new CurrencyPair("EAC", "BTC"));
      put(12, new CurrencyPair("ELC", "BTC"));
      put(188, new CurrencyPair("EMC2", "BTC"));
      put(69, new CurrencyPair("EMD", "BTC"));
      put(183, new CurrencyPair("EXE", "BTC"));
      put(47, new CurrencyPair("EZC", "BTC"));
      put(138, new CurrencyPair("FFC", "BTC"));
      put(192, new CurrencyPair("FLT", "BTC"));
      put(259, new CurrencyPair("FRAC", "BTC"));
      put(39, new CurrencyPair("FRC", "BTC"));
      put(33, new CurrencyPair("FRK", "BTC"));
      put(44, new CurrencyPair("FST", "BTC"));
      put(5, new CurrencyPair("FTC", "BTC"));
      put(82, new CurrencyPair("GDC", "BTC"));
      put(76, new CurrencyPair("GLC", "BTC"));
      put(30, new CurrencyPair("GLD", "BTC"));
      put(78, new CurrencyPair("GLX", "BTC"));
      put(229, new CurrencyPair("GLYPH", "BTC"));
      put(241, new CurrencyPair("GUE", "BTC"));
      put(80, new CurrencyPair("HBN", "BTC"));
      put(249, new CurrencyPair("HUC", "BTC"));
      put(185, new CurrencyPair("HVC", "BTC"));
      put(267, new CurrencyPair("ICB", "BTC"));
      put(59, new CurrencyPair("IFC", "BTC"));
      put(272, new CurrencyPair("IOC", "BTC"));
      put(38, new CurrencyPair("IXC", "BTC"));
      put(25, new CurrencyPair("JKC", "BTC"));
      put(269, new CurrencyPair("JUDGE", "BTC"));
      put(178, new CurrencyPair("KDC", "BTC"));
      put(255, new CurrencyPair("KEY", "BTC"));
      put(65, new CurrencyPair("KGC", "BTC"));
      put(204, new CurrencyPair("LGD", "BTC"));
      put(116, new CurrencyPair("LK7", "BTC"));
      put(34, new CurrencyPair("LKY", "BTC"));
      put(202, new CurrencyPair("LTB", "BTC"));
      put(3, new CurrencyPair("LTC", "BTC"));
      put(233, new CurrencyPair("LTCX", "BTC"));
      put(177, new CurrencyPair("LYC", "BTC"));
      put(152, new CurrencyPair("MAX", "BTC"));
      put(45, new CurrencyPair("MEC", "BTC"));
      put(258, new CurrencyPair("MIN", "BTC"));
      put(156, new CurrencyPair("MINT", "BTC"));
      put(187, new CurrencyPair("MN1", "BTC"));
      put(196, new CurrencyPair("MN2", "BTC"));
      put(7, new CurrencyPair("MNC", "BTC"));
      put(189, new CurrencyPair("MRY", "BTC"));
      put(200, new CurrencyPair("MYR", "BTC"));
      put(164, new CurrencyPair("MZC", "BTC"));
      put(64, new CurrencyPair("NAN", "BTC"));
      put(207, new CurrencyPair("NAUT", "BTC"));
      put(252, new CurrencyPair("NAV", "BTC"));
      put(32, new CurrencyPair("NBL", "BTC"));
      put(90, new CurrencyPair("NEC", "BTC"));
      put(134, new CurrencyPair("NET", "BTC"));
      put(29, new CurrencyPair("NMC", "BTC"));
      put(264, new CurrencyPair("NOBL", "BTC"));
      put(54, new CurrencyPair("NRB", "BTC"));
      put(211, new CurrencyPair("NRS", "BTC"));
      put(13, new CurrencyPair("NVC", "BTC"));
      put(159, new CurrencyPair("NXT", "BTC"));
      put(184, new CurrencyPair("NYAN", "BTC"));
      put(75, new CurrencyPair("ORB", "BTC"));
      put(144, new CurrencyPair("OSC", "BTC"));
      put(86, new CurrencyPair("PHS", "BTC"));
      put(120, new CurrencyPair("Points", "BTC"));
      put(173, new CurrencyPair("POT", "BTC"));
      put(28, new CurrencyPair("PPC", "BTC"));
      put(268, new CurrencyPair("PSEUD", "BTC"));
      put(119, new CurrencyPair("PTS", "BTC"));
      put(31, new CurrencyPair("PXC", "BTC"));
      put(92, new CurrencyPair("PYC", "BTC"));
      put(71, new CurrencyPair("QRK", "BTC"));
      put(169, new CurrencyPair("RDD", "BTC"));
      put(143, new CurrencyPair("RPC", "BTC"));
      put(235, new CurrencyPair("RT2", "BTC"));
      put(9, new CurrencyPair("RYC", "BTC"));
      put(237, new CurrencyPair("RZR", "BTC"));
      put(232, new CurrencyPair("SAT2", "BTC"));
      put(51, new CurrencyPair("SBC", "BTC"));
      put(225, new CurrencyPair("SC", "BTC"));
      put(270, new CurrencyPair("SFR", "BTC"));
      put(248, new CurrencyPair("SHLD", "BTC"));
      put(158, new CurrencyPair("SMC", "BTC"));
      put(180, new CurrencyPair("SPA", "BTC"));
      put(81, new CurrencyPair("SPT", "BTC"));
      put(88, new CurrencyPair("SRC", "BTC"));
      put(83, new CurrencyPair("STR", "BTC"));
      put(239, new CurrencyPair("SUPER", "BTC"));
      put(153, new CurrencyPair("SXC", "BTC"));
      put(271, new CurrencyPair("SYNC", "BTC"));
      put(117, new CurrencyPair("TAG", "BTC"));
      put(166, new CurrencyPair("TAK", "BTC"));
      put(114, new CurrencyPair("TEK", "BTC"));
      put(223, new CurrencyPair("TES", "BTC"));
      put(130, new CurrencyPair("TGC", "BTC"));
      put(250, new CurrencyPair("TOR", "BTC"));
      put(27, new CurrencyPair("TRC", "BTC"));
      put(203, new CurrencyPair("UNB", "BTC"));
      put(133, new CurrencyPair("UNO", "BTC"));
      put(247, new CurrencyPair("URO", "BTC"));
      put(201, new CurrencyPair("USDe", "BTC"));
      put(163, new CurrencyPair("UTC", "BTC"));
      put(261, new CurrencyPair("VIA", "BTC"));
      put(254, new CurrencyPair("VOOT", "BTC"));
      put(209, new CurrencyPair("VRC", "BTC"));
      put(151, new CurrencyPair("VTC", "BTC"));
      put(195, new CurrencyPair("WC", "BTC"));
      put(14, new CurrencyPair("WDC", "BTC"));
      put(210, new CurrencyPair("XC", "BTC"));
      put(115, new CurrencyPair("XJO", "BTC"));
      put(208, new CurrencyPair("XLB", "BTC"));
      put(63, new CurrencyPair("XPM", "BTC"));
      put(265, new CurrencyPair("XXX", "BTC"));
      put(11, new CurrencyPair("YAC", "BTC"));
      put(73, new CurrencyPair("YBC", "BTC"));
      put(140, new CurrencyPair("ZCC", "BTC"));
      put(170, new CurrencyPair("ZED", "BTC"));
      put(85, new CurrencyPair("ZET", "BTC"));
      put(94, new CurrencyPair("ADT", "LTC"));
      put(121, new CurrencyPair("ANC", "LTC"));
      put(111, new CurrencyPair("ASC", "LTC"));
      put(161, new CurrencyPair("AUR", "LTC"));
      put(186, new CurrencyPair("BAT", "LTC"));
      put(191, new CurrencyPair("BC", "LTC"));
      put(123, new CurrencyPair("CGB", "LTC"));
      put(228, new CurrencyPair("CLOAK", "LTC"));
      put(17, new CurrencyPair("CNC", "LTC"));
      put(109, new CurrencyPair("COL", "LTC"));
      put(91, new CurrencyPair("CPR", "LTC"));
      put(220, new CurrencyPair("CRYPT", "LTC"));
      put(175, new CurrencyPair("CTM", "LTC"));
      put(46, new CurrencyPair("DBL", "LTC"));
      put(96, new CurrencyPair("DGC", "LTC"));
      put(206, new CurrencyPair("DIME", "LTC"));
      put(194, new CurrencyPair("DMC", "LTC"));
      put(135, new CurrencyPair("DOGE", "LTC"));
      put(214, new CurrencyPair("DRK", "LTC"));
      put(52, new CurrencyPair("DVC", "LTC"));
      put(244, new CurrencyPair("EAC", "LTC"));
      put(93, new CurrencyPair("ELP", "LTC"));
      put(55, new CurrencyPair("EZC", "LTC"));
      put(246, new CurrencyPair("FLAP", "LTC"));
      put(61, new CurrencyPair("FLO", "LTC"));
      put(171, new CurrencyPair("FRK", "LTC"));
      put(124, new CurrencyPair("FST", "LTC"));
      put(4, new CurrencyPair("FTC", "LTC"));
      put(36, new CurrencyPair("GLD", "LTC"));
      put(230, new CurrencyPair("GLYPH", "LTC"));
      put(84, new CurrencyPair("GME", "LTC"));
      put(242, new CurrencyPair("GUE", "LTC"));
      put(60, new CurrencyPair("IFC", "LTC"));
      put(193, new CurrencyPair("KARM", "LTC"));
      put(245, new CurrencyPair("LEAF", "LTC"));
      put(243, new CurrencyPair("LOT", "LTC"));
      put(234, new CurrencyPair("LTCX", "LTC"));
      put(218, new CurrencyPair("MAX", "LTC"));
      put(100, new CurrencyPair("MEC", "LTC"));
      put(56, new CurrencyPair("MEM", "LTC"));
      put(231, new CurrencyPair("MEOW", "LTC"));
      put(145, new CurrencyPair("MOON", "LTC"));
      put(62, new CurrencyPair("MST", "LTC"));
      put(108, new CurrencyPair("NET", "LTC"));
      put(162, new CurrencyPair("NXT", "LTC"));
      put(263, new CurrencyPair("NYAN", "LTC"));
      put(125, new CurrencyPair("PPC", "LTC"));
      put(101, new CurrencyPair("PXC", "LTC"));
      put(126, new CurrencyPair("QRK", "LTC"));
      put(190, new CurrencyPair("RBBT", "LTC"));
      put(212, new CurrencyPair("RDD", "LTC"));
      put(87, new CurrencyPair("RED", "LTC"));
      put(238, new CurrencyPair("RZR", "LTC"));
      put(128, new CurrencyPair("SBC", "LTC"));
      put(240, new CurrencyPair("SUPER", "LTC"));
      put(98, new CurrencyPair("SXC", "LTC"));
      put(224, new CurrencyPair("TES", "LTC"));
      put(147, new CurrencyPair("TIPS", "LTC"));
      put(107, new CurrencyPair("TIX", "LTC"));
      put(215, new CurrencyPair("VRC", "LTC"));
      put(217, new CurrencyPair("VTC", "LTC"));
      put(21, new CurrencyPair("WDC", "LTC"));
      put(216, new CurrencyPair("XC", "LTC"));
      put(67, new CurrencyPair("XNC", "LTC"));
      put(106, new CurrencyPair("XPM", "LTC"));
      put(22, new CurrencyPair("YAC", "LTC"));
      put(176, new CurrencyPair("ZEIT", "LTC"));
      put(127, new CurrencyPair("ZET", "LTC"));
      put(2, new CurrencyPair("BTC", "USD"));
      put(182, new CurrencyPair("DOGE", "USD"));
      put(213, new CurrencyPair("DRK", "USD"));
      put(6, new CurrencyPair("FTC", "USD"));
      put(1, new CurrencyPair("LTC", "USD"));
      put(294, new CurrencyPair("LTCD", "BTC"));
      put(262, new CurrencyPair("RDD", "USD"));
      put(478, new CurrencyPair("BTC", "EUR"));
    }
  };

  /**
   * Map containing relationships between MarketIds and CurrencyPairs CAA: 27 June 2014 This list is not final, since CryptsyBasePollingService will
   * update it on first run.
   */
  @SuppressWarnings("serial")
  public static Map<CurrencyPair, Integer> currencyPairs_MarketIds = new HashMap<CurrencyPair, Integer>() {

    {
      put(new CurrencyPair("42", "BTC"), 141);
      put(new CurrencyPair("AC", "BTC"), 199);
      put(new CurrencyPair("AGS", "BTC"), 253);
      put(new CurrencyPair("ALF", "BTC"), 57);
      put(new CurrencyPair("ALN", "BTC"), 273);
      put(new CurrencyPair("AMC", "BTC"), 43);
      put(new CurrencyPair("ANC", "BTC"), 66);
      put(new CurrencyPair("APEX", "BTC"), 257);
      put(new CurrencyPair("ARG", "BTC"), 48);
      put(new CurrencyPair("AUR", "BTC"), 160);
      put(new CurrencyPair("BC", "BTC"), 179);
      put(new CurrencyPair("BCX", "BTC"), 142);
      put(new CurrencyPair("BEN", "BTC"), 157);
      put(new CurrencyPair("BET", "BTC"), 129);
      put(new CurrencyPair("BLU", "BTC"), 251);
      put(new CurrencyPair("BQC", "BTC"), 10);
      put(new CurrencyPair("BTB", "BTC"), 23);
      put(new CurrencyPair("BTCD", "BTC"), 256);
      put(new CurrencyPair("BTE", "BTC"), 49);
      put(new CurrencyPair("BTG", "BTC"), 50);
      put(new CurrencyPair("BUK", "BTC"), 102);
      put(new CurrencyPair("CACH", "BTC"), 154);
      put(new CurrencyPair("CAIx", "BTC"), 221);
      put(new CurrencyPair("CAP", "BTC"), 53);
      put(new CurrencyPair("CASH", "BTC"), 150);
      put(new CurrencyPair("CAT", "BTC"), 136);
      put(new CurrencyPair("CGB", "BTC"), 70);
      put(new CurrencyPair("CINNI", "BTC"), 197);
      put(new CurrencyPair("CLOAK", "BTC"), 227);
      put(new CurrencyPair("CLR", "BTC"), 95);
      put(new CurrencyPair("CMC", "BTC"), 74);
      put(new CurrencyPair("CNC", "BTC"), 8);
      put(new CurrencyPair("CNL", "BTC"), 260);
      put(new CurrencyPair("COMM", "BTC"), 198);
      put(new CurrencyPair("COOL", "BTC"), 266);
      put(new CurrencyPair("CRC", "BTC"), 58);
      put(new CurrencyPair("CRYPT", "BTC"), 219);
      put(new CurrencyPair("CSC", "BTC"), 68);
      put(new CurrencyPair("DEM", "BTC"), 131);
      put(new CurrencyPair("DGB", "BTC"), 167);
      put(new CurrencyPair("DGC", "BTC"), 26);
      put(new CurrencyPair("DMD", "BTC"), 72);
      put(new CurrencyPair("DOGE", "BTC"), 132);
      put(new CurrencyPair("DRK", "BTC"), 155);
      put(new CurrencyPair("DRKC", "BTC"), 274);
      put(new CurrencyPair("DVC", "BTC"), 40);
      put(new CurrencyPair("EAC", "BTC"), 139);
      put(new CurrencyPair("ELC", "BTC"), 12);
      put(new CurrencyPair("EMC2", "BTC"), 188);
      put(new CurrencyPair("EMD", "BTC"), 69);
      put(new CurrencyPair("EXE", "BTC"), 183);
      put(new CurrencyPair("EZC", "BTC"), 47);
      put(new CurrencyPair("FFC", "BTC"), 138);
      put(new CurrencyPair("FLT", "BTC"), 192);
      put(new CurrencyPair("FRAC", "BTC"), 259);
      put(new CurrencyPair("FRC", "BTC"), 39);
      put(new CurrencyPair("FRK", "BTC"), 33);
      put(new CurrencyPair("FST", "BTC"), 44);
      put(new CurrencyPair("FTC", "BTC"), 5);
      put(new CurrencyPair("GDC", "BTC"), 82);
      put(new CurrencyPair("GLC", "BTC"), 76);
      put(new CurrencyPair("GLD", "BTC"), 30);
      put(new CurrencyPair("GLX", "BTC"), 78);
      put(new CurrencyPair("GLYPH", "BTC"), 229);
      put(new CurrencyPair("GUE", "BTC"), 241);
      put(new CurrencyPair("HBN", "BTC"), 80);
      put(new CurrencyPair("HUC", "BTC"), 249);
      put(new CurrencyPair("HVC", "BTC"), 185);
      put(new CurrencyPair("ICB", "BTC"), 267);
      put(new CurrencyPair("IFC", "BTC"), 59);
      put(new CurrencyPair("IOC", "BTC"), 272);
      put(new CurrencyPair("IXC", "BTC"), 38);
      put(new CurrencyPair("JKC", "BTC"), 25);
      put(new CurrencyPair("JUDGE", "BTC"), 269);
      put(new CurrencyPair("KDC", "BTC"), 178);
      put(new CurrencyPair("KEY", "BTC"), 255);
      put(new CurrencyPair("KGC", "BTC"), 65);
      put(new CurrencyPair("LGD", "BTC"), 204);
      put(new CurrencyPair("LK7", "BTC"), 116);
      put(new CurrencyPair("LKY", "BTC"), 34);
      put(new CurrencyPair("LTB", "BTC"), 202);
      put(new CurrencyPair("LTC", "BTC"), 3);
      put(new CurrencyPair("LTCD", "BTC"), 294);
      put(new CurrencyPair("LTCX", "BTC"), 233);
      put(new CurrencyPair("LYC", "BTC"), 177);
      put(new CurrencyPair("MAX", "BTC"), 152);
      put(new CurrencyPair("MEC", "BTC"), 45);
      put(new CurrencyPair("MIN", "BTC"), 258);
      put(new CurrencyPair("MINT", "BTC"), 156);
      put(new CurrencyPair("MN1", "BTC"), 187);
      put(new CurrencyPair("MN2", "BTC"), 196);
      put(new CurrencyPair("MNC", "BTC"), 7);
      put(new CurrencyPair("MRY", "BTC"), 189);
      put(new CurrencyPair("MYR", "BTC"), 200);
      put(new CurrencyPair("MZC", "BTC"), 164);
      put(new CurrencyPair("NAN", "BTC"), 64);
      put(new CurrencyPair("NAUT", "BTC"), 207);
      put(new CurrencyPair("NAV", "BTC"), 252);
      put(new CurrencyPair("NBL", "BTC"), 32);
      put(new CurrencyPair("NEC", "BTC"), 90);
      put(new CurrencyPair("NET", "BTC"), 134);
      put(new CurrencyPair("NMC", "BTC"), 29);
      put(new CurrencyPair("NOBL", "BTC"), 264);
      put(new CurrencyPair("NRB", "BTC"), 54);
      put(new CurrencyPair("NRS", "BTC"), 211);
      put(new CurrencyPair("NVC", "BTC"), 13);
      put(new CurrencyPair("NXT", "BTC"), 159);
      put(new CurrencyPair("NYAN", "BTC"), 184);
      put(new CurrencyPair("ORB", "BTC"), 75);
      put(new CurrencyPair("OSC", "BTC"), 144);
      put(new CurrencyPair("PHS", "BTC"), 86);
      put(new CurrencyPair("Points", "BTC"), 120);
      put(new CurrencyPair("POT", "BTC"), 173);
      put(new CurrencyPair("PPC", "BTC"), 28);
      put(new CurrencyPair("PSEUD", "BTC"), 268);
      put(new CurrencyPair("PTS", "BTC"), 119);
      put(new CurrencyPair("PXC", "BTC"), 31);
      put(new CurrencyPair("PYC", "BTC"), 92);
      put(new CurrencyPair("QRK", "BTC"), 71);
      put(new CurrencyPair("RDD", "BTC"), 169);
      put(new CurrencyPair("RPC", "BTC"), 143);
      put(new CurrencyPair("RT2", "BTC"), 235);
      put(new CurrencyPair("RYC", "BTC"), 9);
      put(new CurrencyPair("RZR", "BTC"), 237);
      put(new CurrencyPair("SAT2", "BTC"), 232);
      put(new CurrencyPair("SBC", "BTC"), 51);
      put(new CurrencyPair("SC", "BTC"), 225);
      put(new CurrencyPair("SFR", "BTC"), 270);
      put(new CurrencyPair("SHLD", "BTC"), 248);
      put(new CurrencyPair("SMC", "BTC"), 158);
      put(new CurrencyPair("SPA", "BTC"), 180);
      put(new CurrencyPair("SPT", "BTC"), 81);
      put(new CurrencyPair("SRC", "BTC"), 88);
      put(new CurrencyPair("STR", "BTC"), 83);
      put(new CurrencyPair("SUPER", "BTC"), 239);
      put(new CurrencyPair("SXC", "BTC"), 153);
      put(new CurrencyPair("SYNC", "BTC"), 271);
      put(new CurrencyPair("TAG", "BTC"), 117);
      put(new CurrencyPair("TAK", "BTC"), 166);
      put(new CurrencyPair("TEK", "BTC"), 114);
      put(new CurrencyPair("TES", "BTC"), 223);
      put(new CurrencyPair("TGC", "BTC"), 130);
      put(new CurrencyPair("TOR", "BTC"), 250);
      put(new CurrencyPair("TRC", "BTC"), 27);
      put(new CurrencyPair("UNB", "BTC"), 203);
      put(new CurrencyPair("UNO", "BTC"), 133);
      put(new CurrencyPair("URO", "BTC"), 247);
      put(new CurrencyPair("USDe", "BTC"), 201);
      put(new CurrencyPair("UTC", "BTC"), 163);
      put(new CurrencyPair("VIA", "BTC"), 261);
      put(new CurrencyPair("VOOT", "BTC"), 254);
      put(new CurrencyPair("VRC", "BTC"), 209);
      put(new CurrencyPair("VTC", "BTC"), 151);
      put(new CurrencyPair("WC", "BTC"), 195);
      put(new CurrencyPair("WDC", "BTC"), 14);
      put(new CurrencyPair("XC", "BTC"), 210);
      put(new CurrencyPair("XJO", "BTC"), 115);
      put(new CurrencyPair("XLB", "BTC"), 208);
      put(new CurrencyPair("XPM", "BTC"), 63);
      put(new CurrencyPair("XXX", "BTC"), 265);
      put(new CurrencyPair("YAC", "BTC"), 11);
      put(new CurrencyPair("YBC", "BTC"), 73);
      put(new CurrencyPair("ZCC", "BTC"), 140);
      put(new CurrencyPair("ZED", "BTC"), 170);
      put(new CurrencyPair("ZET", "BTC"), 85);
      put(new CurrencyPair("ADT", "LTC"), 94);
      put(new CurrencyPair("ANC", "LTC"), 121);
      put(new CurrencyPair("ASC", "LTC"), 111);
      put(new CurrencyPair("AUR", "LTC"), 161);
      put(new CurrencyPair("BAT", "LTC"), 186);
      put(new CurrencyPair("BC", "LTC"), 191);
      put(new CurrencyPair("CGB", "LTC"), 123);
      put(new CurrencyPair("CLOAK", "LTC"), 228);
      put(new CurrencyPair("CNC", "LTC"), 17);
      put(new CurrencyPair("COL", "LTC"), 109);
      put(new CurrencyPair("CPR", "LTC"), 91);
      put(new CurrencyPair("CRYPT", "LTC"), 220);
      put(new CurrencyPair("CTM", "LTC"), 175);
      put(new CurrencyPair("DBL", "LTC"), 46);
      put(new CurrencyPair("DGC", "LTC"), 96);
      put(new CurrencyPair("DIME", "LTC"), 206);
      put(new CurrencyPair("DMC", "LTC"), 194);
      put(new CurrencyPair("DOGE", "LTC"), 135);
      put(new CurrencyPair("DRK", "LTC"), 214);
      put(new CurrencyPair("DVC", "LTC"), 52);
      put(new CurrencyPair("EAC", "LTC"), 244);
      put(new CurrencyPair("ELP", "LTC"), 93);
      put(new CurrencyPair("EZC", "LTC"), 55);
      put(new CurrencyPair("FLAP", "LTC"), 246);
      put(new CurrencyPair("FLO", "LTC"), 61);
      put(new CurrencyPair("FRK", "LTC"), 171);
      put(new CurrencyPair("FST", "LTC"), 124);
      put(new CurrencyPair("FTC", "LTC"), 4);
      put(new CurrencyPair("GLD", "LTC"), 36);
      put(new CurrencyPair("GLYPH", "LTC"), 230);
      put(new CurrencyPair("GME", "LTC"), 84);
      put(new CurrencyPair("GUE", "LTC"), 242);
      put(new CurrencyPair("IFC", "LTC"), 60);
      put(new CurrencyPair("KARM", "LTC"), 193);
      put(new CurrencyPair("LEAF", "LTC"), 245);
      put(new CurrencyPair("LOT", "LTC"), 243);
      put(new CurrencyPair("LTCX", "LTC"), 234);
      put(new CurrencyPair("MAX", "LTC"), 218);
      put(new CurrencyPair("MEC", "LTC"), 100);
      put(new CurrencyPair("MEM", "LTC"), 56);
      put(new CurrencyPair("MEOW", "LTC"), 231);
      put(new CurrencyPair("MOON", "LTC"), 145);
      put(new CurrencyPair("MST", "LTC"), 62);
      put(new CurrencyPair("NET", "LTC"), 108);
      put(new CurrencyPair("NXT", "LTC"), 162);
      put(new CurrencyPair("NYAN", "LTC"), 263);
      put(new CurrencyPair("PPC", "LTC"), 125);
      put(new CurrencyPair("PXC", "LTC"), 101);
      put(new CurrencyPair("QRK", "LTC"), 126);
      put(new CurrencyPair("RBBT", "LTC"), 190);
      put(new CurrencyPair("RDD", "LTC"), 212);
      put(new CurrencyPair("RED", "LTC"), 87);
      put(new CurrencyPair("RZR", "LTC"), 238);
      put(new CurrencyPair("SBC", "LTC"), 128);
      put(new CurrencyPair("SUPER", "LTC"), 240);
      put(new CurrencyPair("SXC", "LTC"), 98);
      put(new CurrencyPair("TES", "LTC"), 224);
      put(new CurrencyPair("TIPS", "LTC"), 147);
      put(new CurrencyPair("TIX", "LTC"), 107);
      put(new CurrencyPair("VRC", "LTC"), 215);
      put(new CurrencyPair("VTC", "LTC"), 217);
      put(new CurrencyPair("WDC", "LTC"), 21);
      put(new CurrencyPair("XC", "LTC"), 216);
      put(new CurrencyPair("XNC", "LTC"), 67);
      put(new CurrencyPair("XPM", "LTC"), 106);
      put(new CurrencyPair("YAC", "LTC"), 22);
      put(new CurrencyPair("ZEIT", "LTC"), 176);
      put(new CurrencyPair("ZET", "LTC"), 127);
      put(new CurrencyPair("BTC", "USD"), 2);
      put(new CurrencyPair("DOGE", "USD"), 182);
      put(new CurrencyPair("DRK", "USD"), 213);
      put(new CurrencyPair("FTC", "USD"), 6);
      put(new CurrencyPair("LTC", "USD"), 1);
      put(new CurrencyPair("RDD", "USD"), 262);
      put(new CurrencyPair("BTC", "EUR"), 478);
    }
  };

  /**
   * Converts a CurrencyPair (in form Base_Counter) to the appropriate marketId
   *
   * @param currencyPair String CurrencyPair in form (Base_Counter)
   * @return int representation of marketId
   */
  public static int convertToMarketId(CurrencyPair currencyPair) {

    return currencyPairs_MarketIds.get(currencyPair);
  }

  /**
   * Converts a int marketId to the appropriate CurrencyPair
   * 
   * @param marketId int representation of marketId
   * @return CurrencyPair used by that of that market
   */
  public static CurrencyPair convertToCurrencyPair(int marketId) {

    CurrencyPair currencyPairs = marketIds_CurrencyPairs.get(marketId);

    return (currencyPairs == null ? new CurrencyPair("null", "null") : currencyPairs);
  }
}
