package ru.job4j.tracker.oop;

import org.junit.Test;

public class UserTest {

    @Test
    public void date(){
        User testObj = new User();
        System.out.println(testObj.giveName());
        System.out.println(testObj.giveAge());
        System.out.println(testObj.canDrive());

    }
}
