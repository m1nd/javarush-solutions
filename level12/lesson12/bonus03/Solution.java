package com.javarush.test.level12.lesson12.bonus03;

/* Задача по алгоритмам
Написать метод, который возвращает минимальное число в массиве и его позицию (индекс).
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("Minimum is " + result.x);
        System.out.println("Index of minimum element is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array)
    {
        Pair<Integer, Integer> pairArray = new Pair<Integer, Integer>(0, 0);
        if (array == null || array.length == 0)
        {
            return new Pair<Integer, Integer>(null, null);
        }

        for (int i = 0; i < array.length; i++){
            if (array[i] < pairArray.x){
                int temp = pairArray.x;
                pairArray.x = array[i];
                array[i] = temp;
                pairArray.y = i;
            }
        }

        return pairArray;
    }


    public static class Pair<X, Y>
    {
        public X x;
        public Y y;

        public Pair(X x, Y y)
        {
            this.x = x;
            this.y = y;
        }
    }
}
