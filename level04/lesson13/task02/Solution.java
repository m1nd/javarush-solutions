package com.javarush.test.level04.lesson13.task02;

import java.io.*;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));

        String sM = reader.readLine();
        String sN = reader.readLine();

        int iM = Integer.parseInt(sM);
        int iN = Integer.parseInt(sN);

        for (int i = 0; i < iM; i++) {
            for (int j = 0; j < iN; j++)
            {
                System.out.print("8");
            }
            System.out.println();
        }


    }
}
