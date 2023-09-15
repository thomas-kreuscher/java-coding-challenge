package com.example.bankapp;

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


  public void searchAccount() {
  }

  public void deleteAccount() {
  }

}
