package com.javarush.task.task12.task1224;

/* 
Неведома зверушка
*/

import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //напишите тут ваш код

        String r ="";
        if (o instanceof Cat){
            r = "Кот";
        }
        else if (o instanceof Tiger){
            r = "Тигр";
        }
        else if (o instanceof Lion){
            r = "Лев";
        }
        else if (o instanceof Bull){
            r = "Бык";
        }
        else {
            r = "Животное";
        }

        return r;
    }

    public static class Cat {

    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
