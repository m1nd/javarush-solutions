package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
Темповые файлы создавать нельзя, т.к. на сервере заблокирована возможность создания каких любо файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream fileOutputStream = new FileOutputStream(reader.readLine());
        FileInputStream fileTwoInputStream = new FileInputStream(reader.readLine());
        FileInputStream fileThreeInputStream = new FileInputStream(reader.readLine());

        byte[] bufferOne = null;
        byte[] bufferTwo = null;

        while (fileTwoInputStream.available() > 0) {
            bufferOne = new byte[fileTwoInputStream.available()];
            int count = fileTwoInputStream.read(bufferOne);
            fileOutputStream.write(bufferOne,0, count);
        }

        while (fileThreeInputStream.available() > 0) {
            bufferTwo = new byte[fileThreeInputStream.available()];
            int count = fileThreeInputStream.read(bufferTwo);
            fileOutputStream.write(bufferTwo,0 , count);
        }


        reader.close();
        fileOutputStream.close();
        fileTwoInputStream.close();
        fileThreeInputStream.close();

    }
}
