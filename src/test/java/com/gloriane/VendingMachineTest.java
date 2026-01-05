package com.gloriane;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// @Test
// @Order
// @DisplayName
// BeforeEach
// AfterEach


// Test Case 1 — Insert Valid Coin

// Test case for finding valid coins
public class VendingMachineTest {
    @Test
    @DisplayName("Test finding valid coins")

// Scenario: Valid coins are recognized
    void testInsertValidCoin() {
        // 1. Arrange
        VendingMachine vm = new VendingMachine();
        double coinValue = 10.0;

// Expected: Valid coins are recognized
        // 2. Act
        vm.insertCoin(coinValue);

// Assert that valid coins are recognized
        // 3. Assert
        assertEquals(coinValue, vm.getBalance(), "Balance should be equal to the inserted coin value");
    }

    // Test Case 2 — Reject Invalid Coin
    @Test
    @DisplayName("Test that invalid coins do not increase the balance")
    void testInsertInvalidCoin() {
        // 1. Arrange
        VendingMachine vm = new VendingMachine();
        double invalidCoin = 3.0; // 3 is not in {1, 2, 5, 10, 20, 50}

        // 2. Act
        vm.insertCoin(invalidCoin);

        // 3. Assert
        // The balance should still be 0.0 because the coin was rejected
        assertEquals(0.0, vm.getBalance(), "Balance should remain 0.0 after inserting an invalid coin");
    }

    // Test Case 3 — Purchase Product Successfully
    @Test
    @DisplayName("Test purchasing a product successfully")
    void testPurchaseProductSuccessfully() {
        // 1. Arrange
        VendingMachine vm = new VendingMachine();
        double coinValue = 10.0; // Insert sufficient funds
        vm.insertCoin(coinValue);
        int productId = 1; // Assuming product with ID 1 exists and costs 10.0
        double initialBalance = vm.getBalance();

        // 2. Act
        Product purchasedProduct = vm.purchaseProduct(productId);

        // 3. Assert
        assertEquals(productId, purchasedProduct.getId(), "Purchased product ID should match the requested ID");
        assertEquals(initialBalance - 10.0, vm.getBalance(), "Balance should be reduced by the product price after purchase");
    }

    // Test Case 3 — Purchase Fails (Out of Stock)
    @Test
    @DisplayName("Test purchasing a product that is out of stock")
    void testPurchaseProductOutOfStock() {
        // 1. Arrange
        VendingMachine vm = new VendingMachine();
        double coinValue = 50.0; // Insert sufficient funds
        vm.insertCoin(coinValue);
        int productId = 3; // Assuming a product with ID 3 exists

        // Set the product quantity to 0 to simulate out of stock
        for (Product product : vm.getProducts()) {
            if (product.getId() == productId) {
                product.setQuantity(0);
                break;
            }
        }

        // 2. Act
        Product purchasedProduct = vm.purchaseProduct(productId);

        // 3. Assert
        // The purchase should fail and return null
        assertEquals(null, purchasedProduct, "Purchase should fail for out of stock product");
    }

    // Test Case 4 — Return Change Resets Balance
    @Test
    @DisplayName("Test that returning change resets the balance to zero")
    void testReturnChangeResetsBalance() {
        // 1. Arrange
        VendingMachine vm = new VendingMachine();
        double coinValue = 20.0; // Insert some coins
        vm.insertCoin(coinValue);
        // 2. Act
        vm.returnChange();
        // 3. Assert
        assertEquals(0.0, vm.getBalance(), "Balance should be reset to zero after returning change");
    }

    @Test
    @DisplayName("Test purchasing an item and then returning change")
    void testPurchaseAndReturnChange() {
        // 1. Arrange
        VendingMachine vm = new VendingMachine();
        vm.insertCoin(50.0); // Insert 50
        int productId = 1; // Cola costs 10.0

        // 2. Act
        Product purchasedProduct = vm.purchaseProduct(productId);
        vm.returnChange();

        // 3. Assert
        assertEquals(1, purchasedProduct.getId(), "Should have purchased product 1");
        assertEquals(0.0, vm.getBalance(), "Balance should be 0.0 after returning change");
    }
        // Test Case 5 - Get Products Returns All Items
    @Test
    @DisplayName("Test that getProducts returns all items in the vending machine")
    void testGetProductsReturnsAllItems() {
        // 1. Arrange
        VendingMachine vm = new VendingMachine();

        // 2. Act
        int productCount = vm.getProducts().size();

        // 3. Assert
        // Assuming we initialized the vending machine with 3 products
        assertEquals(10, productCount, "getProducts should return all items in the vending machine");
    }

     // Test Case 6 - GetProductsContainsCorrectData
    @Test
    @DisplayName("Test that getProducts returns items with correct data")
    void testGetProductsContainsCorrectData() {
        // 1. Arrange
        VendingMachine vm = new VendingMachine();

        // 2. Act
        Product firstProduct = vm.getProducts().get(0);

        // 3. Assert
        assertEquals(1, firstProduct.getId(), "First product ID should be 1");
        assertEquals("Cola", firstProduct.getName(), "First product name should be Cola");
        assertEquals(10.0, firstProduct.getPrice(), "First product price should be 10.0");
        assertEquals(5, firstProduct.getQuantity(), "First product quantity should be 5");
    }
}