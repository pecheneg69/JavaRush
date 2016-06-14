package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        private String firstname;
        private String lastname;
        private String address;
        private int age;
        private int phoneNumber;
        private boolean car;

        public Human(String firstname, String lastname)
        {
            this.firstname = firstname;
            this.lastname = lastname;
        }

        public Human(String firstname)
        {
            this.firstname = firstname;
        }

        public Human(String firstname, String address, String lastname)
        {
            this.firstname = firstname;
            this.address = address;
            this.lastname = lastname;
        }

        public Human(String firstname, String lastname, String address, int age)
        {
            this.firstname = firstname;
            this.lastname = lastname;
            this.address = address;
            this.age = age;
        }

        public Human(String firstname, String lastname, String address, int age, int phoneNumber)
        {
            this.firstname = firstname;
            this.lastname = lastname;
            this.address = address;
            this.age = age;
            this.phoneNumber = phoneNumber;
        }

        public Human(String firstname, String lastname, String address, int age, int phoneNumber, boolean car)
        {
            this.firstname = firstname;
            this.lastname = lastname;
            this.address = address;
            this.age = age;
            this.phoneNumber = phoneNumber;
            this.car = car;
        }

        public Human(String firstname, String address, int age)
        {
            this.firstname = firstname;
            this.address = address;
            this.age = age;
        }

        public Human(String firstname, String lastname, String address, boolean car)
        {
            this.firstname = firstname;
            this.lastname = lastname;
            this.address = address;
            this.car = car;
        }

        public Human(String firstname, int age, int phoneNumber, boolean car)
        {
            this.firstname = firstname;
            this.age = age;
            this.phoneNumber = phoneNumber;
            this.car = car;
        }

        public Human(String lastname, boolean car, String address)
        {
            this.lastname = lastname;
            this.car = car;
            this.address = address;
        }

        public Human(String firstname, String lastname, String address, int age, boolean car)
        {
            this.firstname = firstname;
            this.lastname = lastname;
            this.address = address;
            this.age = age;
            this.car = car;
        }
    }
}
