package com.javarush.test.level12.lesson04.task04;

/* Три метода возвращают минимальное из двух переданных в него чисел
Написать public static методы: int min(int, int), long min(long, long), double min(double, double).
Каждый метод должен возвращать минимальное из двух переданных в него чисел.
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public static int min(int valueOne, int valueTwo){

        return valueOne < valueTwo ? valueOne : valueTwo;
    }

    public static long min(long valueOne, long valueTwo){

        return valueOne < valueTwo ? valueOne : valueTwo;
    }

    public static double min(double valueOne, double valueTwo){

        return valueOne < valueTwo ? valueOne : valueTwo;
    }
}
