package com.javarush.test.level04.lesson10.task03;

import java.io.*;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String str = read.readLine();
        String num = read.readLine();
        int N = Integer.parseInt(num);

        int i=0;
        while(i<N){
            System.out.println(str);
            i++;
        }


    }
}
