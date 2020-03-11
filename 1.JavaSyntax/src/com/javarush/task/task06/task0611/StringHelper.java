package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        int i = 5;
        while (i > 0){
            result += s;
            i--;
        }
        //напишите тут ваш код
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        //напишите тут ваш код
        while (count > 0){
            result += s;
            count--;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
