package com.gloriane;

public class Sandwich extends Product{
    private String breadType;

    public Sandwich(String breadType, int id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.breadType = breadType;
    }

    public String getDescription() {
        return super.getDescription() + ", Bread Type: " + breadType;
    }
}
