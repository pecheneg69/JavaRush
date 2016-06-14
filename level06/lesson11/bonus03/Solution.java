package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/* Задача по алгоритмамreturn
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        int[] num = new int[5];

        for(int i = 0; i<num.length; i++){
            num[i] = Integer.parseInt(reader.readLine());
        }


        Arrays.sort(num);

        for(int i:num){
            System.out.println(i);
        }



    }
}
