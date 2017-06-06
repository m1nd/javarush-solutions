package com.javarush.test.level18.lesson03.task05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;




/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        List<Integer> list = new ArrayList<Integer>();

        while (fileInputStream.available() > 0) {
            list.add(fileInputStream.read());
        }

        for (int i = 0; i < list.size(); i++){
            for (int j = 0; j < list.size() - 1; j++){
                if (list.get(j) > list.get(j+1)){
                    int tmp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, tmp);
                }
            }
        }

        for (int i = 0; i < list.size(); i++)
        {
            if (i == 0){
                System.out.print(list.get(i));
            } else if (list.get(i) == list.get(i-1)){
                continue;
            }
            else {
                System.out.print(" " + list.get(i));
            }
        }

    }

}
