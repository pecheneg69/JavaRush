package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {

        Human chld3 = new Human("Сява", false, 2, null);
        Human chld2 = new Human("Соня", false,23,null);
        Human chld1 = new Human("Женя", true, 46,null);
        Human mother = new Human("Антон", false,12,chld2);
        Human father = new Human("Беня", true, 45, (chld1));
        Human grandF1 = new Human("Мойша", true, 95, father);
        Human grandM1 = new Human("Сара", false, 99, father);
        Human grandF2 = new Human("Гюнтер", true, 24, mother);
        Human grandM2 = new Human("Джесика", false, 56, mother);
        ArrayList<Object> list = new ArrayList<>();
        list.add(grandF1);
        list.add(grandM1);
        list.add(grandF2);
        list.add(grandM2);
        list.add(father);
        list.add(mother);
        list.add(chld1);
        list.add(chld2);
        list.add(chld3);
        for(Object i : list)
            System.out.println(i);






    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name, boolean sex, int age, Human human){
            this.name = name;
            this.sex = sex;
            this.age = age;
            if(human!=null)
                this.children.add(human);
            else
                this.children=new ArrayList<Human>();

    }




        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
