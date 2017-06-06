package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
        public static void main(String[] args) throws IOException
        {
            String s;
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line;
            String file1 = reader.readLine();
            String file2 = reader.readLine();
            reader.close();
            BufferedReader fileReader = new BufferedReader(new FileReader(file1));
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file2));
            while ((line = fileReader.readLine()) != null){
                fileWriter.write(numbersToString(getNumbers(line)));
            }
            fileReader.close();
            fileWriter.close();

        }

        static String numbersToString(double[] numbers){
            String s = "";
            for (double number : numbers){
                s += Math.round(number) + " ";
            }
            return s;
        }

        static double [] getNumbers(String line)
        {

            String[] numbersString = line.split(" ");
            double[] numbers = new double[numbersString.length];
            for (int i = 0; i < numbersString.length; i++){
                numbers[i] = Math.round(Double.parseDouble(numbersString[i]));
            }
            return numbers;
    }
}
