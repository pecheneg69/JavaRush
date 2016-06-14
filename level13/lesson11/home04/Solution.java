package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;
import java.nio.Buffer;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter outStream = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(read.readLine())));
        while(true){
            String s = read.readLine();
            outStream.write(s);
            if(s.equals("exit")) break;
            outStream.newLine();
        }


        read.close();
        outStream.close();
    }


}
