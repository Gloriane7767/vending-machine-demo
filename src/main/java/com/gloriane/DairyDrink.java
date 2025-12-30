package com.gloriane;

public class DairyDrink  extends Product {
    private String fatContent;

    public DairyDrink(int id, String name, double price, int quantity, String fatContent) {
        super(id, name, price, quantity);
        this.fatContent = fatContent;
    }

    @Override
    public String getDescription() {
        return super.toString() + ", Fat Content: " + fatContent;
    }
}
