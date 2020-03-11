package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Сергеев", 100);
        map.put("Иванов", 200);
        map.put("Стаханов", 300);
        map.put("Сталин", 400);
        map.put("Куриев", 500);
        map.put("Сколов", 600);
        map.put("Воробев", 700);
        map.put("Сергеева", 800);
        map.put("Глодин", 900);
        map.put("Кинг", 1000);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        HashMap<String, Integer> copy = new HashMap<String, Integer>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500)
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}