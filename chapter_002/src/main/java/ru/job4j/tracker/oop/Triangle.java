package ru.job4j.tracker.oop;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;
    /**
     * Конструктор
     */
    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    /**
     * Метод вычисления полупериметра по длинам сторон.
     *
     * Формула.
     *
     * (a + b + c) / 2
     *
     * @param a расстояние между точками a b
     * @param b расстояние между точками a c
     * @param c расстояние между точками b c
     * @return Перимент.
     */
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
        //return -1;
    }


    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     *
     * @param ab Длина от точки a b.
     * @param bc Длина от точки b c.
     * @param ac Длина от точки a c.
     * @return Площадь треугольника
     */

    public boolean exist(double ab, double ac, double bc) {
        //return ((ab > 0 & bc > 0 & ac > 0) & ((ab != bc + ac) || (bc != ab + ac) || (ac != ab + bc)));
        return ((ab + bc > ac) || (bc + ac > ab) || (ac + ab > bc));
        //return false;
    }


    /**
     * Метод должен вычислить прощадь треугольканива.
     *
     * Формула.
     *
     * √ p *(p - ab) * (p - ac) * (p - bc)
     *
     * где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
     *
     * @return Вернуть прощадь, если треугольник существует или -1.
     */
    public double area() {
        double rsl = -1;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        double p = period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            rsl = Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
            /* написать формулу для расчета площади треугольника. */
            //rsl = -1;
        }
        return rsl;
    }
}