package com.javarush.test.level03.lesson03.task02;

/* Конвертер валют
Реализуйте метод convertEurToUsd, переводящий евро в доллары по заданному курсу.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс
*/
public class Solution
{
    public static void main(String[] args) {
        convertEurToUsd(25,2.6);
        convertEurToUsd(24, 2.7);
    }

    public static double convertEurToUsd(int eur, double course){
        double dol = eur*course;
        System.out.println(dol);
        return dol;
    }
}
