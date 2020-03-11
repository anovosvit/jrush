package com.javarush.task.task33.task3310.tests;

import com.javarush.task.task33.task3310.Helper;
import com.javarush.task.task33.task3310.Shortener;
import com.javarush.task.task33.task3310.strategy.*;
import org.junit.Assert;
import org.junit.Test;

public class FunctionalTest {

    public void testStorage(Shortener shortener){
        String firstString = Helper.generateRandomString();
        String secondString = Helper.generateRandomString();
        String thirdString = firstString;

        long firstId = shortener.getId(firstString);
        long secondId = shortener.getId(secondString);
        long thirdId = shortener.getId(thirdString);

        Assert.assertNotEquals(secondId, firstId);
        Assert.assertNotEquals(secondId, thirdId);
        Assert.assertEquals(firstId, thirdId);

        String s1 = shortener.getString(firstId);
        String s2 = shortener.getString(secondId);
        String s3 = shortener.getString(thirdId);

        Assert.assertEquals(s1, firstString);
        Assert.assertEquals(s2, secondString);
        Assert.assertEquals(s3, thirdString);
    }

    @Test
    public void testHashMapStorageStrategy() {
        Shortener shortener = new Shortener(new HashMapStorageStrategy());
        testStorage(shortener);
    }

    @Test
    public void testOurHashMapStorageStrategy() {
        Shortener shortener = new Shortener(new OurHashMapStorageStrategy());
        testStorage(shortener);
    }

    @Test
    public void testFileStorageStrategy() {
        Shortener shortener = new Shortener(new FileStorageStrategy());
        testStorage(shortener);
    }

    @Test
    public void testHashBiMapStorageStrategy() {
        Shortener shortener = new Shortener(new HashBiMapStorageStrategy());
        testStorage(shortener);
    }

    @Test
    public void testDualHashBidiMapStorageStrategy() {
        Shortener shortener = new Shortener(new DualHashBidiMapStorageStrategy());
        testStorage(shortener);
    }

    @Test
    public void testOurHashBiMapStorageStrategy() {
        Shortener shortener = new Shortener(new OurHashBiMapStorageStrategy());
        testStorage(shortener);
    }
}
