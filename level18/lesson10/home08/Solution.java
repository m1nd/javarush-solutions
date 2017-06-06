package com.javarush.test.level18.lesson10.home08;

import com.javarush.test.level06.lesson08.task05.StringHelper;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки. Не использовать try-with-resources
*/

public class Solution
{
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();
    public static void main(String[] args) throws IOException, InterruptedException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        while (!"exit".equals(fileName))
        {
            if (fileName != null && !fileName.equals(null) && !fileName.equals(""))
            {
                new ReadThread(fileName).start();
            }
            fileName = reader.readLine();
        }
        reader.close();
    }
    public static class ReadThread extends Thread
    {
        private FileInputStream fileInputStream;
        private String fileName;
        private Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        public ReadThread(String fileName)
        {
            //implement constructor body
            this.fileName = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут
        @Override
        public void run()
        {
            super.run();
            try
            {
                fileInputStream = new FileInputStream(fileName);
                while (fileInputStream.available() > 0)
                {
                    addToMap(fileInputStream.read());
                }
                int max = 0;
                int maxEl = 0;
                for (Map.Entry<Integer, Integer> entry : map.entrySet())
                {
                    if (entry.getValue() > max)
                    {
                        max = entry.getValue();
                        maxEl = entry.getKey();
                    }
                }
                resultMap.put(fileName, maxEl);
                fileInputStream.close();
            }
            catch (FileNotFoundException e)
            {
            }
            catch (IOException e)
            {
            }
        }
        private void addToMap(Integer num) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet())
            {
                if (entry.getKey().equals(num))
                {
                    entry.setValue(entry.getValue() + 1);
                    return;
                }
            }
            map.put(num, 1);
        }
    }
}
