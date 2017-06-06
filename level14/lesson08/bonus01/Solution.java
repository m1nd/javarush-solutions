package com.javarush.test.level14.lesson08.bonus01;

import java.io.CharConversionException;
import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import java.nio.file.FileSystemException;
import java.rmi.RemoteException;
import java.security.acl.AclNotFoundException;
import java.util.ArrayList;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            int [] array = new int[0];
            array[2] = 2;
        } catch (Exception e){
            exceptions.add(e);
        }

        try
        {
            throw new ClassCastException();
        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            String str = null;
            str.charAt(3);

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            throw new RuntimeException();

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            throw new IOException();

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            throw new CharConversionException();
        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            throw new ClosedChannelException();
        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            throw new InterruptedException();
        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            throw new RemoteException();
        } catch (Exception e)
        {
            exceptions.add(e);
        }



    }
}
