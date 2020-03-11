package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        //напишите тут ваш код
        int sum = a + b;
        return sum;
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        int min = a - b;
        return min;
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        int mul = a * b;
        return mul;
    }

    public static double division(int a, int b) {
        //напишите тут ваш код
        double d = (double) a / b;
        return d;
    }

    public static double percent(int a, int b) {
        //напишите тут ваш код
        double per = (double) b*a/100.0;
        return per;
    }

    public static void main(String[] args) {

    }
}