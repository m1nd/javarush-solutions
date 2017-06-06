package com.javarush.test.level14.lesson08.bonus03;

public class Singleton
{
    private static Singleton singleton;
    public String name;

    public static Singleton getInstance(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    private Singleton(){
    }
}
