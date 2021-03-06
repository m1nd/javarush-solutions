package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String tmp = "";
        String chStr = "";
        int count = 0;
        while ((tmp = reader.readLine()) != null) {
            for (int i = 0; i < tmp.length(); i++)
            {
                chStr = tmp.substring(i, i+1).toLowerCase();
                if (chStr.matches("[a-z]")){
                    count++;
                }
            }
        }
        reader.close();
        System.out.println(count);

    }
}
