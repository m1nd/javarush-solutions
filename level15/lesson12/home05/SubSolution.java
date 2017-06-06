package com.javarush.test.level15.lesson12.home05;

public class SubSolution extends Solution
{
    private SubSolution(Character chVar){

        super(chVar);
    }

    private SubSolution(Integer integer) {
        super(integer);
    }

    private SubSolution(String string) {
        super(string);
    }

    SubSolution(Integer intVar1, Integer intVar2)
    {
        super(intVar1, intVar2);
    }

    SubSolution(Integer intVar, String stringVar)
    {
        super(intVar, stringVar);
    }

    SubSolution(String stringVar, Integer intVar)
    {
        super(stringVar, intVar);
    }

    protected SubSolution(Double doubleVar)
    {
        super(doubleVar);
    }

    protected SubSolution(Double doubleVar, Integer intVar)
    {
        super(doubleVar, intVar);
    }

    protected SubSolution(Integer intVar, Double doubleVar)
    {
        super(intVar, doubleVar);
    }

    public SubSolution(Object pub_obj) {
        super(pub_obj);
    }

    public SubSolution(Double doubleVar, String stringVar)
    {
        super(doubleVar, stringVar);
    }

    public SubSolution(String stringVar, Double doubleVar)
    {
        super(stringVar, doubleVar);
    }
}
