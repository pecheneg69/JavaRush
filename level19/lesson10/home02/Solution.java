package com.javarush.test.level19.lesson10.home02;

/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        Map<String, Double> map = new TreeMap<>();
        String text;
        double value;
        while((text = reader.readLine())!=null){
            String[] split = text.split(" ");
            value = Double.parseDouble(split[1]);
            if(map.containsKey(split[0]))
            {
                map.put(split[0], map.get(split[0]) + value);
            }
            else {
                map.put(split[0],value);
            }
        }

        reader.close();
        Double max = Double.MIN_VALUE;
        Double value1;
        for (String s : map.keySet()) {
            value1 = map.get(s);
            if (value1 > max) {
                max = value1;
            }
        }

        for (String s1 : map.keySet()) {
            value1 = map.get(s1);

            if (value1 == max) {
                System.out.println(s1);
            }
        }
    }
}
