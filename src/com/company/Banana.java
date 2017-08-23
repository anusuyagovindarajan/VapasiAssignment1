package com.company;

public class Banana extends Fruit {

    String colour;

    public Banana(String name, double price, String colour) {
        super(name, price);
        this.colour = colour;
    }

    public String getColour() {
        return this.colour;
    }
}
