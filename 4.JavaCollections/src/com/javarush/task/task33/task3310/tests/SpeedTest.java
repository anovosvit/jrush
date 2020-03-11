package com.javarush.task.task33.task3310.tests;

import com.javarush.task.task33.task3310.Helper;
import com.javarush.task.task33.task3310.Shortener;
import com.javarush.task.task33.task3310.strategy.HashBiMapStorageStrategy;
import com.javarush.task.task33.task3310.strategy.HashMapStorageStrategy;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class SpeedTest {

    public long getTimeToGetIds(Shortener shortener, Set<String> strings, Set<Long> ids) {
        Date startTime = new Date();
        for (String s : strings){
            ids.add(shortener.getId(s));
        }
        Date endTime = new Date();

        long result = endTime.getTime() - startTime.getTime();
        return result;
    }

    public long getTimeToGetStrings(Shortener shortener, Set<Long> ids, Set<String> strings) {
        Date startTime = new Date();
        for (Long l : ids){
            strings.add(shortener.getString(l));
        }
        Date endTime = new Date();

        long result = endTime.getTime() - startTime.getTime();
        return result;
    }

    @Test
    public void testHashMapStorage() {
        Shortener shortener1 = new Shortener(new HashMapStorageStrategy());
        Shortener shortener2 = new Shortener(new HashBiMapStorageStrategy());

        Set<String> origStrings = new HashSet<>();
        Set<Long> idsHashMapStorageStrategy = new HashSet<>();
        Set<Long> idsHashBiMapStorageStrategy = new HashSet<>();

        for (int i = 0; i < 10000; i++) {
            origStrings.add(Helper.generateRandomString());
        }

        Long idsTime1 = getTimeToGetIds(shortener1, origStrings, idsHashMapStorageStrategy);
        Long idsTime2 = getTimeToGetIds(shortener2, origStrings, idsHashBiMapStorageStrategy);
        Assert.assertTrue(idsTime1 > idsTime2);

        Set<String> stringsHashMapStorageStrategy = new HashSet<>();
        Set<String> stringsHashBiMapStorageStrategy = new HashSet<>();

        Long stringsTime1 = getTimeToGetStrings(shortener1, idsHashMapStorageStrategy, stringsHashMapStorageStrategy);
        Long stringsTime2 = getTimeToGetStrings(shortener2, idsHashBiMapStorageStrategy, stringsHashBiMapStorageStrategy);
        Assert.assertEquals(stringsTime1, stringsTime2, 30f);
    }

}
