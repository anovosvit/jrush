package com.javarush.task.task18.task1801;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        scanner.close();

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        FileInputStream reader = new FileInputStream(fileName);
        while (reader.available() > 0){
            arrayList.add(reader.read());
        }
        reader.close();

        int max = Integer.MIN_VALUE;

        for (int a : arrayList){
            if (max < a){
                max = a;
            }
        }
        System.out.println(max);
    }
}
