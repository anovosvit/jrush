package com.javarush.task.task04.task0439;

/* 
Письмо счастья
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        for (int i = 0; i < 10; i ++){
            System.out.println(str + " любит меня.");
        }

    }
}
