package ru.job4j.tracker.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball kBall = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();

        kBall.troll();
        hare.tryEat(kBall);
        kBall.troll();
        wolf.tryEat(kBall);
        kBall.troll();
        fox.tryEat(kBall);
        kBall.eaten();
    }
}
