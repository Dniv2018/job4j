package ru.job4j.array;

public class MergeTwoArray {
    public int [] mergeTwoArray(int[] firstArray, int[] secondArray) {
        int lengthResult = firstArray.length + secondArray.length;
        int[] result = new int[lengthResult];
        int lengthFirstArray  = firstArray.length;
        int lengthSecondArray = secondArray.length;
        int countFirstArray = 0;
        int countSecondArray = 0;
        for (int i = 0; i < lengthResult; i++){
            if ((countFirstArray < lengthFirstArray) & (countSecondArray < lengthSecondArray)){
                if (firstArray[countFirstArray] <= secondArray[countSecondArray]){
                    result[i] = firstArray[countFirstArray];
                    countFirstArray++;
                }
                else {
                    result[i] = secondArray[countSecondArray];
                    countSecondArray++;
                }
                continue;
            }
            if ((countFirstArray >= lengthFirstArray) & (countSecondArray < lengthSecondArray)){
                result[i] = secondArray[countSecondArray];
                countSecondArray++;
            }
            if ((countFirstArray < lengthFirstArray) & (countSecondArray >= lengthSecondArray)){
                result[i] = firstArray[countFirstArray];
                countFirstArray++;
            }

        }
        return result;
    }
}
