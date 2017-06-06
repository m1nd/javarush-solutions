package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int digOne = Integer.parseInt(reader.readLine());
        int digTwo = Integer.parseInt(reader.readLine());;
        int tmp;

        while (digTwo != 0){
            tmp = digTwo;
            digTwo = digOne % digTwo;
            digOne = tmp;
        }

        System.out.println(digOne);

    }
}
