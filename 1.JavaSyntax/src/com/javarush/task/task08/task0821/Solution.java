package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();
        map.put("Сергеев", "Антон");
        map.put("Иванов", "Петя");
        map.put("Стаханов", "Жора");
        map.put("Сталин", "Иосиф");
        map.put("Сергеев", "Артур");
        map.put("Сколов", "Антон");
        map.put("Воробев", "Станичлав");
        map.put("Сергеева", "Антон");
        map.put("Глодин", "Паша");
        map.put("Кинг", "Стивен");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
