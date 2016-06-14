package com.javarush.test.level08.lesson08.task03;

import java.util.*;


/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        Map<String,String> map = new HashMap<String,String>();
        map.put("Концов", "Константин");
        map.put("Питров", "Дионис");
        map.put("Кольцов", "Перун");
        map.put("Иванов", "Иван");
        map.put("Аккардионов", "Аркадий");
        map.put("Петров", "Алексей");
        map.put("Пивтров", "Михаил");
        map.put("Путин", "Хуй");
        map.put("Медведев", "Хуй");
        map.put("Нестеров", "Алексей");
        return (HashMap<String, String>) map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count=0;
        for(Map.Entry<String,String> pair : map.entrySet()){
            if(pair.getValue().equals(name))
                count+=1;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int count=0;
        for(Map.Entry<String,String> pair : map.entrySet()){
            if(pair.getKey().equals(lastName))
                count+=1;
        }
        return count;

    }
}
