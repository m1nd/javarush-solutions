package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int maximum = Integer.MIN_VALUE;
        int dig = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        if (n > 0)
        {
            for (int i = 0; i < n; i++)
            {
                dig = Integer.parseInt(reader.readLine());
                maximum = max(maximum, dig);
            }

            System.out.println(maximum);
        }
    }

    public static int max(int a, int b)
    {
        return a > b ? a : b;
    }
}
