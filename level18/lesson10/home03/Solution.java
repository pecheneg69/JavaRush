package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args)throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream file1 = new FileOutputStream(new File(reader.readLine()));
        FileInputStream file2 = new FileInputStream(new File(reader.readLine()));
        FileInputStream file3 = new FileInputStream(new File(reader.readLine()));


        byte[] o1 = new byte[file2.available()];
        file2.read(o1);
        file2.close();

        byte[] o2 = new byte[file3.available()];
        file3.read(o2);
        file3.close();

        file1.write(o1);
        file1.write(o2);
        file1.close();
        reader.close();
    }
}
