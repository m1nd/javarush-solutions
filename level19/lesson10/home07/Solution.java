package com.javarush.test.level19.lesson10.home07;

/* Длинные слова
В метод main первым параметром приходит имя файла1, вторым - файла2
Файл1 содержит слова, разделенные пробелом.
Записать через запятую в Файл2 слова, длина которых строго больше 6
Закрыть потоки. Не использовать try-with-resources

Пример выходных данных:
длинное,короткое,аббревиатура
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        if (args.length != 2){ return;}

        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(args[0]), "utf-8"));
        BufferedWriter fileWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(args[1]), "utf-8"));

        boolean first = true;
        while (fileReader.ready()){
            String data = "";
            if (!(data = fileReader.readLine()).equals(""))
            {
                String[] strArray = data.split(" ");
                for (String str : strArray){
                    if (str.length() > 6){
                        if (first){
                            fileWriter.write(str);
                            first = false;
                        } else
                        {
                            fileWriter.write("," + str);
                        }
                    }
                }
            } else {
              continue;
            }
        }

        fileReader.close();
        fileWriter.close();

    }
}
