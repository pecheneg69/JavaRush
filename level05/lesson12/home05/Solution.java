package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.*;


public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int i=0;
        while (true)
        {
            String s = read.readLine();

            if (s.equals("сумма"))
            {
                System.out.println(i);
                break;
            }
            int x = Integer.parseInt(s);
            i=i+x;



        }
    }
}
