package com.example.BankSystem;

import java.util.ArrayList;
import java.util.List;

class Bank {
    private List<BankAccount> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public BankAccount createAccount(String accountHolder, double initialBalance) {
        BankAccount newAccount = new BankAccount(accountHolder, initialBalance);
        accounts.add(newAccount);
        return newAccount;
    }

    public BankAccount findAccount(int accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    public void displayAllAccounts() {
        for (BankAccount account : accounts) {
            System.out.println("Account #" + account.getAccountNumber() +
                    " - Holder: " + account.getAccountHolder() +
                    ", Balance: $" + account.getBalance());
        }
    }
}