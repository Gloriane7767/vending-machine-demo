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
/*
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
 */
}