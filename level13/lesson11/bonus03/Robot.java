package com.javarush.test.level13.lesson11.bonus03;

public class Robot extends AbstractRobot implements Attackable, Defensable
{
    private static int hitCount;
    private String name;

    public Robot(String name)
    {
        super(name);
    }

}
