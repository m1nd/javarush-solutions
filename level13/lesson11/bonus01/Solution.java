package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        String line = "";
        List<Integer> list = new ArrayList<Integer>();

        while ((line = fileReader.readLine()) != null){
            list.add(Integer.parseInt(line));
        }

        reader.close();
        fileReader.close();

        for (int i = 0; i < list.size() - 1; i++){
           for (int j = 0; j < list.size() - i - 1; j++){
               if ( list.get(j) > list.get(j + 1) ){
                   int tmp = list.get(j);
                   list.set(j, list.get(j + 1));
                   list.set(j+1, tmp);
               }
           }
        }

        for (Integer dig : list){
            if (dig % 2 == 0){
                System.out.println(dig);
            }
        }

    }


}
