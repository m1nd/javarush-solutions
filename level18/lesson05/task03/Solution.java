package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        FileOutputStream fileTwoOutputStream = new FileOutputStream(reader.readLine());
        FileOutputStream fileThreeOutputStream = new FileOutputStream(reader.readLine());

        byte[] buffer = null;
        int length = 0;

        while (fileInputStream.available() > 0) {
            buffer = new byte[fileInputStream.available()];
            int count = fileInputStream.read(buffer);
            //outputStream.write(buffer, 0, count);
        }
        if (buffer.length % 2 == 0){
            length = buffer.length / 2;
        } else {
            length = (buffer.length / 2) + 1;
        }

        for (int i = 0; i < length; i++)
        {
            fileTwoOutputStream.write(buffer[i]);
        }

        for (int i = length; i < buffer.length; i++)
        {
            fileThreeOutputStream.write(buffer[i]);
        }

        reader.close();
        fileInputStream.close();
        fileTwoOutputStream.close();
        fileThreeOutputStream.close();


    }
}
