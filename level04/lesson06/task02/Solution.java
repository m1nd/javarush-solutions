package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int maxOne = 0;
        int maxTwo = 0;


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sDigOne = reader.readLine();
        String sDigTwo = reader.readLine();
        String sDigThree = reader.readLine();
        String sDigFour = reader.readLine();

        int iDigOne = Integer.parseInt(sDigOne);
        int iDigTwo = Integer.parseInt(sDigTwo);
        int iDigThree = Integer.parseInt(sDigThree);
        int iDigFour = Integer.parseInt(sDigFour);

        if (iDigOne > iDigTwo) {
            maxOne = iDigOne;
        } else {
            maxOne = iDigTwo;
        }

        if (iDigThree > iDigFour) {
            maxTwo = iDigThree;
        } else {
            maxTwo = iDigFour;
        }

        if (maxOne > maxTwo) {
            System.out.println(maxOne);
        } else {
            System.out.println(maxTwo);
        }


    }
}
