package ru.job4j.tracker.oop;

public class Item {
    private String name;
    private int id;

    public Item() {
    }

    public Item(int id) {
        this.id = id;
    }

    public Item(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Item(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        //Item item = new Item();
        Item itemVoid = new Item();
        System.out.println(itemVoid);

        Item itemId = new Item (9);
        System.out.println(itemId.id);

        Item itemNameId = new Item ("Pasha", 10);
        System.out.println(itemNameId.name + " " + itemNameId.id);

        Item itemName = new Item ("Mary");
        System.out.println(itemName.name);
    }
}
