package com.javarush.test.level22.lesson09.task01;

import java.io.*;
import java.util.*;

/* Обращенные слова
В методе main с консоли считать имя файла, который содержит слова, разделенные пробелами.
Найти в тексте все пары слов, которые являются обращением друг друга. Добавить их в result.
Порядок слов first/second не влияет на тестирование.
Использовать StringBuilder.
Пример, "мор"-"ром", "трос"-"сорт"
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        if (fileName.length() == 0) return;

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));

        while (fileReader.ready()){
            Set<String> set = new HashSet<>();
            String[] buff = fileReader.readLine().split(" ");
            for (String str : buff){
                set.add(str);
            }
            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < buff.length; i++)
            {
                stringBuilder.append(buff[i]);
                String revString = stringBuilder.reverse().toString();
                if (set.contains(revString)){
                    Pair pair = new Pair();
                    pair.first = buff[i];
                    pair.second = revString;
                    if (!result.contains(pair)) result.add(pair);
                }
                stringBuilder.setLength(0);
            }

        }

        fileReader.close();
    }

    public static class Pair {
        String first;
        String second;

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
