package com.javarush.test.level19.lesson10.home01;

/* Считаем зарплаты
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 2
Сидоров 6
Иванов 1.35
Петров 3.1

Пример вывода:
Иванов 1.35
Петров 5.1
Сидоров 6.0
*/

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        if (args.length != 1){ return; }
        String fileName = args[0];
        if (fileName.length() == 0){ return; }

        Map<String, Double> treeMap = new TreeMap<String, Double>();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        while (fileReader.ready()){
            String string = fileReader.readLine();
            if (string.length() == 0 || (string.charAt(0) == '\uFEFF' && string.length() == 1 )){break;}
            String[] strArray = string.split(" ");
            if (strArray[0].charAt(0) == '\uFEFF'){
                strArray[0] = strArray[0].substring(1, strArray[0].length());
            }
            if (treeMap.containsKey(strArray[0])){
                Double tmpDigit = treeMap.get(strArray[0]);
                tmpDigit += Double.parseDouble(strArray[1]);
                treeMap.put(strArray[0], tmpDigit);
            } else {
                treeMap.put(strArray[0], Double.parseDouble(strArray[1]));
            }
        }

        fileReader.close();
        for (Map.Entry<String, Double> pair : treeMap.entrySet()){
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}
