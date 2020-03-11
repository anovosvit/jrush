package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<String, Double> treeMap = new TreeMap<String, Double>();

        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        while (fileReader.ready()){
            String[] tmp = fileReader.readLine().split(" ", 2);
            String name = tmp[0];
            double value = Double.parseDouble(tmp[1]);

            if (treeMap.containsKey(name)){
                double money = treeMap.get(name);
                money += value;
                treeMap.put(name, money);
            }
            else {
                treeMap.put(name, value);
            }
        }

        for (Map.Entry<String, Double> entry : treeMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        fileReader.close();
    }
}
