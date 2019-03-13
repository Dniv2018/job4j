package ru.job4j.loop;

public class Factorial {
    public int calc(int n) {
        int result = 1;
        switch (n) {
            case 0:
                return result;
            default:
                for (int i = 1; i <= n; i++) {
                    result = result * i;

                }
                return result;
        }
    }
}
