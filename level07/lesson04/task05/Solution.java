package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] bigMass = new int[20];
        int[] mass1 = new int[10];
        int[] mass2 = new int[10];
        for (int i = 0; i < bigMass.length; i++)
        {
            bigMass[i] = Integer.parseInt(reader.readLine());

        }
        System.arraycopy(bigMass, 0, mass1,0, mass1.length);
        System.arraycopy(bigMass, mass1.length, mass2, 0, mass2.length);
        for(int i=0; i<mass2.length; i++){
            System.out.println(mass2[i]);
        }

    }
}
