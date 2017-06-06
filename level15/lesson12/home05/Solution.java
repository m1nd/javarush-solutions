package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {

    private Solution(Character chVar){}
    private Solution(Integer integer) {}
    private Solution(String string) {}

    Solution(Integer intVar1, Integer intVar2) {}
    Solution(Integer intVar, String stringVar) {}
    Solution(String stringVar, Integer intVar) {}

    protected Solution(Double doubleVar) {}
    protected Solution(Double doubleVar, Integer intVar) {}
    protected Solution(Integer intVar, Double doubleVar) {}

    public Solution(Object pub_obj) {}
    public Solution(Double doubleVar, String stringVar) {}
    public Solution(String stringVar, Double doubleVar) {}

}

