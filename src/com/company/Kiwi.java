package com.company;

public class Kiwi extends Fruit {

    String colour;

    public Kiwi(String name, double price, String colour) {
        super(name, price);
        this.colour = colour;
    }

    public String getColour() {
        return this.colour;
    }
}
