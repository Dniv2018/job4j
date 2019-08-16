package ru.job4j.calculator;

public class Calculator {

    public static int add(int first, int second) {
        int result =  first + second;
        System.out.println(first + "+" + second + " = " + result);
        return result;
    }

    public static void main(String[] args) {
        add(1, 1);
    }
}
