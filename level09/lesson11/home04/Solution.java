package com.javarush.test.level09.lesson11.home04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;

import java.util.*;

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        Date date = new Date(read.readLine());
        SimpleDateFormat simpDate = new SimpleDateFormat("MMM dd, YYYY",Locale.ENGLISH);
        String x= simpDate.format(date);
        System.out.println(x.toUpperCase());

    }
}
