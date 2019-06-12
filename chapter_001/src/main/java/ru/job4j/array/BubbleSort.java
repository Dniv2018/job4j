package ru.job4j.array;

/**
 * Реализация метода пузырьковой сортировки
 * @author Dmitry Nikolaev (dymy@yandex.ru)
 * @since 2019-06-12
 */
public class BubbleSort {

    public int[] sort(int[] fury){
        int broker;
        int len = fury.length-1;
        for (int i=0; i<len; i++){
            for (int j=0; j<len-i; j++){
                if (fury[j]>fury[j+1]){
                    broker = fury[j];
                    fury[j] = fury[j+1];
                    fury[j+1] = broker;
                }
            }
        }
        return fury;
    }
}
