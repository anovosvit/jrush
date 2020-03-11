package com.javarush.task.task08.task0801;

/* 
Set из растений
*/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Set<String> a = new HashSet<String>();
        a.add("арбуз");
        a.add("банан");
        a.add("вишня");
        a.add("груша");
        a.add("дыня");
        a.add("ежевика");
        a.add("женьшень");
        a.add("земляника");
        a.add("ирис");
        a.add("картофель");

        for (String b : a){
            System.out.println(b);
        }

    }
}