package com.javarush.test.level21.lesson16.big01;

public class Horse
{
    public String name;
    public double speed;
    public double distance;

    public Horse(String name, double speed, double distance){
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getSpeed()
    {
        return this.speed;
    }

    public void setSpeed(double speed)
    {
        this.speed = speed;
    }

    public double getDistance()
    {
        return this.distance;
    }

    public void setDistance(double distance)
    {
        this.distance = distance;
    }
}
