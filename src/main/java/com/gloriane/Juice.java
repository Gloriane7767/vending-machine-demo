package com.gloriane;

public class Juice extends Product {
    private String fruitType;

    public Juice(String fruitType, int id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.fruitType = fruitType;
    }

    public String getDescription() {
        return super.getDescription() + ", Fruit Type: " + fruitType;
    }
}
