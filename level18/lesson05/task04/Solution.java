package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream in = new FileInputStream(new File(reader.readLine()));
        FileOutputStream out = new FileOutputStream(new File(reader.readLine()));

        while (in.available() > 0)
        {
            byte[] o1 = new byte[in.available()];
            int count1 = in.read(o1);
            for(int i = 0; i < o1.length / 2; i++)
            {
                byte temp = o1[i];
                o1[i] = o1[o1.length - i - 1];
                o1[o1.length - i - 1] = temp;
            }
            out.write(o1, 0, count1);
        }
        reader.close();
        in.close();
        out.close();

    }
}
