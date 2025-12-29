package com.gloriane;

public class Salad extends Product{
    private String dressingType;

    public Salad(String dressingType, int id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.dressingType = dressingType;
    }

    public String getDescription() {
        return super.toString() + ", Dressing Type: " + dressingType;
    }
}
