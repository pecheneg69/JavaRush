package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
       BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String numA = read.readLine();
        String numB = read.readLine();
        String numC = read.readLine();
        int a = Integer.parseInt(numA);
        int b = Integer.parseInt(numB);
        int c = Integer.parseInt(numC);

        if(a>b&&a>c&&b>c)System.out.print(b);
        if(a>b&&a>c&&c>b)System.out.print(c);
        if(b>a&&b>c&&a>c)System.out.print(a);
        if(b>c&&b>a&&c>a)System.out.print(c);
        if(c>a&&c>b&&a>b)System.out.print(a);
        if(c>b&&c>a&&b>a)System.out.print(b);
    }
}
