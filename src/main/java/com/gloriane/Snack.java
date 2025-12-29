package com.gloriane;

public class Snack extends Product {
    private String flavor;

    public Snack(int id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.flavor = flavor;
    }

   public  String getDescription() {
       return super.toString() + ", Flavor: " + flavor;
    }
}
