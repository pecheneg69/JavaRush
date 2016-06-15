package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;


public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1= reader.readLine();
        String file2=reader.readLine();

        RandomAccessFile newFile1 = new RandomAccessFile(file1, "rw");
        byte[] array = new byte[(int)newFile1.length()];
        newFile1.read(array);
        newFile1.seek(0);

        FileInputStream fileInputStream = new FileInputStream(file2);
        while (fileInputStream.available()>0) {
            newFile1.write(fileInputStream.read());
        }
        newFile1.write(array);

        reader.close();
        newFile1.close();
        fileInputStream.close();
    }
}
