package ru.job4j.tracker.oop;

// Имена Массивов изменены для лучшего понимания процесса работы программы

public class Reduce {
    private int[] arrayClass;
    //private int[] array;

    public void to(int[] array) {
        arrayClass = array;

        //Ошибка была здесь:
        // array = array;
        // Из-за неправильного наименования переменных компилятор
        // использовал локальную переменную метода to(), которую приравнял самой себе

    }

    public void print() {
        for (int index = 0; index < arrayClass.length; index++) {
            System.out.println(arrayClass[index]);
        }
        //for (int index = 0; index < array.length; index++) {
        //    System.out.println(array[index]);
        //}
    }

    public static void main(String[] args) {
        //Создается локальный массив
        int[] arrayLocal = {1, 2, 3};
        //int[] array = {1, 2, 3};

        //Создается объект в котором автоматически создается переменная массива класса с нулевой ссылкой
        Reduce reduce = new Reduce();

        //Ссылка на локальный массив передается переменной массива класса
        reduce.to(arrayLocal);
        //reduce.to(array);

        //вывод на экран массива класса
        reduce.print();
    }
}