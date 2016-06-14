package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Алексей on 13.04.2016.
 */
public class BelarusianHen extends Hen
{

    int getCountOfEggsPerMonth()
    {
        return 10;
    }

    @Override
    String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.BELARUS + "." + " Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
