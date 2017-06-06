package com.javarush.test.level19.lesson10.bonus01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* Отслеживаем изменения
Считать в консоли 2 имени файла - file1, file2.
Файлы содержат строки, file2 является обновленной версией file1, часть строк совпадают.
Нужно создать объединенную версию строк, записать их в список lines
Операции ADDED и REMOVED не могут идти подряд, они всегда разделены SAME
Пример:
[Файл 1]
строка1
строка2
строка3

[Файл 2]
строка1
строка3
строка4

[Результат - список lines]
SAME строка1
REMOVED строка2
SAME строка3
ADDED строка4
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static ArrayList<String> getList(String path)throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(path));
        ArrayList<String> list = new ArrayList<String>();
        String line = "";
        while ((line = reader.readLine()) != null)
            list.add(line);
        reader.close();
        return list;
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String firstPath = consoleReader.readLine();
        String secondPath = consoleReader.readLine();
        consoleReader.close();
        ArrayList<String> firstList = getList(firstPath);
        ArrayList<String> secondList = getList(secondPath);
        int firstCount = 0;
        int secondCount = 0;
        while (firstCount < firstList.size() && secondCount < secondList.size()){
            if (firstList.get(firstCount).equals(secondList.get(secondCount))) {
                lines.add(new LineItem(Type.SAME, secondList.get(secondCount)));
                firstCount++;
                secondCount++;
            } else if (!firstList.contains(secondList.get(secondCount))) {
                lines.add(new LineItem(Type.ADDED, secondList.get(secondCount)));
                secondCount++;
            } else if (!firstList.get(firstCount).equals(secondList.get(secondCount))) {
                lines.add(new LineItem(Type.REMOVED, firstList.get(firstCount)));
                firstCount++;
            }
        }

        if(firstCount < firstList.size()){
            lines.add(new LineItem(Type.REMOVED, firstList.get(firstCount)));
        }
        if(secondCount < secondList.size()){
            lines.add(new LineItem(Type.ADDED, secondList.get(secondCount)));
        }

    }

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
