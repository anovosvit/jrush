package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static class Cat{
//        String name;

        public Cat(){
//            this.name = name;
        }
    }

    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3
        Iterator it = cats.iterator();
        if (it.hasNext())
            cats.remove(it.next());


        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> kitty = new HashSet<Cat>();
        for (int i = 0; i < 3; i++){
            Cat cat = new Cat();
            kitty.add(cat);
        }
        return kitty;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat cat : cats)
        {
            System.out.println(cat);
        }
    }

    // step 1 - пункт 1
}
