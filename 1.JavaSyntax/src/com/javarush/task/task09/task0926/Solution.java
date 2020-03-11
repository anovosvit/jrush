package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> arrayList = new ArrayList<int[]>(5);

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7};
        int[] c = {8, 9, 10, 11};
        int[] d = {12, 13, 14, 15, 16, 17, 18};
        int[] e = new int[0];

        arrayList.add(a);
        arrayList.add(b);
        arrayList.add(c);
        arrayList.add(d);
        arrayList.add(e);

        return arrayList;
        //напишите тут ваш код
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
