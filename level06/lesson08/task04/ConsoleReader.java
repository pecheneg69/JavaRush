package com.javarush.test.level06.lesson08.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.BufferOverflowException;

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
boolean readBoolean() – читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую переменную true или false
Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода
*/

public class ConsoleReader
{
    public static String readString() throws Exception
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        return read.readLine();


    }

    public static int readInt() throws Exception
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(read.readLine());

    }

    public static double readDouble() throws Exception
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        return Double.parseDouble(read.readLine());

    }

    public static boolean readBoolean() throws Exception
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String a = read.readLine();
        Boolean q = null;
        if(a.equals("true")){q = true;}
        if(a.equals("false")){q = false;}
        return q;
    }
}
