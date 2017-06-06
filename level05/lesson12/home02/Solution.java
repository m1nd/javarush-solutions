package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man manOne = new Man("Ваня", 13, "Москва");
        Man manTwo = new Man("Федя", 23, "Питер");

        Woman womenOne = new Woman("Аня", 53, "Москва");
        Woman womenTwo = new Woman("Лена", 23, "Питер");

        //выведи их на экран тут
        System.out.println(manOne.name + " " + manOne.age + " " + manOne.address);
        System.out.println(manTwo.name + " " + manTwo.age + " " + manTwo.address);
        System.out.println(womenOne.name + " " + womenOne.age + " " + womenOne.address);
        System.out.println(womenTwo.name + " " + womenTwo.age + " " + womenTwo.address);
    }

    public static class Man{
        private String name;
        private int age;
        private String address;

        Man(){
            this.name = "Антон";
            this.age = 31;
            this.address = "Деревня Ближне-Песочная";
        }

        Man(String name){
            this.name = name;
            this.age = 18;
        }

        Man(String name, int age){
            this.name = name;
            this.age = age;
        }

        Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman{
        private String name;
        private int age;
        private String address;

        Woman(){
        this.name = "Анна";
        this.age = 30;
        this.address = "Деревня Ближне-Песочная";
    }

    Woman(String name){
        this.name = name;
        this.age = 18;
    }

    Woman(String name, int age){
        this.name = name;
        this.age = age;
    }

    Woman(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    }

}
