package com.javarush.test.level18.lesson05.task05;

/* DownloadException
1 Считывать с консоли имена файлов.
2 Если файл меньше 1000 байт, то:
2.1 Закрыть потоки
2.2 выбросить исключение DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int size = 0;
        int result = 0;

        while (true)
        {
            FileInputStream fileInputStream = new FileInputStream(reader.readLine());

            while (fileInputStream.available() > 0)
            {
                int tmp = fileInputStream.read();
                size++;
            }
            result = size;
            size = 0;
            fileInputStream.close();
            if (result < 1000){
                reader.close();
                throw new DownloadException();
            }
        }

    }

    public static class DownloadException extends Exception{

    }
}
