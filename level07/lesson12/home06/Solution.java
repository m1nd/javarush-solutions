package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grandFatherOne = new Human("Андрей", null, null, null, null);
        grandFatherOne.sex = true;
        grandFatherOne.age = 88;

        Human grandFatherTwo = new Human("Серафим", null, null, null, null);
        grandFatherTwo.sex = true;
        grandFatherTwo.age = 85;

        Human grandMotherOne = new Human("Анна", null, null, null, null);
        grandMotherOne.sex = false;
        grandMotherOne.age = 80;

        Human grandMotherTwo = new Human("Варвара", null, null, null, null);
        grandMotherTwo.sex = false;
        grandMotherTwo.age = 78;

        Human father = new Human("Валерий", null, null, grandFatherTwo, grandMotherTwo);
        father.sex = true;
        father.age = 43;

        Human mother = new Human("Екатерина", null, null, grandFatherOne, grandMotherOne);
        mother.sex = false;
        mother.age = 40;

        Human sonOne = new Human("Виталик", grandFatherOne, grandMotherOne, father, mother);
        sonOne.sex = true;
        sonOne.age = 14;

        Human sonTwo = new Human("Славик", grandFatherOne, grandMotherOne, father, mother);
        sonTwo.sex = true;
        sonTwo.age = 12;

        Human daughter = new Human("Даша", grandFatherOne, grandMotherOne, father, mother);
        daughter.sex = false;
        daughter.age = 8;



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

        private Human grandFather;
        private Human grandMother;
        private Human father;
        private Human mother;

        public Human(String name, Human grandFather, Human grandMother, Human father, Human mother){
            this.name = name;
            this.grandFather = grandFather;
            this.grandMother = grandMother;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
