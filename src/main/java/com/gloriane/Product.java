package com.gloriane;

// Fields: Represents a product in the vending machine
public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;

    // Constructor
    public Product(int id, String name, double price, int quantity) {
       setId();
        setName();
        setPrice();
        setQuantity();
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public int setId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String setName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double setPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int setQuantity() {
        return quantity;
    }

    public String getDescription() {
        return "Id: " + id + ", Name: " + name + ", Price: $" + price + ", Quantity: " + quantity;
    }

    public String getProductName() {
        return name;
    }
}

