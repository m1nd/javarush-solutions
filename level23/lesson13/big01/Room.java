package com.javarush.test.level23.lesson13.big01;

public class Room
{
    private int width, height;
    private Snake snake;
    private Mouse mouse;

    public static Room game;

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public Snake getSnake()
    {
        return snake;
    }

    public Mouse getMouse()
    {
        return mouse;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public void setSnake(Snake snake)
    {
        this.snake = snake;
    }

    public void setMouse(Mouse mouse)
    {
        this.mouse = mouse;
    }

    public Room(int width, int height, Snake snake) {
        this.width = width;
        this.height = height;
        this.snake = snake;
    }

    public static void main(String[] args)
    {
        game = new Room(10,20,new Snake(0,0));
        game.snake.setDirection(SnakeDirection.DOWN);
    }

    public void run() {}

    public void print() {}

}
