package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();
        int y = reader.nextInt();
        int z = reader.nextInt();
        if (x >= y && x >= z && y > z) {
            System.out.println(x + " " + y + " " + z);
        } else if (x >= y && z >= y && x >= z) {
            System.out.println(x + " " + z + " " + y);
        } else if (y >= x && y >= z && x >= z) {
            System.out.println(y + " " + x + " " + z);
        } else if (y >= x && y >= z && z >= x) {
            System.out.println(y + " " + z + " " + x);
        } else if (z >= x && z >= y && x >= y) {
            System.out.println(z + " " + x + " " + y);
        } else if (z >= x && z >= y && y >= x) {
            System.out.println(z + " " + y + " " + x);
        }


    }
}
