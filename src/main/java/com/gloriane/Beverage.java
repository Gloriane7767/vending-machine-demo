package com.gloriane;

public class Beverage extends Product {
    private String size;

    public Beverage(int id, String name, double price, int quantity, String size) {
        super(id, name, price, quantity);
        this.size = size;
    }

    @Override
    public String getDescription() {
        return super.toString() + ", Size: " + size;
    }
}
