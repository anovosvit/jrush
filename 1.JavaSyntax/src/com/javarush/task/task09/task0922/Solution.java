package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Month;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        Date dat = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM d, y", Locale.ENGLISH);
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        System.out.println(simpleDateFormat.format(date.parse(a)).toUpperCase());
    }
}