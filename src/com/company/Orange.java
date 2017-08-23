package com.company;

public class Orange extends Fruit {

    String colour;

    public Orange(String name, double price, String colour) {
        super(name, price);
        this.colour = colour;
    }

    public String getColour() {
        return this.colour;
    }

}
