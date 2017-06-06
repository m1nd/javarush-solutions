package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> buffList = new ArrayList<Integer>();
        List<Integer> resultList = new ArrayList<Integer>();

        int min = Integer.MAX_VALUE;
        int tmp = 0;
        int count = 0;

        while (fileInputStream.available() > 0) {
            list.add(fileInputStream.read());
        }

        for (int i = 0; i < list.size(); i++){
            for (int j = 0; j < list.size(); j++){
                if (list.get(i) == list.get(j)){
                    count++;
                }
            }
            buffList.add(count);
            count = 0;
        }

        for (int i = 0; i < buffList.size(); i++)
        {
            if (buffList.get(i) < min){
                min = buffList.get(i);
            }
        }

        for (int i = 0; i < buffList.size(); i++)
        {
            if (buffList.get(i) == min && !resultList.contains(list.get(i)) ){
                resultList.add(list.get(i));
            }
        }

        for (int i = 0; i < resultList.size(); i++)
        {
            if (i == 0){
                System.out.print(resultList.get(i));
            } else
            {
                System.out.print(" " + resultList.get(i));
            }
        }

        reader.close();
        fileInputStream.close();

    }
}
