package com.gloriane;

// Fields: Represents a product in the vending machine
public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;

    // Constructor
    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters
    // Getters to retrieve product details
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDescription() {
        return "Id: " + id + ", Name: " + name + ", Price: $" + price + ", Quantity: " + quantity;
    }

    public String getProductName() {
        return name;
    }
}

