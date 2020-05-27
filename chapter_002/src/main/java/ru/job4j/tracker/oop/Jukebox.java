package ru.job4j.tracker.oop;

public class Jukebox {
    private String song;
    private void music(int position) {
        if (position == 1) {
            song = "Пусть бегут неуклюже пешеходы по лужам";
        } else {
            if (position == 2) {
                song = "Спят усталые игрушки";
        } else {
                song = "Песня не найдена";
            }
            }

        System.out.println(song);
    }
    public static void main(String[] args) {
        Jukebox musbox = new Jukebox();
        musbox.music(0);
        musbox.music(2);
        musbox.music(1);
        musbox.music(3);
        musbox.music(7);
        musbox.music(99);
        musbox.music(99999);
    }
}
