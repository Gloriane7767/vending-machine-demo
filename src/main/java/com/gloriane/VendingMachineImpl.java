package com.gloriane;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine implements IVendingMachine {

    // Step 3: Create the Vending Machine class
    private int balance = 0; // Stores deposited money
    private final int[] validCoins = {1, 2, 5, 10, 20, 50};
    private List<Product> products = new ArrayList<>();

    // Initialize products
    public void IVendingMachineImpl() {
        products.add(new Snack(1, "Chips", 2.50, 10));
        products.add(new Beverage(2, "Soda", 1.50, 15));
        products.add(new Fruit(4, "Apple", 0.75, 30));
        products.add(new Candy(3, "Chocolate Bar", 1.00, 20));
        products.add(new Cookie(5, "Cookies", 1.25, 25));
        products.add(new HotDrink(6, "Coffee", 2.00, 10));
        products.add(new DairyDrink(7, "Milk", 1.75, 12));
        products.add(new Sandwich(8, "Ham Sandwich", 3.00, 8));
        products.add(new Salad(9, "Caesar Salad", 4.00, 5));
        products.add(new Juice(10, "Orange Juice", 2.25, 20));
    }

    // Method to add currency to deposit pool
    public void insertCoin (int cion) {
        boolean valid = false;
        for (int coin: validCoins) {
            if (coin == cion) {
                balance += cion;
                valid = true;
                break;
            }
        }

        if (!valid) {
            System.out.println("Invalid coin inserted: " + cion);
        }
    }

    // Get current balance
    @Override
    public int getBalance() {
        return 0;
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

    // Method to buy a product
    @Override
    public Product purchaseProduct(int productId) {
        if(Product == null) {
            System.out.println("Product out of stock.");
            return null;
        }
        if(Product.getQuantity() <=0) {
            System.out.println("Insufficient balance!");
            return null;
    }
        // Deduct price and reduce quantity
        balance -= Product.getPrice();
        Product.setQuantity(Product.getQuantity() - 1);
        System.out.println("Product purchased: " + Product.getName());
        return Product;


    }

    @Override
    public int returnChange() {
        int change = balance;
        balance = 0;
        System.out.println("Returning change: " + change);
        return change;
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }
}


