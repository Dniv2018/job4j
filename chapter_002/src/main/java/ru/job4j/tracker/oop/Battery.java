package ru.job4j.tracker.oop;

public class Battery {
    private int load;

    public Battery(int charge) {
        this.load = charge;
    }

    public void exchange(Battery another) {
        another.load = another.load + this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(50);
        Battery second = new Battery(30);
        System.out.println("Батареи до:");
        System.out.println("Заряд первой батареи : " + first.load + ". Заряд второй батареи : " + second.load + ".");
        first.exchange(second);
        System.out.println("Батареи после:");
        System.out.println("Заряд первой батареи : " + first.load + ". Заряд второй батареи : " + second.load + ".");
    }
}
