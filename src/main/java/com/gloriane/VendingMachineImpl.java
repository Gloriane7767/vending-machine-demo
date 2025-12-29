package com.gloriane;

public  static class IVendingMachine {

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

    // Get current balance
    public double getBalance() {
        return depositPool;
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
    public String request(int productId) {
        Product product = findProductById(productId);

        if (product == null){
                return "Product out of stock!";
        }

        if (product.getQuantity() <= 0 ) {
            return "Product out of stock!";
        }

        if (depositPool < Product.getPrice()) { // Check if enough money is available
            return "Not enough money!";
        }
        depositPool -= (int) Product.getPrice(); // Deduct price from deposit pool
        product.setQuantity(product.getQuantity()-1); // Decrease product quantity
        return "Product bought: " + product + Product.getName();
            }
    }

    // Method to return remaining money and reset deposit pool
    public double endSession() {
        int moneyBalance = depositPool;
        depositPool = 0;
        return moneyBalance;
    }

    // Method to list all available products
    public String[] getProducts() {
        String[] return new String[getProducts().length];

        for(int i = 0; i < products.length; i++) {
            Product product = products[i];
            return[i] =
                "ID: " + product.getId() +
                        ", Name: " + product.getName() +
                        ", Price: $" + product.getPrice() +
                        ", Quantity: " + product.getQuantity()

        };
    }

