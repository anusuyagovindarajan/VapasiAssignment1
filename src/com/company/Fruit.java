package com.company;

abstract public class Fruit {

    String name;
    double price;

    public Fruit(String name , double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

}
