package com.gloriane;

public class HotDrink  extends Product {
    private boolean hasCaffeine;

    public HotDrink(boolean hasCaffeine, int id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.hasCaffeine = hasCaffeine;
    }

    public String getDescription() {
        return super.getDescription() + ", Has Caffeine: " + hasCaffeine;
    }
}
