package com.javarush.task.task04.task0443;

/* 
Как назвали, так назвали
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String y = scanner.nextLine();
        String m = scanner.nextLine();
        String d = scanner.nextLine();

        System.out.println("Меня зовут " + name +".");
        System.out.println("Я родился " + d + "." + m + "." + y);

    }
}
