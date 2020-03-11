package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{

        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }


        @Override
        public Person read() throws IOException {
            String[] pers = fileScanner.nextLine().split(" ", 4);
            String lastName = pers[0];
            String firstName = pers[1];
            String middleName = pers[2];
            String d = pers[3];

            SimpleDateFormat dateFormat = new SimpleDateFormat("d M y", Locale.ENGLISH );
            Date date = new Date();
            try {
                date = dateFormat.parse(d);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            return new Person(firstName, middleName, lastName, date);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
