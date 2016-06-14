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
        Map<String, Cat> catMap = new HashMap<String, Cat>();
        catMap.put("Тошка", new Cat("Тошка"));
        catMap.put("Генадий", new Cat("Генадий"));
        catMap.put("Пушок", new Cat("Пушок"));
        catMap.put("Барсик", new Cat("Барсик"));
        catMap.put("Кот", new Cat("Кот"));
        catMap.put("Рыжик", new Cat("Рыжик"));
        catMap.put("Анаконда", new Cat("Анаконда"));
        catMap.put("Мурка", new Cat("Мурка"));
        catMap.put("Анабель", new Cat("Анабель"));
        catMap.put("Чернушка", new Cat("Чернушка"));
        return catMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Cat> catSet = new HashSet<Cat>();
        for(Map.Entry<String, Cat> x : map.entrySet()){
            catSet.add(x.getValue());
        }
        return catSet;
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
