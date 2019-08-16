package ru.job4j.calculator;

/**
 * Простейший калькулятор.
 * @author Dmitry Nikolaev (dymy@yandex.ru)
 * @since 2018-11-10
 *
 */
public class Calculator {
    private double result;

    /**
     * Метод сложения двух чисел
     * @param first первое число
     * @param second второе число
     */
    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * Метод вычитания второго числа из первого
     * @param first первое число
     * @param second второе число
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }

    /**
     * Метод деления первого числа на второе
     * @param first первое число
     * @param second второе число
     */
    public void div(double first, double second) {
        this.result = first / second;
    }

    /**
     * Метод умножения первого числа на второе
     * @param first первое число
     * @param second второе число
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }

    /**
     * Метод возвращения результата
     */
    public double getResult() {
        return this.result;
    }
}
