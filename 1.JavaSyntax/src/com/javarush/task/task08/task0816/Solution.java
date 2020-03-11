package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Кинг", dateFormat.parse("MARCH 2 2011"));
        map.put("Хокинг", dateFormat.parse("OCTOBER 3 2010"));
        map.put("Хичкок", dateFormat.parse("DECEMBER 4 2010"));
        map.put("Ди Каприо", dateFormat.parse("AUGUST 5 2012"));
        map.put("Смит", dateFormat.parse("JANUARY 6 2013"));
        map.put("Джоли", dateFormat.parse("MAY 7 2014"));
        map.put("Пит", dateFormat.parse("MARCH 8 2015"));
        map.put("Селлинджер", dateFormat.parse("APRIL 9 2016"));
        map.put("Йохансон", dateFormat.parse("APRIL 10 2017"));

        return map;

        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            int month = iterator.next().getValue().getMonth() + 1;
            if (6 <= month && month <= 8) {
                iterator.remove();
            }

        }
    }

    public static void main (String[] args) {

        }
    }