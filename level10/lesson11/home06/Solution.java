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
        private String firstName;
        private String lastName;
        private int age;
        private float height;
        private float weight;
        private String profession;

        public Human(){

        }

        public Human(String firstName){

        }

        public Human(String firstName, String lastName){

        }

        public Human(String firstName, String lastName, int age){

        }

        public Human(String firstName, String lastName, int age, float height){

        }

        public Human(String firstName, String lastName, int age, float height, float weight){

        }

        public Human(String firstName, String lastName, int age, float height, float weight, String profession){

        }

        public Human(String firstName, String lastName, String profession){

        }

        public Human(String firstName, int age){

        }

        public Human(String firstName, String lastName, float height, float weight){

        }

    }
}
