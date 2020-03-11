package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human ded1 = new Human("Tolya", true, 69);
        Human bab1 = new Human("Tanya", false, 68);
        Human ded2 = new Human("Vanya", true, 67);
        Human bab2 = new Human("Klava", false, 67);
        Human papa = new Human("Lesha", true, 45, ded1, bab1);
        Human mama = new Human("Sveta", false, 43, ded2, bab2);
        Human kid1 = new Human("Alyona", false, 23, papa, mama);
        Human kid2 = new Human("Andrey", true, 19, papa, mama);
        Human kid3 = new Human("Rex", true, 13, papa, mama);

        System.out.println(ded1);
        System.out.println(bab1);
        System.out.println(ded2);
        System.out.println(bab2);
        System.out.println(papa);
        System.out.println(mama);
        System.out.println(kid1);
        System.out.println(kid2);
        System.out.println(kid3);
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human  mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}