package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = reader.readLine();

        //тут цикл по чтению ключей, пункт 1
        while ((key.equals("user")) || (key.equals("loser")) || (key.equals("coder")) || (key.equals("proger")))
        {
            if (key.equals("user")) {
                //создаем объект, пункт 2
                person = new Person.User();
            }
            if (key.equals("loser")) {
                //создаем объект, пункт 2
                person = new Person.Loser();
            }
            if (key.equals("coder")) {
                //создаем объект, пункт 2
                person = new Person.Coder();
            }
            if (key.equals("proger")) {
                //создаем объект, пункт 2
                person = new Person.Proger();
            }

            doWork(person); //вызываем doWork
            key = reader.readLine();
        }
    }


    public static void doWork(Person person) {
        // пункт 3
        if (person instanceof Person.User)
            ((Person.User) person).live();
        else if (person instanceof Person.Loser)
            ((Person.Loser) person).doNothing();
        else if (person instanceof Person.Coder)
            ((Person.Coder) person).writeCode();
        else if (person instanceof Person.Proger)
            ((Person.Proger) person).enjoy();
    }
}
