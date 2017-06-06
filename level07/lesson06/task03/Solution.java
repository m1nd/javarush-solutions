package com.javarush.test.level07.lesson06.task03;

/* 5 строчек в обратном порядке
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в него.
3. Расположи их в обратном порядке.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int size = 5;
        int j = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> reversList = new ArrayList<String>();

        for (int i = 0; i < size; i++){
            list.add(i, reader.readLine());
        }

        for (int i = list.size() - 1; i >= 0; i--){
            reversList.add(j, list.get(i));
            j++;
        }

        for (int i = 0; i < reversList.size(); i++){
            System.out.println(reversList.get(i));
        }

    }
}
