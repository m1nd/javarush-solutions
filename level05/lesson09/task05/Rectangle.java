package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    private int top;
    private int left;
    private int width;
    private int height;

    Rectangle(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    Rectangle(){
        this.top = 3;
        this.left = 3;
        this.width = 20;
        this.height = 12;
    }

    Rectangle(int top){
        this.top = top;
        this.left = top;
        this.width = 0;
        this.height = 0;
    }

    Rectangle(int top, int left){
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }

    Rectangle(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }

    Rectangle(Rectangle rectangle){
        this.top = rectangle.top;
        this.left = rectangle.left;
        this.height = rectangle.height;
        this.width = rectangle.width;
    }

}
