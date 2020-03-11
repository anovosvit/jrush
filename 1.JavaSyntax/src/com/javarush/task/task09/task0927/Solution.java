package com.javarush.task.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map<String, Cat> map = new HashMap<String, Cat>();
        Cat cat = new Cat("Cat");
        Cat baska = new Cat("Baska");
        Cat businka = new Cat("Businka");
        Cat kebabchik = new Cat("Kebabchik");
        Cat cat1 = new Cat("Cat1");
        Cat cat2 = new Cat("Cat2");
        Cat cat3 = new Cat("Cat3");
        Cat cat4 = new Cat("Cat4");
        Cat cat5 = new Cat("Cat5");
        Cat cat6 = new Cat("Cat6");

        map.put("1", cat);
        map.put("2", cat1);
        map.put("3", cat3);
        map.put("4", cat4);
        map.put("5", cat5);
        map.put("6", cat6);
        map.put("7", baska);
        map.put("8", businka);
        map.put("9", kebabchik);
        map.put("10", cat2);

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> set = new HashSet<Cat>();
        set.addAll(map.values());
//        for (int i = 0; i < map.size(); i++){
//            Cat a = map.get(i);
//            System.out.println(map.values());
//            set.add(a);
//        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
