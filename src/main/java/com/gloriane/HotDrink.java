package com.gloriane;

public class HotDrink  extends Product {
    private boolean hasCaffeine;

    public HotDrink(int id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.hasCaffeine = hasCaffeine;
    }

    public String getDescription() {
        return super.toString() + ", Has Caffeine: " + hasCaffeine;
    }
}
