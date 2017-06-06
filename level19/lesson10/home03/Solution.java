package com.javarush.test.level19.lesson10.home03;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* Хуан Хуанович
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами

Заполнить список PEOPLE импользуя данные из файла
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Иванов Иван Иванович 31 12 1987
Вася 15 5 2013
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(args[0]), "utf-8"));
        List<Integer> list = new ArrayList<Integer>();

        while (reader.ready())
        {

            String k=reader.readLine();
            String []d = k.split(" ");
            String result="";
            for (int i = 0; i < d.length; i++)
            {
                try
                {
                    int n = Integer.parseInt(d[i]);
                    list.add(n);
                }
                catch (NumberFormatException e)
                {
                    result = result + d[i] + " ";
                }
            }

            if (list.size()==3)
            {
                Calendar b = new GregorianCalendar(list.get(2), +list.get(1) - 1, list.get(0));
                result = result.trim();
                PEOPLE.add(new Person(result, b.getTime()));
                list.clear();
            }

        }
        reader.close();

    }

}
