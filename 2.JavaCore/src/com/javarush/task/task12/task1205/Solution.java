package com.javarush.task.task12.task1205;

/* 
Определимся с животным
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //Напишите тут ваше решение
        String r = "";
        if (o instanceof Cow){
            r =  "Корова";
        }
        if (o instanceof Dog){
            r=  "Собака";
        }
        if (o instanceof Whale){
            r =  "Кит";
        }
        if (o instanceof Pig){
            r = "Неизвестное животное";
        }
        return r;
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
