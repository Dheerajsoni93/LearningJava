package Java_Basics;

import java.util.Scanner;

public class Bank {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double balance = 0;
        boolean isRunning = true;

        System.out.println("******************************");
        System.out.println("Welcome to the Banking Program");
        System.out.println("******************************");


        while(isRunning){
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter the choice(1-4): ");
            int choice = scanner.nextInt();

            switch (choice){
                case 1 -> getBalance(balance);
                case 2 -> balance = deposit(balance);
                case 3 -> balance = withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE!");
            }
        }
        System.out.println("THANK YOU!");
    }

    static void getBalance(double balance){
        System.out.printf("₹%.2f\n", balance);
    }

    static double deposit(double balance){
        double amount;
        System.out.print("Enter the amount: ");
        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("Amount can't be negative!");
            return balance;
        }

        balance = balance + amount;
        System.out.printf("₹%.2f deposited to your bank account\n", amount);
        System.out.printf("Current Balance is: ₹%.2f\n", balance);
        return  balance;
    }

    static double withdraw(double balance){
        double amount;
        System.out.println("Enter the amount");
        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("Amount can't be negative!");
            return balance;
        } else if(amount > balance){
            System.out.println("Balance insufficient!");
            return balance;
        }
        balance = balance - amount;
        System.out.printf("₹%.2f withdrawn from your bank account\n", amount);
        System.out.printf("Current Balance is: ₹%.2f\n", balance);
        return  balance;
    }
}
