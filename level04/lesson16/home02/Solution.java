package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sDigOne = reader.readLine();
        String sDigTwo = reader.readLine();
        String sDigThree = reader.readLine();

        int iDigOne = Integer.parseInt(sDigOne);
        int iDigTwo = Integer.parseInt(sDigTwo);
        int iDigThree = Integer.parseInt(sDigThree);

        int iAverage = 0;

        if (iDigOne > iDigTwo && iDigOne < iDigThree){
            iAverage = iDigOne;
        } else if (iDigTwo > iDigOne && iDigTwo < iDigThree){
            iAverage = iDigTwo;
        } else {
            if (iDigOne < iDigTwo)
            {
                if (iDigOne > iDigThree)
                {
                    iAverage = iDigOne;
                } else {
                    if (iDigTwo > iDigThree){
                        iAverage = iDigThree;
                    } else
                    {
                        iAverage = iDigTwo;
                    }
                }
            }
            else {
                if (iDigTwo < iDigThree){
                    iAverage = iDigThree;
                } else {
                    iAverage = iDigTwo;
                }
            }
        }

        System.out.println(iAverage);




    }
}
