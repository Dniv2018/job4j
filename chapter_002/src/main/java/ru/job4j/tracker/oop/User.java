package ru.job4j.tracker.oop;


public class User {
    /**
     * Эти переменные - поля класса
     * Потому что они объявляются внутри класа, а не метода и инициализируются автоматически
     * поэтому позможны методы
     * @see User#giveName()
     * @see User#giveAge()
     * А также возможна операция сравнения метода
     * @see User#canDrive()
     */
    private String name;
    private int age;

    public boolean canDrive() {
        /**
         * Эта переменная (can) - локальная, т.к. она объявляется внутри метода.
         * Автоматически она инициализируется случайным значением, но для устранения
         * этой ошибки компилятор выдаст ошибку. Поэтому значение присваивается явно.
         * И становится возможной операция if
         */
        boolean can = false;
        if (age >= 18) {
            can = true;
        }
        return can;
    }

    public String giveName(){
        return name;
    }

    public int giveAge(){
        return age;
    }
}