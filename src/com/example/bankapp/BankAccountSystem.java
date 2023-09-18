package com.example.bankapp;

public class BankAccountSystem {


  public static void main(String[] args) {

    TypspezifischeTransaction senden = new TypspezifischeTransaction("send", 20);
    TypspezifischeTransaction einzahlen = new TypspezifischeTransaction("receive", 620);
    TypspezifischeTransaction abheben = new TypspezifischeTransaction("withdrawel", 980);

    Bank bank = new Bank();

    BankAccount bankAccount1 = new BankAccount("Thomas", 300);
    BankAccount bankAccount2 = new BankAccount("Susanne", 4007);
    BankAccount bankAccount3 = new BankAccount("Thorsten", 5633);

    bank.createAccount(bankAccount1);
    bank.createAccount(bankAccount2);
    bank.createAccount(bankAccount3);

    bank.printAccountsMap();

    bank.startTransaction(bankAccount1, bankAccount2, senden);
    // bank.startTransaction(bankAccount2, bankAccount3, senden);
    bank.startTransaction(bankAccount3, bankAccount1, einzahlen);
    bank.startTransaction(bankAccount2, bankAccount1, abheben);

    bank.queryBalance(bankAccount2);

    bank.printAccountsMap();

    System.out.println("Transactionlist: ");

    bank.queryTransactHist(bankAccount1);
    bank.queryTransactHist(bankAccount2);
    bank.queryTransactHist(bankAccount3);

    
    // suchen von Konto anhand KtoID
    bank.searchAccount(1);

    bank.printAccountsMap();

    // Löschung von Konto anhand KtoID
    bank.deleteAccount(2);

    bank.printAccountsMap();
  }

}
