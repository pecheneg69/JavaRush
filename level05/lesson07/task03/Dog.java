package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    private String name;
    private String color;
    private int heigth;

    public void initialize(String name){
        this.name = name;
    }
    public void initialize(String name, int heigth){
        this.name = name;
        this.heigth = heigth;
    }
    public void initialize(String name, int heigth, String color){
        this.name = name;
        this.heigth = heigth;
        this.color = color;

    }

}
