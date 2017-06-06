package com.javarush.test.level14.lesson06.home01;

public class RussianHen extends Hen implements Country {

    int getCountOfEggsPerMonth() { return 300; }

    String getDescription(){ return super.getDescription() +  " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц." ; }
}
