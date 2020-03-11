package com.javarush.task.task04.task0434;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int w = 1, h = 1;

        while (w <= 10){
            while (h < 10){
                System.out.print(h*w + " ");
                h++;

            }
            System.out.println(h*w + " ");
            w++;
            h = 1;
        }

    }
}
