package com.javarush.task.task33.task3308;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    public Goods goods;
    public int count;
    public double profit;
    public String[] secretData;

    public Shop() {
    }

    private static class Goods {
        List<String> names = new ArrayList<>();
    }
}
