package com.javarush.test.level03.lesson12.home02;

/* Я не хочу изучать Java, я хочу большую зарплату
Вывести на экран десять раз надпись «Я не хочу изучать Java, я хочу большую зарплату»
*/

public class Solution
{
    public static void main(String[] args)
    {
        text("Я не хочу изучать Java, я хочу большую зарплату");
    }
    public static void text(String s)
    {
        int i = 0;
        while (i < 10)
        {
            System.out.println(s);
            i++;
        }
    }
}
