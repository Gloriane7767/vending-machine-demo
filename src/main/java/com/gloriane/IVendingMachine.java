package com.gloriane;

public class IVendingMachine {

    // Step 3: Create the Vending Machine class
    int depositPool = 0; // Stores deposited money
    final int[] validMoney = {1, 2, 5, 10, 20, 50};

    // Manually defining products
    Product Snack = new Product(1, "Chips", 2.50, 10);
    Product Beverage = new Product(2, "Soda", 1.50, 15);
    Product Fruit = new Product(4, "Apple", 0.75, 30);
    Product Candy = new Product(3, "Chocolate Bar", 1.00, 20);
    Product Cookie = new Product(5, "Cookies", 1.25, 25);
    Product HotDrink = new Product(6, "Coffee", 2.00, 10);
    Product DairyDrink = new Product(7, "Milk", 1.75, 12);
    Product Sandwich = new Product(8, "Ham Sandwich", 3.00, 8);
    Product Salad = new Product(9, "Caesar Salad", 4.00, 5);
    Product Juice = new Product(10, "Orange Juice", 2.25, 20);

    // Method to add currency to deposit pool
    public boolean addCurrency(int amount) {
        for (int money : validMoney) { // Check if the amount is valid
            if (amount == money) {
                depositPool += amount; // Add money to deposit pool
                return true;
            }
        }
        return false; // Return false if money is invalid
    }

    // Method to get current balance
    public int getBalance() {
        return depositPool;
    }

    // Method to buy a product
    public String request(int productId) {
        Product product = null;
        if (productId == Snack.getId()) {
            product = Snack;
        } else if (productId == Beverage.getId()) {
            product = Beverage;
        } else if (productId == Candy.getId()) {
            product = Candy;
        } else if (productId == Cookie.getId()) {
            product = Cookie;
        } else if (productId == HotDrink.getId()) {
            product = HotDrink;
        } else if (productId == DairyDrink.getId()) {
            product = DairyDrink;
        } else if (productId == Sandwich.getId()) {
            product = Sandwich;
        } else if (productId == Salad.getId()) {
            product = Salad;
        } else if (productId == Juice.getId()) {
            product = Juice;
        }

        if (product != null) {
            if (depositPool >= product.getPrice()) { // Check if enough money is available
                depositPool -= (int) product.getPrice(); // Deduct price from deposit pool
                return "Product bought: " + product.getProductName() + "\n" + product.setId();
            } else {
                return "Not enough money!";
            }
        }
        return "Product not found!";
    }

    // Method to return remaining money and reset deposit pool
    public int endSession() {
        int moneyChange = depositPool;
        depositPool = 0;
        return moneyChange;
    }

    // Method to list all available products
    public String[] getProducts() {
        return new String[]{
                Snack.getDescription(),
                Beverage.getDescription(),
                Candy.getDescription(),
                Cookie.getDescription(),
                HotDrink.getDescription(),
                DairyDrink.getDescription(),
                Sandwich.getDescription(),
                Salad.getDescription(),
                Juice.getDescription()
        };
    }
}
