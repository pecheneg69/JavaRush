package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fRead = new FileReader(reader.readLine());
        reader.close();
        String text = "";
        while(fRead.ready()){
            char ch = (char)fRead.read();
            text=text+ch;
        }
        fRead.close();
        String replacedString = text.replaceAll("\\p{P}"," ").toLowerCase();
        replacedString=replacedString.replaceAll("\\s"," ");

        String splitString[] = replacedString.split(" ");
        int counter=0;
        for (String x : splitString) {
            if (x.equals("world")) {
                counter++;
            }
        }

        System.out.println(counter);

    }
}
