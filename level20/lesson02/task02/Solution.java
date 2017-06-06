package com.javarush.test.level20.lesson02.task02;

import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

/* Читаем и пишем в файл: JavaRush
Реализуйте логику записи в файл и чтения из файла для класса JavaRush
В файле your_file_name.tmp может быть несколько объектов JavaRush
Метод main реализован только для вас и не участвует в тестировании
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User user = new User();
            user.setFirstName("Ivan");
            user.setLastName("Ivanov");
            Date date = new Date();
            user.setBirthDate(date);
            user.setMale(true);
            user.setCountry(User.Country.RUSSIA);

            javaRush.users.add(user);
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {

            PrintWriter printWriter = new PrintWriter(outputStream);
            if (this.users != null)
            {
                String isHumanPresent = users != null ? "yes" : "no";
                printWriter.println(isHumanPresent);
                int len = users.size();
                printWriter.println(len);
                if (len > 0)
                {
                    for (User user : users)
                    {
                        printWriter.println(user.getFirstName());
                        printWriter.println(user.getLastName());
                        printWriter.println(user.getBirthDate());
                        printWriter.println(user.isMale());
                        printWriter.println(user.getCountry());
                    }
                }
            }
            printWriter.close();

        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String isHumanPresent = reader.readLine();
            if ("yes".equals(isHumanPresent))
            {
                int len = Integer.parseInt(reader.readLine());
                if (len > 0)
                {
                    for (int i = 0; i < len; i++)
                    {
                        User user = new User();
                        user.setFirstName(reader.readLine());
                        user.setLastName(reader.readLine());
                        SimpleDateFormat sdf = new SimpleDateFormat("E MMM dd HH:mm:ss z y", Locale.ENGLISH);           // дата не может быть пустой?
                        String str = reader.readLine();
                        if (str.length() == 0) continue;
                        Date date = sdf.parse(str);
                        user.setBirthDate(date);
                        user.setMale(Boolean.parseBoolean(reader.readLine()));
                        user.setCountry(User.Country.valueOf(reader.readLine()));
                        users.add(user);
                    }
                }
            }

            reader.close();

        }
    }
}
