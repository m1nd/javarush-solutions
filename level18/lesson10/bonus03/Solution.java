package com.javarush.test.level18.lesson10.bonus03;

/* Прайсы 2
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается с одним из следующих наборов параметров:
-u id productName price quantity
-d id
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-u  - обновляет данные товара с заданным id
-d  - производит физическое удаление товара с заданным id (все данные, которые относятся к переданному id)

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        reader.close();
        ArrayList<String> stroki = new ArrayList<String>();
        BufferedReader in1 = new BufferedReader(new FileReader(filename));
        while (in1.ready())
        {
            stroki.add(in1.readLine());
        }
        in1.close();
        BufferedWriter out1;
        if (args[0].equals("-u"))
        {
            String id = args[1];
            String prN="";
            for (int i = 2; i < args.length - 2; i++)
                prN = prN + args[i] + " ";
            String price = args[args.length-2];
            String qua = args[args.length-1];
            String wr = String.format("%-8.8s%-30.30s%-8.8s%-4.4s", id, prN, price, qua);
            for (String aq : stroki)
            {
                String tmp = aq.substring(0, 8).trim();
                if (args[1].equals(tmp))
                {
                    int b = stroki.indexOf(aq);
                    stroki.set(b,wr);
                }
            }
            out1 = new BufferedWriter(new FileWriter(filename));
            for (String ad : stroki)
            {
                out1.write(ad+"\n");
            }
            out1.close();
        } else if (args[0].equals("-d"))
        {
            Iterator<String> it = stroki.listIterator();
            while (it.hasNext())
            {
                String aqd = it.next();
                if (aqd.startsWith(args[1]))
                {
                    it.remove();
                }
            }
            out1 = new BufferedWriter(new FileWriter(filename));
            for (String ad : stroki)
            {
                out1.write(ad+"\n");
            }
            out1.close();
        }
    }
}
