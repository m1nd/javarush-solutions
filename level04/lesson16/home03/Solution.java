package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sDig = reader.readLine();
        int iDig = Integer.parseInt(sDig);
        int sum = 0;

        while(iDig != -1){
            sum = sum + iDig;
            sDig = reader.readLine();
            iDig = Integer.parseInt(sDig);
        }
        System.out.println(sum-1);
    }
}
