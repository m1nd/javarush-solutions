package com.javarush.test.level19.lesson10.home05;

/* Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит слова, разделенные пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        if (args.length != 2){ return; }
        String fileNameOne = args[0];
        String fileNameTwo = args[1];
        if (fileNameOne.length() == 0){ return; }
        if (fileNameTwo.length() == 0){ return; }

        String outString = "";
        boolean first = true;

        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileNameOne), "utf-8"));
        BufferedWriter fileWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileNameTwo), "utf-8"));

        while (fileReader.ready()){
            String data = "";
            if (!(data = fileReader.readLine()).equals(""))
            {
                String[] tmpData = data.split(" ");
                Pattern p = Pattern.compile("\\p{L}\\p{Digit}+|\\p{Digit}\\p{L}+|\\p{Punct}\\p{Digit}+|\\p{Digit}\\p{Punct}");
                for (String str : tmpData){
                    Matcher m = p.matcher(str);
                    if (m.find())
                    {
                        if (!outString.equals(""))
                        {
                            outString = outString + " " + str;
                        } else {
                            outString = str;
                            if (first){
                              first = false;
                            } else
                            {
                                fileWriter.write("\r\n");
                            }
                        }
                    }
                }
                outString = outString.trim();
                fileWriter.write(outString);
                outString = "";
            } else {
                continue;
            }
        }

        fileReader.close();
        fileWriter.close();
    }
}
