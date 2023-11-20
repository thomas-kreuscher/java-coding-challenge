package com.example.BankSystem;

public class BankSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();

        BankAccount account1 = bank.createAccount("Alice", 1000);
        BankAccount account2 = bank.createAccount("Bob", 1500);

        account1.transfer(account2, 500);

        System.out.println("Account Details:");
        bank.displayAllAccounts();
    }
}