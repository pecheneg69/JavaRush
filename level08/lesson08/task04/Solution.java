package com.javarush.test.level08.lesson08.task04;

import java.util.*;


/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));

        map.put("qwerty", new Date("JUNE 1 1980"));
        map.put("asdf", new Date("JUNE 1 1980"));
        map.put("Sta", new Date("JUNE 1 1980"));
        map.put("Stallo", new Date("JUNE 1 1980"));
        map.put("Stallon", new Date("JUNE 1 1980"));
        map.put("Stal", new Date("JUNE 1 1980"));
        map.put("St", new Date("JUNE 1 1980"));
        map.put("Stall", new Date("JUNE 1 1980"));
        map.put("Stallone1", new Date("JUNE 1 1980"));
        return map;


    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {

            Map.Entry<String, Date> pair = iterator.next();
            if(pair.getValue().getMonth()>=5&&pair.getValue().getMonth()<=7)
                iterator.remove();

        }

    }
}
