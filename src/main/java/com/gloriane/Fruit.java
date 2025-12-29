package com.gloriane;

public class Fruit extends Product{
    private String origin;

    public Fruit(int id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.origin = origin;
    }

   public  String getDescription() {
       return super.toString() + ", Origin: " + origin;
    }
}
