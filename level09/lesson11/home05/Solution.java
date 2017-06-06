package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new  InputStreamReader(System.in));
        List<Character> listVowels = new ArrayList<Character>();
        List<Character> listNoVowels = new ArrayList<Character>();

        char[] chString = reader.readLine().toCharArray();

        for (int i = 0; i < chString.length; i++){
            if (isVowel(chString[i])){
                listVowels.add(chString[i]);
            } else if (chString[i] != ' '){
                listNoVowels.add(chString[i]);
            }
        }

        for (int i = 0; i < listVowels.size(); i++){
            if(i == 0) System.out.print(listVowels.get(i));
            else {
                System.out.print(" " + listVowels.get(i));
            }
        }
        System.out.println();

        for (int i = 0; i < listNoVowels.size(); i++){
            if(i == 0) System.out.print(listNoVowels.get(i));
            else {
                System.out.print(" " + listNoVowels.get(i));
            }
        }

    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
