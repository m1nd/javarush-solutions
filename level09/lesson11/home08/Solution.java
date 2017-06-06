package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;
import java.util.List;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        ArrayList<int[]> list = new ArrayList<int[]>();
        int[] arrayOne = {1, 2, 3, 4, 5};
        int[] arrayTwo = {6, 7};
        int[] arrayThree = {8, 9, 10, 11};
        int[] arrayFour = {12,13,14,15,16,17,18};
        int[] arrayFive = new int[0];

        list.add(arrayOne);
        list.add(arrayTwo);
        list.add(arrayThree);
        list.add(arrayFour);
        list.add(arrayFive);

        return list;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
