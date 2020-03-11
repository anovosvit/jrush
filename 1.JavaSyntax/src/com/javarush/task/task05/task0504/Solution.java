package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat baska = new Cat("Baska", 10, 7, 10);
        Cat businka = new Cat("Businka", 5, 3, 6);
        Cat migrenchicl = new Cat("Migresha", 6, 2, 9);


    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}