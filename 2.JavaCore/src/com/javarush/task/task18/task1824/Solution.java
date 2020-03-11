package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileInputStream fileInputStream;
        boolean isTrue = true;
        while (isTrue) {
            String fileName = scanner.nextLine();
            try {
                fileInputStream = new FileInputStream(fileName);
                fileInputStream.close();
            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                scanner.close();
                break;
            }
        }

    }
}
