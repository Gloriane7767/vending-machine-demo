package com.gloriane;

import java.util.Scanner;

public class ConsoleUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        VendingMachine vm = new VendingMachine();

        boolean running = true;

        while (running) {
            System.out.println("\nWelcome to the Vending Machine!");
            System.out.println("1. View Products");
            System.out.println("2. Add Money");
            System.out.println("3. Buy Product");
            System.out.println("4. View Balance");
            System.out.println("5. End Session and Return Money");
            System.out.print("Enter your choice (1-5): ");
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (choice) {
                case 1: {
                    System.out.println("Available Products:");
                    for (Product product : vm.getProducts()) {
                        System.out.println(product.getDescription());
                    }
                    break;
                }
                case 2: {
                    System.out.print("Enter coin (1, 2, 5, 10, 20, 50): ");
                    if (scanner.hasNextDouble()) {
                        double coin = scanner.nextDouble();
                        scanner.nextLine(); // consume newline
                        vm.insertCoin(coin);
                    } else {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.nextLine();
                    }
                    break;
                }
                case 3: {
                    System.out.print("Enter product ID: ");
                    if (scanner.hasNextInt()) {
                        int productId = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        Product purchased = vm.purchaseProduct(productId);
                        if (purchased != null) {
                            System.out.println("Enjoy your " + purchased.getName() + "!");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.nextLine();
                    }
                    break;
                }
                case 4:
                    System.out.println("Current Balance: $" + vm.getBalance());
                    break;

                case 5: {
                    vm.returnChange();
                    running = false;
                    break;
                }
                default:
                    System.out.println("Invalid choice.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
