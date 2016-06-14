package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Алексей on 13.04.2016.
 */
public class MoldovanHen extends Hen
{
    int getCountOfEggsPerMonth()
    {
        return 15;
    }

    @Override
    String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA + "." + " Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
