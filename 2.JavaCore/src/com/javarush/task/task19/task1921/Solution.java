package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));

        ArrayList<String> personList = new ArrayList<String>();

        while (reader.ready()){
            String line = reader.readLine();
            personList.add(line);
        }

        reader.close();

        SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy");

        for (int i = 0; i < personList.size(); i++){
            String personName = personList.get(i).replaceAll("\\d", "").trim();
            Date personBirthDate = format.parse(personList.get(i).replace(personName, ""));
            Person person = new Person(personName, personBirthDate);
            PEOPLE.add(person);
        }
    }
}
