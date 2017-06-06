package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран частоту встречания пробела. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new FileReader(args[0]));

        String tmp = "";
        int countSpace = 0;
        int countChars = 0;
        char[] chBuff = null;
        boolean first = false;

        while ((tmp = reader.readLine()) != null) {
            if (first){
                countChars += 2;
            }
            first = true;
            chBuff = tmp.toCharArray();
            for (int i = 0; i < chBuff.length; i++)
            {
                if (chBuff[i] == ' '){
                    countSpace++;
                }
                countChars++;
            }
        }
        reader.close();
        double result = (countSpace / (double)countChars) * 100;
        System.out.println(String.format("%.2f", result));




    }
}
