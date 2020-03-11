package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        return str;
    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        return a;
    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble();
        return d;
    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String b = scanner.nextLine();
        boolean a = Boolean.parseBoolean(b);
        return a;

    }

    public static void main(String[] args) throws Exception {

    }
}
