package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести все строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        String separator = String.format("%n");
        String tmp = "";
        if (!fileName.isEmpty()){
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            while (!tmp.equals("exit")){
                tmp = reader.readLine();
                fileOutputStream.write(tmp.getBytes());
                fileOutputStream.write(separator.getBytes());
            }
            fileOutputStream.close();
            reader.close();
        }

    }
}
