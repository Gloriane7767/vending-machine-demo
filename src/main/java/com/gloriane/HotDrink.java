package com.gloriane;

public class HotDrink  extends Product {
    private boolean hasCaffeine;

    public HotDrink(int id, String name, double price, int quantity, boolean hasCaffeine) {
        super(id, name, price, quantity);
        this.hasCaffeine = hasCaffeine;
    }

    @Override
    public String getDescription() {
        return super.toString() + ", Has Caffeine: " + hasCaffeine;
    }
}
