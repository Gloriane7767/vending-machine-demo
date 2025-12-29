package com.gloriane;

import java.util.Scanner;

public class ConsoleUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // FIX: use a class that implements the interface
        IVendingMachine vm = new VendingMachine();

        boolean running = true;

        while (running) {
            System.out.println("\nWelcome to the Vending Machine!");
            System.out.println("1. View Products");
            System.out.println("2. Add Money");
            System.out.println("3. Buy Product");
            System.out.println("4. View Balance");
            System.out.println("5. End Session and Return Money");
            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1: {
                    System.out.println("Available Products:");
                    for (String product : vm.getproductName ()) {
                        System.out.println(product);
                    }
                    break;
                }
                case 2: {
                    System.out.print("Enter amount to add: ");
                    int amount = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.println(vm.addCurrency(amount) ? "Money added: $" + amount : "Invalid amount.");
                    break;
                }
                case 3: {
                    System.out.print("Enter product ID: ");
                    int productId = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.println(vm.request(productId));
                    break;
                }
                case 4:
                    System.out.println("Current Balance: $" + vm.getBalance());
                    break;
                case 5: {
                    System.out.println("Returning money: $" + vm.endSession());
                    running = false;
                    break;
                }
                default:
                    System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }
}
