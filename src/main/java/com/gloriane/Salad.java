package com.gloriane;

public class Salad extends Product{
    private String dressingType;

    public Salad(int id, String name, double price, int quantity, String dressingType) {
        super(id, name, price, quantity);
        this.dressingType = dressingType;
    }

    @Override
    public String getDescription() {
        return super.toString() + ", Dressing Type: " + dressingType;
    }
}
