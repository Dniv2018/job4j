package ru.job4j.array;

public class MergeTwoArray {
    public int[] mergeTwoArray(int[] first, int[] second) {
        int lengthResult = first.length + second.length;
        int[] result = new int[lengthResult];
        int lengthFirst  = first.length;
        int lengthSecond = second.length;
        int countFirst = 0;
        int countSecond = 0;
        for (int i = 0; i < lengthResult; i++) {
            if ((countFirst < lengthFirst) & (countSecond < lengthSecond)) {
                if (first[countFirst] <= second[countSecond]) {
                    result[i] = first[countFirst];
                    countFirst++;
                } else {
                    result[i] = second[countSecond];
                    countSecond++;
                }
                continue;
            }
            if ((countFirst >= lengthFirst) & (countSecond < lengthSecond)) {
                result[i] = second[countSecond];
                countSecond++;
            }
            if ((countFirst < lengthFirst) & (countSecond >= lengthSecond)) {
                result[i] = first[countFirst];
                countFirst++;
            }
        }
        return result;
    }
}
