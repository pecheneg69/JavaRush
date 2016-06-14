package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public static boolean isDateOdd(String date)
    {
        Date date1 = new Date(date);
        Date date2 = new Date();
        date2.setHours(0);
        date2.setMinutes(0);
        date2.setSeconds(0);

        date2.setDate(1);
        date2.setMonth(0);
        long date3 = date1.getTime()-date2.getTime();
        long day = 24*60*60*1000;
        int dayCount = (int) (date3/day);

        if(dayCount%2!=0)
            return true;
        else
            return false;
    }
}
