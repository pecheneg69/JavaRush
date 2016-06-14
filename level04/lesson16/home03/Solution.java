package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int i=0;
        while (true)
        {
            String s = read.readLine();
            int x = Integer.parseInt(s);
            i=i+x;
            if (s.equals("-1"))
            {
                System.out.println(i);
                break;
            }


        }

    }
}

