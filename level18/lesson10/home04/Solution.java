package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
Темповые файлы создавать нельзя, т.к. на сервере заблокирована возможность создания каких любо файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFilePath = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(firstFilePath);
        FileInputStream fileTwoInputStream = new FileInputStream(reader.readLine());

        byte[] bufferOne = null;
        byte[] bufferTwo = null;

        int countOne = 0;

        while (fileInputStream.available() > 0) {
            bufferOne = new byte[fileInputStream.available()];
            countOne = fileInputStream.read(bufferOne);
        }
        fileInputStream.close();

        FileOutputStream fileOutputStream = new FileOutputStream(firstFilePath);

        while (fileTwoInputStream.available() > 0) {
            bufferTwo = new byte[fileTwoInputStream.available()];
            int count = fileTwoInputStream.read(bufferTwo);
            fileOutputStream.write(bufferTwo,0, count);
        }

        fileOutputStream.write(bufferOne, 0, countOne);

        reader.close();
        fileOutputStream.close();
        fileTwoInputStream.close();
    }
}
