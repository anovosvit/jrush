package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<String, Double> map = new TreeMap<String, Double>();

        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        double max = Double.MIN_VALUE;
        while (reader.ready()){
            String[] tmp = reader.readLine().split(" ", 2);
            String name = tmp[0];
            Double value = Double.parseDouble(tmp[1]);

            if (map.containsKey(name)){
                double money = map.get(name);
                money += value;
                map.put(name, money);
            }
            else {
                map.put(name, value);
            }
        }

        reader.close();

        for (Map.Entry<String,Double> pair : map.entrySet())
        {
            max = Math.max(max,pair.getValue());
        }
        for (Map.Entry<String,Double> pair : map.entrySet())
        {
            if (pair.getValue().equals(max)) System.out.println(pair.getKey());
        }
    }
}
