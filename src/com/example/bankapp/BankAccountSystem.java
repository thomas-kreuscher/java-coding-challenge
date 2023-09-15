package com.example.bankapp;

public class BankAccountSystem {


  public static void main(String[] args) {

    TypspezifischeTransaction senden = new TypspezifischeTransaction("send", 200);
    TypspezifischeTransaction einzahlen = new TypspezifischeTransaction("receive", 300);

    Bank bank = new Bank();

    BankAccount bankAccount1 = new BankAccount("Thomas", 300);
    BankAccount bankAccount2 = new BankAccount("Susanne", 9000);
    BankAccount bankAccount3 = new BankAccount("Thorsten", 3333);

    bank.createAccount(bankAccount1);
    bank.createAccount(bankAccount2);
    bank.createAccount(bankAccount3);

    bank.startTransaction(bankAccount1, bankAccount2, senden);
    bank.startTransaction(bankAccount3, bankAccount1, senden);
    bank.startTransaction(bankAccount3, bankAccount1, einzahlen);
    
  }

}
