package ru.job4j.loop;

public class Factorial {
    public int calc(int n) {
        int result = 0;
        for (int i=0; i<=n; i++){
            result = i==0 ? 1: result*i;
            }
        return result;
    }
}
