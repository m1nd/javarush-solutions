package com.javarush.test.level18.lesson10.bonus01;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        if (args.length != 3 || (!"-e".equals(args[0])&&(!"-d".equals(args[0])))) { return; }

        int spaceCharCode = 32;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;

        if ("-e".equals(args[0])){
            fileInputStream = new FileInputStream(args[1]);
            fileOutputStream = new FileOutputStream(args[2]);
            while (fileInputStream.available() > 0){
                int data = fileInputStream.read();
                data += spaceCharCode;
                fileOutputStream.write(data);
            }
            fileInputStream.close();
            fileOutputStream.close();
        } else {
            fileInputStream = new FileInputStream(args[1]);
            fileOutputStream = new FileOutputStream(args[2]);
            while (fileInputStream.available() > 0){
                int data = fileInputStream.read();
                data -= spaceCharCode;
                fileOutputStream.write(data);
            }
            fileInputStream.close();
            fileOutputStream.close();
        }
    }

}
