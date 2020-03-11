package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("123");
        arrayList.add("321");
        arrayList.add("3213");
        arrayList.add("321323");
        arrayList.add("dsdsdss");

        System.out.println(arrayList.size());

        for(int i = 0; i < 5; i++){
            System.out.println(arrayList.get(i));
        }

    }
}
