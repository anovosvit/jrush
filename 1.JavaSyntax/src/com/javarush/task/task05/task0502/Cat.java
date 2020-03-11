package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Cat anotherCat) {
        int cat1pts = 0, cat2pts = 0;
        if (this.age > anotherCat.age) cat1pts++; else if (this.age < anotherCat.age) cat2pts++;
        if (this.weight > anotherCat.weight)  cat1pts++; else if (this.weight < anotherCat.weight) cat2pts++;
        if (this.strength > anotherCat.strength)  cat1pts++; else if (this.strength < anotherCat.strength) cat2pts++;

        return cat1pts > cat2pts;
    }

    public static void main(String[] args) {
        Cat baska = new Cat();
        baska.age = 4;
        baska.weight = 3;
        baska.strength = 10;
        Cat businka = new Cat();
        businka.age = 4;
        businka.weight = 3;
        businka.strength = 10;

        baska.fight(businka);
 
    }
}
