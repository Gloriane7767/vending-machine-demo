package com.gloriane;

// Fields: Represents a product in the vending machine
public abstract class Product {
    private  int id;
    private  String name;
    private  double price;
    private int quantity;

    // Constructor
    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters
    public static int getId() {
        return id;
    }

    public static String getName() {
        return name;
    }

    public static double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters to update product details
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Abstract method: each subclass will define its own description
    public abstract String getDescription();
    }


