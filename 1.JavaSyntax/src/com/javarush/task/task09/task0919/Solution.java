package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

import java.security.AlgorithmConstraints;

public class Solution {

    public static void main(String[] args) {
        try{
            divideByZero();
        }
        catch (ArithmeticException e){

//            System.out.println(e.getMessage() + " ");
            e.printStackTrace();
        }
    }

    public static void divideByZero(){
        int a = 5, b = 0;
        int c = 5 / 0;
        System.out.println(c);
    }

}
