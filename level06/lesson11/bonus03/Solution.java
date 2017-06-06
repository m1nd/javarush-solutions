package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void sort(int a, int b, int c, int d, int e){
        if (a>b){
            sort(b,a,c,d,e);
            return;
        }
        if (b>c)
        {
            sort(a, c, b, d, e);
            return;
        }
        if (c>d)
        {
            sort(a,b,d,c,e);
            return;
        }
        if (d>e)
        {
            sort(a,b,c,e,d);
            return;
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

    }

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        sort(a, b, c, d, e);
    }
}
