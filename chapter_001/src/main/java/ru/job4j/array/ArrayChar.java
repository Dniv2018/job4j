package ru.job4j.array;

@SuppressWarnings("ConstantConditions")
public class ArrayChar {

    /**
     * Проверяет, что слово начинается с префикса.
     * @author Dmitry Nikolaev (dymy@yandex.ru)
     * @since 2019-06-12
     * @param prefix префикс.
     * @return result если слово начинаеться с префикса - true
     */

    public boolean startsWith(String word, String prefix) {
        boolean result = true;
        char[] pref = prefix.toCharArray();
        char[] wrd = word.toCharArray();
        int prefLength = pref.length;
        if (prefLength > wrd.length) return false;
        for (int i=0; i<prefLength; i++) {
            if (pref[i] != wrd[i]) return false;
        }
        return result;
    }
}