package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String strDate = reader.readLine();
        String formatDate = strDate.toUpperCase() + " 01 2000";

        Date date = new Date(formatDate);
        int iMonth = date.getMonth() + 1;
        System.out.println(strDate + " is " + iMonth + " month");
    }

}
