package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName1 = scanner.nextLine();
        String fileName2 = scanner.nextLine();
        scanner.close();

        FileInputStream fileInputStream1 = new FileInputStream(fileName1);
        FileOutputStream fileOutputStream2 = new FileOutputStream(fileName2);

        while (fileInputStream1.available() > 0) {
            byte[] file1 = new byte[fileInputStream1.available()];
            fileInputStream1.read(file1);

            String[] strArrDouble = new String(file1).split(" ");
            StringBuilder resultStrLong = new StringBuilder(file1.length);

            for (String strArr : strArrDouble) {
                resultStrLong.append(Math.round(Double.valueOf(strArr)));
                resultStrLong.append(" ");
            }
            fileOutputStream2.write(resultStrLong.toString().getBytes());
        }
        fileInputStream1.close();
        fileOutputStream2.close();

    }
}
