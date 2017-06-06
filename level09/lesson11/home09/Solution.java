package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        HashMap<String, Cat> cats = new HashMap<String, Cat>();

        cats.put("Барсик", new Cat("Барсик"));
        cats.put("Рыжик", new Cat("Рыжик"));
        cats.put("Мурзик", new Cat("Мурзик"));
        cats.put("Васька", new Cat("Васька"));
        cats.put("Муська", new Cat("Муська"));
        cats.put("Борис", new Cat("Борис"));
        cats.put("Маркиз", new Cat("Маркиз"));
        cats.put("Тишка", new Cat("Тишка"));
        cats.put("Перс", new Cat("Перс"));
        cats.put("Пушок", new Cat("Пушок"));

        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Cat> set = new HashSet<Cat>();
        for (Map.Entry<String, Cat> pair : map.entrySet()){
            set.add(pair.getValue());
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
