package com.gloriane;

public class DairyDrink  extends Product {
    private String fatContent;

    public DairyDrink(String fatContent, int id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.fatContent = fatContent;
    }

    public String getDescription() {
        return super.getDescription() + ", Fat Content: " + fatContent;
    }
}
