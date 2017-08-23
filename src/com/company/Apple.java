package com.company;

public class Apple extends Fruit {

    String colour;

    public Apple(String name, double price, String colour) {
        super(name, price);
        this.colour = colour;
    }

    public String getColour() {
        return this.colour;
    }

}
