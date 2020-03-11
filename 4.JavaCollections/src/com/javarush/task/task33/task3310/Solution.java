package com.javarush.task.task33.task3310;

import com.javarush.task.task33.task3310.strategy.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static Set<Long> getIds(Shortener shortener, Set<String> strings){
        Set<Long> keys = new HashSet<>(strings.size());
        for (String s : strings){
            keys.add(shortener.getId(s));
        }
        return keys;
    }

    public static Set<String> getStrings(Shortener shortener, Set<Long> keys){
        Set<String> strings = new HashSet<>();
        for (Long l : keys){
            strings.add(shortener.getString(l));
        }
        return strings;
    }

    public static void testStrategy(StorageStrategy strategy, long elementsNumber){
        Helper.printMessage("Classname: " + strategy.getClass().getSimpleName());
        Set<String> testStrings = new HashSet<>();
        for (int i = 0; i < elementsNumber; i++){
            testStrings.add(Helper.generateRandomString());
        }

        Shortener shortener = new Shortener(strategy);
        Date startTime = new Date();
        Set<Long> testKeys = getIds(shortener, testStrings);
        Date endTime = new Date();

        long resultTime = endTime.getTime() - startTime.getTime();
        Helper.printMessage("Time for getIds: " + resultTime + "(ms)");

        startTime = new Date();
        Set<String> stringGenerate = getStrings(shortener, testKeys);
        endTime = new Date();

        resultTime = endTime.getTime() - startTime.getTime();
        Helper.printMessage("Time for getStrings: " + resultTime + "(ms)");

        if (testStrings.equals(stringGenerate)){
            Helper.printMessage("Тест пройден.");
        }
        else
            Helper.printMessage("Тест не пройден.");
    }

    public static void main(String[] args) {
        testStrategy(new HashMapStorageStrategy(), 10000);
        System.out.println("");

        testStrategy(new OurHashMapStorageStrategy(), 10000);
        System.out.println("");

        testStrategy(new OurHashMapStorageStrategy(), 10000);
        System.out.println("");

        testStrategy(new OurHashBiMapStorageStrategy(), 10000);
        System.out.println("");

        testStrategy(new HashBiMapStorageStrategy(), 10000);
        System.out.println("");

        testStrategy(new DualHashBidiMapStorageStrategy(), 10000);
    }


}
