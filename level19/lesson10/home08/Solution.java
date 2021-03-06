package com.javarush.test.level19.lesson10.home08;

/* Перевертыши
1 Считать с консоли имя файла.
2 Для каждой строки в файле:
2.1 переставить все символы в обратном порядке
2.2 вывести на экран
3 Закрыть потоки. Не использовать try-with-resources

Пример тела входного файла:
я - программист.
Амиго

Пример результата:
.тсиммаргорп - я
огимА
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "";

        if ((fileName = reader.readLine()).equals("")){
            reader.close();
            return;
        }

        int dig = 0;
        boolean first = true;

        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "utf-8"));
        reader.close();

        while (fileReader.ready())
        {
            String data = "";
            if (!(data = fileReader.readLine()).equals(""))
            {
                if (first){
                    first = false;
                } else {
                    System.out.println();
                }
                char[] chArray = data.toCharArray();
                for (int i = chArray.length-1; i >= 0; i--)
                {
                    System.out.print(chArray[i]);
                }

            } else {
                continue;
            }
        }
        fileReader.close();
    }
}
