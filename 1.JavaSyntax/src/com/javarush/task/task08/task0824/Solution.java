package com.javarush.task.task08.task0824;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {

        Human kid1 = new Human("Alyona", false, 23);
        Human kid2 = new Human("Andrey", true, 19);
        Human kid3 = new Human("Rex", true, 13);
        Human papa = new Human("Alex", true, 45, kid1, kid2, kid3);
        Human mama = new Human("Sveta", false, 43, kid1, kid2, kid3);
        Human ded1 = new Human("Tolya", true, 68, papa);
        Human ded2 = new Human("Vanya", true, 67, mama);
        Human bab1 = new Human("Tanya", false, 67, papa);
        Human bab2 = new Human("Klava", false, 66, mama);

        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(bab1);
        System.out.println(bab2);
        System.out.println(papa);
        System.out.println(mama);
        System.out.println(kid1);
        System.out.println(kid2);
        System.out.println(kid3);
        //напишите тут ваш код
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();
        //напишите тут ваш код

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human child1){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.add(child1);
        }

        public Human(String name, boolean sex, int age, Human child1, Human child2, Human child3){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.add(child1);
            this.children.add(child2);
            this.children.add(child3);
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;

        }
    }
}
