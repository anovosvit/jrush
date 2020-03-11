package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandPaName = reader.readLine();
        Cat catGrPa = new Cat(grandPaName, null, null);

        String grandMaName = reader.readLine();
        Cat catGrMa = new Cat(grandMaName, null, null);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catGrPa);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrMa, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrPa);
        System.out.println(catGrMa);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString()
        {
            if (mother == null && father == null)
                return "The cat's name is " + name + ", no mother, no father";
            if (mother == null)
                return "The cat's name is " + name + ", no mother, father is " + father.name;
            if (father == null)
                return "The cat's name is " + name + ", mother is " + mother.name + ", no father";
            else
                return "The cat's name is " + name + ", mother is " + mother.name + ", father is " + father.name;
        }
    }

}
