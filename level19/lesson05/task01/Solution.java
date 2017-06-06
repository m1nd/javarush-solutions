package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileNameOne = reader.readLine();
        String fileNameTwo = reader.readLine();
        reader.close();
        boolean start = true;
        BufferedReader fileReader = new BufferedReader(new FileReader(fileNameOne));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileNameTwo));
        while (fileReader.ready()){
            if (start){
                start = false;
            } else {
                fileWriter.write("\r\n");
            }
           char[] chArray =  fileReader.readLine().toCharArray();
            for (int i = 1; i < chArray.length; i++)
            {
                if (i %2 != 0)
                {
                    fileWriter.write(chArray[i]);
                }
            }
        }
        fileReader.close();
        fileWriter.close();
    }
}
