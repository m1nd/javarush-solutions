package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sDigOne = reader.readLine();
        String sDigTwo = reader.readLine();
        int iDigOne = Integer.parseInt(sDigOne);
        int iDigTwo = Integer.parseInt(sDigTwo);
        if (iDigOne > iDigTwo) {
            System.out.println(iDigTwo);
        } else {
            System.out.println(iDigOne);
        }

    }
}