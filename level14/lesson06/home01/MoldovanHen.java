package com.javarush.test.level14.lesson06.home01;

public class MoldovanHen extends Hen implements Country {

    int getCountOfEggsPerMonth() { return 200; }

    String getDescription(){ return super.getDescription() +  " Моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц." ; }
}
