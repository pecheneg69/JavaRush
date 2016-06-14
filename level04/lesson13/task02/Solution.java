package com.javarush.test.level04.lesson13.task02;

import java.io.*;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String numA = read.readLine();
        String numB = read.readLine();
        int a = Integer.parseInt(numA);
        int b = Integer.parseInt(numB);

        for(int i=0; i<a; i++){
            for(int j=1;j<b;j++){
                System.out.print(8);
            }
            System.out.println(8);
    }

    }
}
