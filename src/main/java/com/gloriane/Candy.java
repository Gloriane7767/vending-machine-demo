package com.gloriane;

public class Candy extends Product {
    private String type;

    public Candy(String type, int id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.type = type;
    }

        public  String getDescription() {
            return super.getDescription() + ", Type: " + type;
        }
    }


