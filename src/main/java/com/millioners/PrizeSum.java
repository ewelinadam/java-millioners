package com.millioners;

import java.util.HashMap;
import java.util.Map;

public class PrizeSum {
    private static Map<Integer, String> prizeValues;

    static {
        prizeValues = new HashMap<>();
        prizeValues.put(0, "Pzegrywasz :-(");
        prizeValues.put(1, "Wygrałeś 1 000 zł !");
        prizeValues.put(2, "Wygrałeś 10 000 zł !");
        prizeValues.put(3, "Wygrałeś 50 000 zł !");
        prizeValues.put(4, "Wygrałeś 100 000 zł !");
        prizeValues.put(5, "Wygrałeś 500 000 zł !");
        prizeValues.put(6, "Wygrałeś 1 000 000 zł !");
    }

    public static Map<Integer, String> prizeValues() {
        return prizeValues;
    }

}
