package com.gloriane;

public class Beverage extends Product {
    private String size;

    public Beverage(String size, int id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.size = size;
    }

    @Override
    public String getDescription() {
        return super.toString() + ", Size: " + size;
    }
}
