package com.gloriane;

public class Sandwich extends Product{
    private String breadType;

    public Sandwich(int id, String name, double price, int quantity, String breadType) {
        super(id, name, price, quantity);
        this.breadType = breadType;
    }

    @Override
    public String getDescription() {
        return super.toString() + ", Bread Type: " + breadType;
    }
}
