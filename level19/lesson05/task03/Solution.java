package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки. Не использовать try-with-resources

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.*;
import java.nio.Buffer;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fr = new BufferedReader(new FileReader(reader.readLine()));
        FileWriter fw = new FileWriter(reader.readLine());
        String text="";
        while(fr.ready()){
            text = fr.readLine()+" ";
        }
        String[] mass = text.split(" ");
        for(String num:mass){
            try
            {
                int i = Integer.parseInt(num);
                fw.write(num+" ");
            }catch (NumberFormatException e){}
        }
        reader.close();
        fr.close();
        fw.close();
    }
}
