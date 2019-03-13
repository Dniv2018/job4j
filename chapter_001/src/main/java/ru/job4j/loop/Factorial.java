package ru.job4j.loop;

public class Factorial {
    public int calc(int n) {
        int result = 1;
//        result++;
        switch (n) {
            case 0:
                return result;
            default:
//                result++;
                for (int i = 1; i <= n; i++) {
                    result = result * i;

                }
//            result = i==0 ? 1: result*i;
//            }
                return result;
        }
    }
}
