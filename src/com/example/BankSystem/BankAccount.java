package com.example.BankSystem;


import java.util.Date;

class BankAccount {
    private static int accountNumberCounter = 1000;

    private int accountNumber;
    private String accountHolder;
    private double balance;
    private Date creationDate;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountNumber = generateAccountNumber();
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.creationDate = new Date();
    }

    private int generateAccountNumber() {
        return ++accountNumberCounter;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " into account #" + accountNumber);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from account #" + accountNumber);
            return true;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
            return false;
        }
    }

    public void transfer(BankAccount recipient, double amount) {
        if (withdraw(amount)) {
            recipient.deposit(amount);
            System.out.println("Transferred $" + amount + " from account #" + accountNumber + " to account #" + recipient.getAccountNumber());
        } else {
            System.out.println("Transfer failed.");
        }
    }
}
