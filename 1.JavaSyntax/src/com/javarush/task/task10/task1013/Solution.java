package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String firstName;
        private String secondName;
        private int age;
        private int weight;
        private int height;
        private String petName;

        public Human(){}

        public Human(String firstName){
            this.firstName = firstName;
        }

        public Human(int age){
            this.age = age;
        }

        public Human (String firstName, String secondName){
            this.firstName = firstName;
            this.secondName = secondName;
        }

        public Human(String firstName, int age){
            this.firstName = firstName;
            this.age = age;
        }

        public Human (String firstName, String secondName, int age){
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
        }

        public Human(String firstName, String secondName, int age, int weight, int height, String petName){
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.petName = petName;
        }

        public Human(String firstName, String secondName, int age, int weight, int height){
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }
        public Human(String firstName, String secondName, int age, int weight){
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
            this.weight = weight;
        }
        public Human(String firstName, String secondName, int age, String petName){
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
            this.petName = petName;
        }



    }
}
