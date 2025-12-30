package com.gloriane;

public class Snack extends Product {
    private String flavor;

    public Snack(int id, String name, double price, int quantity, String flavor) {
        super(id, name, price, quantity);
        this.flavor = flavor;
    }

    @Override
    public String getDescription() {
        return super.toString() + ", Flavor: " + flavor;
    }
}
