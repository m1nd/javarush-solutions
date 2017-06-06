package com.javarush.test.level23.lesson13.big01;

import java.util.ArrayList;

public class Snake
{
    ArrayList<SnakeSection> sections;
    boolean isAlive;
    SnakeDirection direction;

    public Snake(int x, int y){
        sections = new ArrayList<>();
        SnakeSection head = new SnakeSection(x, y);
        sections.add(head);
        isAlive = true;
    }

    public ArrayList<SnakeSection> getSections()
    {
        return sections;
    }

    public boolean isAlive()
    {
        return isAlive;
    }

    public SnakeDirection getDirection()
    {
        return direction;
    }

    public void setDirection(SnakeDirection direction)
    {
        this.direction = direction;
    }

    public void move() {}
}
