package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String numA = read.readLine();
        String numB = read.readLine();
        String numC = read.readLine();
        int a = Integer.parseInt(numA);
        int b = Integer.parseInt(numB);
        int c = Integer.parseInt(numC);

        if(a>0 && b>0 && c>0)System.out.print("3");
        if((a>0&&b>0&&c<0)||(a>0&&b<0&&c>0)||(a<0&&b>0&&c>0))System.out.print("2");
        if((a>0&&b<0&&c<0)||(a<0&&b<0&&c>0)||(a<0&&b>0&&c<0))System.out.print("1");
        if(a<0&&b<0&&c<0)System.out.print("0");

    }
}
