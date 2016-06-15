package com.javarush.test.level18.lesson05.task02;

/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки. Не использовать try-with-resources

Подсказка: нужно сравнивать с ascii-кодом символа ','44
*/

import java.io.*;


public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();
        FileInputStream readFile = new FileInputStream(file);
        int count=0;
        while(readFile.available()>0)
        {
            if(readFile.read()==44)
                count++;

        }
        readFile.close();
        System.out.println(count);
    }
}
