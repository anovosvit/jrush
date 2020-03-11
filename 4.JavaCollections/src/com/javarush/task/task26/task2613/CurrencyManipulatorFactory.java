package com.javarush.task.task26.task2613;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CurrencyManipulatorFactory {
    private static Map<String, CurrencyManipulator> map = new HashMap<>();;

    public static CurrencyManipulator getManipulatorByCurrencyCode(String currencyCode) {
        if (map.containsKey(currencyCode.toLowerCase())) {
            return map.get(currencyCode.toLowerCase());
        } else {
            CurrencyManipulator cur = new CurrencyManipulator(currencyCode.toLowerCase());
            map.put(currencyCode.toLowerCase(), cur);
            return cur;
        }
    }

    public static Collection<CurrencyManipulator> getAllCurrencyManipulators() {
        return map.values();
    }

    private CurrencyManipulatorFactory() {

    }
}
