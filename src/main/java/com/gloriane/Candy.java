package com.gloriane;

public class Candy extends Product {
    private String type;

    public Candy(int id, String name, double price, int quantity, String type) {
        super(id, name, price, quantity);
        this.type = type;
    }

    @Override
    public String getDescription() {
        return super.toString() + ", Type: " + type;
    }
}


