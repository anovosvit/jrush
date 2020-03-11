package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        Integer a = 0;
        try {
            while (a != (Integer) null) {
                a = scanner.nextInt();
                list.add(a);
            }
        }
        catch (InputMismatchException e){
            for (int i = 0; i < list.size(); i++){
                System.out.println(list.get(i));
            }

        }
    }
}
