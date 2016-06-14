package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grandF1 = new Human("паша",true, 94, null,null);
        Human grandF2 = new Human("коля",true, 94, null,null);
        Human grandM1 = new Human("Ксения",false, 90, null,null);
        Human grandM2 = new Human("Алупка",false, 89, null,null);
        Human father = new Human("Женя",true, 19, grandF1,grandM1);
        Human mother = new Human("Женя",false, 45, grandF2,grandM2);
        Human son1 = new Human("Генадий",true, 12, father,mother);
        Human son2 = new Human("Валера",true, 13, father,mother);
        Human daughter = new Human("Линда",false, 14, father,mother);
        System.out.println(grandF1.toString());
        System.out.println(grandF2.toString());
        System.out.println(grandM1.toString());
        System.out.println(grandM2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(daughter.toString());

    }



    public static class Human
    {
       String name;
       boolean sex;
       int age;
       Human father;
       Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;

        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
