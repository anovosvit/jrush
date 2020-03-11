package com.javarush.task.task18.task1805;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        scanner.close();

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int tmp;

        FileInputStream reader = new FileInputStream(fileName);
        while (reader.available() > 0){
            tmp = reader.read();
            if (!arrayList.contains(tmp)){
                arrayList.add(tmp);
            }
        }
        reader.close();

        Collections.sort(arrayList);

        for (int a : arrayList){
            System.out.print(a + " ");
        }
    }
}
