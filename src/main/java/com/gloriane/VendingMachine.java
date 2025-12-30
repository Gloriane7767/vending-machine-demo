package com.gloriane;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private double balance = 0; // Stores deposited money
    private final int[] validCoins = {1, 2, 5, 10, 20, 50};
    private List<Product> products = new ArrayList<>();

    public VendingMachine() {
        // Manually defining products
        products.add(new Beverage(1, "Cola", 10.0, 5, "Small"));
        products.add(new Candy(2, "Chocolate Bar", 15.0, 5, "Chocolate"));
        products.add(new Cookie(3, "Chips", 20.0, 5, false));
        products.add(new DairyDrink(4, "Milk", 25.0, 5, "Low Fat"));
        products.add(new Fruit(5, "Apple", 30.0, 5, "Red Delicious"));
        products.add(new HotDrink(6, "Coffee", 35.0, 5, true));
        products.add(new Juice(7, "Orange Juice", 40.0, 5, "Freshly Squeezed"));
        products.add(new Salad(8, "Caesar Salad", 45.0, 5, "With Chicken"));
        products.add(new Sandwich(9, "Turkey Sandwich", 50.0, 5, "With Lettuce"));
        products.add(new Snack(10, "Pretzels", 55.0, 5, "Salted"));
    }

    // Method to check if a coin is valid
    private boolean isValidCoin(double coin) {
        for (int validCoin : validCoins) {
            if ((double) validCoin == coin) {
                return true;
            }
        }
        return false;
    }

    public void insertCoin(double coin) {
        if (!isValidCoin(coin)) {
            System.out.println("Invalid coin inserted: " + coin);
            return;
        }
        balance += coin;
        System.out.println("Inserted: $" + coin + ". New balance: $" + balance);
    }

    public double getBalance() {
        return balance;
    }
    // Find product by ID
    private Product findProductById(int productId) {
        for (Product product : products) {
            if (product.getId() == productId) {
                return product;
            }
        }
        return null;
    }

    public Product purchaseProduct(int productId) {
        Product product = findProductById(productId);
        if (product == null) {
            System.out.println("Product not found!");
            return null;
        }

        if (product.getPrice() > balance) {
            System.out.println("Insufficient balance. Please insert more coins.");
            return null;
        }

        if (product.getQuantity() <= 0) {
            System.out.println("Product out of stock.");
            return null;
        }

        // Deduct price from balance and reduce stock
        balance -= product.getPrice();
        product.setQuantity(product.getQuantity() - 1);
        System.out.println("Product purchased: " + product.getName());
        return product;
    }

    public double returnChange() {
        double change = balance;
        balance = 0;
        System.out.println("Returning change: $" + change);
        return change;
    }

    public List<Product> getProducts() {
        return products;
    }
}




