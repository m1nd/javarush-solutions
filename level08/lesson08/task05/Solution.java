package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Иванов","Валерий");
        hashMap.put("Власов","Сергей");
        hashMap.put("Пичугин","Валерий");
        hashMap.put("Гулюта","Артём");
        hashMap.put("Дёмин","Антон");
        hashMap.put("Костерин","Денис");
        hashMap.put("Терёхин","Антон");
        hashMap.put("Валеев","Назар");
        hashMap.put("Шаронов","Валерий");
        hashMap.put("Климов","Илья");

        return hashMap;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashSet<String> setNames = new HashSet<String>();
        HashSet<String> duplicateNames = new HashSet<String>();

        for (Map.Entry<String, String> pair : map.entrySet())
        {
            String name = pair.getValue();

            if (setNames.contains(name))
            {
                duplicateNames.add(name);
            }
            else
            {
                setNames.add(name);
            }
        }

        for (String name : duplicateNames)
        {
            removeItemFromMapByValue(map, name);
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
