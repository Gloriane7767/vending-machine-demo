package com.gloriane;

public class Beverages extends Product {
    private String size;

    public Beverages(String size, int id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.size = size;
    }

   public  String getDescription() {
       return super.getDescription() + ", Size: " + size;
    }
}
