package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int x = 1, y = 1;
        while (y <= 10)
        {
            while (x < 10)
            {
                System.out.print("S"); x++;
            }
            System.out.println("S"); y++; x=1;
        }

    }
}
