package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName = null;
        boolean isTrue = true;
        FileInputStream fileInputStream;

        while (isTrue){
            fileName = scanner.nextLine();
            fileInputStream = new FileInputStream(fileName);
            if (fileInputStream.available() < 1000){
                isTrue = false;
                scanner.close();
                fileInputStream.close();
                throw new DownloadException();
            }
        }

    }

    public static class DownloadException extends Exception {

    }
}
