package com.gloriane;

public class Juice extends Product {
    private String fruitType;

    public Juice(int id, String name, double price, int quantity, String fruitType) {
        super(id, name, price, quantity);
        this.fruitType = fruitType;
    }

    @Override
    public String getDescription() {
        return super.toString() + ", Fruit Type: " + fruitType;
    }
}
