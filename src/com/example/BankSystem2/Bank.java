package com.example.BankSystem2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// verwaltet Liste on Bankkonten
// erstellt neue Konten
// suchen und löschen von Konten anhand kto_id

public class Bank {

  private Map<Integer, List<BankAccount>> accountsMap = new HashMap<>();

  public void createAccount(BankAccount bankAccount) {
    accountsMap.computeIfAbsent(bankAccount.getKtoId(), k -> {
      List<BankAccount> list = new ArrayList<>();
      list.add(bankAccount);
      return list;
    });
  }


  public void startTransaction(BankAccount bankAccount1, BankAccount bankAccount2, Transaction transaction) {
    Integer kto_Stand = (Integer) bankAccount1.getKontostand();
    if (kto_Stand != null) {
      transaction.doTransaction(bankAccount1, bankAccount2);
    }
  }


  public void printAccountsMap() {

    // Konten und aktuelle Kontostände anzeigen.
    System.out.println("----------KONTEN UND KONTOSTÄNDE:----------- ");

    for (Map.Entry<Integer, List<BankAccount>> entry : accountsMap.entrySet()) {

      int accountId = entry.getKey();
      List<BankAccount> bankAccounts = entry.getValue();

      System.out.println("Account ID: " + accountId);
      // System.out.println("Bank Account after: " + bankAccounts);

      for (BankAccount bankAccount : bankAccounts) {
        System.out.println("Account Name: " + bankAccount.getInhaber());
        System.out.println("Kontostand: " + bankAccount.getKontostand() + " Euro");
        // Print other attributes using getter methods
      }
    }
  }

  
  public void queryBalance(BankAccount bankAccount) {

    // Aktuellen Kontostand abzufragen.
    System.out.println(bankAccount.getKontostand());

  }


  public void queryTransactHist(BankAccount bankAccount) {

    // Implementieren Sie eine Funktion zum Anzeigen des Transaktionsverlaufs für ein Konto,
    // einschließlich Einzahlungen, Auszahlungen und Überweisungen.
    System.out.println("----------TRANSAKTIONENHISTORIE:-------------- ");
    System.out.println("Konto " + bankAccount.getTransactionHistory());
  }


  public void searchAccount(int ktoID) {

    // Suchen von Konten anhand der Kontonummer
    System.out.println("--------------------KONTOSUCHE: ---------------");
      
    boolean foundID = false;
    for (Map.Entry<Integer, List<BankAccount>> entry : accountsMap.entrySet()) {

      // int accountId = entry.getKey();
      List<BankAccount> accountList = entry.getValue();

      for (BankAccount account : accountList) {
        if (account.getKtoId() == ktoID) {
          foundID = true;
          System.out.println("Result of Account Search: " + account.getInhaber() + " Guthaben: " + account.getKontostand() + " Euro.");
        }
      }
    }
    if (foundID == false) {
      System.out.println("No results found..");
    }
  }


  public void deleteAccount(int ktoID) {

    // Löschung von Konten anhand der Kontonummer
    System.out.println("--------------KONTOLÖSCHUNG:--------------");
      
    boolean deletedID = false;
    for (Map.Entry<Integer, List<BankAccount>> entry : accountsMap.entrySet()) {

      // int accountId = entry.getKey();
      List<BankAccount> accountList = entry.getValue();

      for (BankAccount account : accountList) {
        if (account.getKtoId() == ktoID) {
          deletedID = true;
          System.out.println("Konto: " + account.getInhaber() + " wird gelöscht");
        }
      }
    }
    if (deletedID == false) {
      System.out.println("No account to remove..");
    }
    accountsMap.remove(ktoID);
  }
}
