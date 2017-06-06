package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
            map.put("Дёмин", "Антон");
            map.put("Подуруев", "Игорь");
            map.put("Абрамов", "Антон");
            map.put("Климов", "Илья");
            map.put("Андреев", "Дмитрий");
            map.put("Захарова", "Наталья");
            map.put("Терёхин", "Антон");
            map.put("Иванов", "Валерий");
            map.put("Пичугин", "Валерий");
            map.put("Киселёв", "Георгий");

        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int firstName = 0;
        Iterator<Map.Entry<String, String>>iterator = map.entrySet().iterator();
        while(iterator.hasNext())
        {
            if (name.equals(iterator.next().getValue()))
                firstName++;
        }
        return firstName;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int lastName = 0;
        Iterator<Map.Entry<String, String>>iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            if (familiya.equals(iterator.next().getKey()))
                lastName++;
        }
        return lastName;
    }
}
