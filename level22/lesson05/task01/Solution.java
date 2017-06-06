package com.javarush.test.level22.lesson05.task01;

/* Найти подстроку
Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.
Пример: "JavaRush - лучший сервис обучения Java."
Результат: "- лучший сервис обучения"
На некорректные данные бросить исключение TooShortStringException (сделать исключением).
Сигнатуру метода getPartOfString не менять.
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null) throw new TooShortStringException();
        String[] words = string.split(" ");
        if (words.length < 5) throw new TooShortStringException();
        StringBuilder newString = new StringBuilder();
        for (int i = 1; i <= 4 ; i++) {
            newString.append(words[i]).append(" ");
        }
        return newString.toString().substring(0, newString.length()-1);
    }
    public static class TooShortStringException extends Exception {
    }

}
