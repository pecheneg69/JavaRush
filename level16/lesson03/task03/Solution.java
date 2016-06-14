package com.javarush.test.level16.lesson03.task03;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/* Список и нити
В методе main добавить в статический объект list 5 нитей SpecialThread - различных объектов.
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        SpecialThread a1 = new SpecialThread();
        SpecialThread a2 = new SpecialThread();
        SpecialThread a3 = new SpecialThread();
        SpecialThread a4 = new SpecialThread();
        SpecialThread a5 = new SpecialThread();
        list.add( new Thread(a1));
        list.add( new Thread(a2));
        list.add( new Thread(a3));
        list.add( new Thread(a4));
        list.add( new Thread(a5));
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's run method inside SpecialThread");
        }
    }
}
