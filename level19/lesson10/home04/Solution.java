package com.javarush.test.level19.lesson10.home04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Ищем нужные строки
Считать с консоли имя файла.
Вывести в консоль все строки из файла, которые содержат всего 2 слова из списка words
Закрыть потоки. Не использовать try-with-resources

Пример: words содержит слова А, Б, В
Строки:
В Б А Д  //3 слова из words, не подходит
Д А Д    //1 слово из words, не подходит
Д А Б Д  //2 слова - подходит, выводим
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "";
        if ((fileName = reader.readLine()).equals("")){
            reader.close();
            return;
        }

        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "utf-8"));
        reader.close();

        int count = 0;

        while (fileReader.ready())
        {
            String data = "";
            if (!(data = fileReader.readLine()).equals(""))
            {
                for (String str : words)
                {
                    String temp = data.replaceAll(str, "");
                    int tmpCount = (data.length() - temp.length()) / str.length();
                    count = count + tmpCount;
                }
                if (count == 2)
                {
                    System.out.println(data);
                }
                count = 0;
            } else {
                continue;
            }
        }

        fileReader.close();

    }
}
