package com.javarush.test.level13.lesson02.task07;

/* Параметризованый интерфейс
В классе StringObject реализуй интерфейс SimpleObject с параметром типа String.
*/

import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
    }

    interface SimpleObject<T>
    {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject<String>
    {
        public SimpleObject<String> getInstance(){

            return null;
        }
    }
}
