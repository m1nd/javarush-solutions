package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {

        ArrayList<Human> forChildren = new ArrayList<Human>();

        Human sonOne = new Human("Василий", true, 12, forChildren);
        Human sonTwo = new Human("Аркадий", true, 10, forChildren);
        Human daughter = new Human("Наталья", false, 8, forChildren);

        ArrayList<Human> forFatherChildren = new ArrayList<Human>();
        forFatherChildren.add(sonOne);
        forFatherChildren.add(sonTwo);
        forFatherChildren.add(daughter);

        Human father = new Human("Георгий", true, 42, forFatherChildren);
        Human mother = new Human("Елена", false, 38, forFatherChildren);

        ArrayList<Human> forGrandFatherOneChildren = new ArrayList<Human>();
        forGrandFatherOneChildren.add(father);

        ArrayList<Human> forGrandFatherTwoChildren = new ArrayList<Human>();
        forGrandFatherTwoChildren.add(mother);

        Human grandFatherOne = new Human("Альберт", true, 87, forGrandFatherOneChildren);
        Human grandMotherOne = new Human("Евдокия", false, 78, forGrandFatherOneChildren);

        Human grandFatherTwo = new Human("Федор", true, 84, forGrandFatherTwoChildren);
        Human grandMotherTwo = new Human("Клавдия", false, 77, forGrandFatherTwoChildren);

        System.out.println(grandFatherOne);
        System.out.println(grandFatherTwo);
        System.out.println(grandMotherOne);
        System.out.println(grandMotherTwo);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(sonOne);
        System.out.println(sonTwo);
        System.out.println(daughter);
    }

    public static class Human
    {

        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
