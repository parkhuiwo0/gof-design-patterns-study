package com.parkhuiwo0.designpatterns.gofdesignpatterns.structure.composite._01_before;

public class Item {

    private String name;

    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }
}
