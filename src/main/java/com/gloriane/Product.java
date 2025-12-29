package com.gloriane;

// Fields: Represents a product in the vending machine
public class Product {
    private int id;
    private String name;
    private double price;
    private  int quantity;

    // Constructor
    public Product( int id,String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters
    public  int getId() {
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

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
