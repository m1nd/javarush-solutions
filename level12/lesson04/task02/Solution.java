package com.javarush.test.level12.lesson04.task02;

/* print(int) и print(Integer)
Написать два метода: print(int) и print(Integer).
Написать такой код в методе main, чтобы вызвались они оба.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Integer valueOne = 5;
        int valueTwo = 6;

        print(valueOne);
        print(valueTwo);
    }

    public static void print(int value){};

    public static void print(Integer value){};

}
