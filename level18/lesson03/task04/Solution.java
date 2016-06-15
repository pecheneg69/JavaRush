package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        ArrayList<Integer> x = new ArrayList<>();
        FileInputStream readFile = new FileInputStream(file);
        while(readFile.available()>0)
        {
            int data = readFile.read();
            x.add(data);
        }
        readFile.close();

        Integer count1=0;
        Integer count2=0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<x.size();i++){

            count2 = 0;
            for(int j=1;j<x.size();j++){
                if(x.get(i)==x.get(j)){
                    count2++;
                    map.put(x.get(i), count2);
                }
            }
        }

        for(Map.Entry entry:map.entrySet()){
            if(entry.getValue().equals(count1))
                System.out.print(entry.getKey()+" ");

        }
    }
}
