package com.example.BankSystem2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {

  private static int kto_idCounter = 1;
  private int kto_id;
  private Object kto_inhaber;
  private LocalDate erstellungsdatum;
  private int kontostand;
  private List<String> transactHistList = new ArrayList<>();

  public BankAccount(String kto_inhaber, int kontostand) {
    this.kto_id = kto_idCounter++;
    this.erstellungsdatum = LocalDate.now();
    this.kontostand = kontostand;
    this.kto_inhaber = kto_inhaber;
  }

  public int getKtoId() {
    return kto_id;
  }

  public Object getInhaber() {
    return kto_inhaber;
  }

  public LocalDate getDatum() {
    return erstellungsdatum;
  }

  public List<String> getTransactionHistory() {
    return transactHistList;
  }

  public void setTransactionHistory(String log) {
    transactHistList.add(log);
  }

  public int getKontostand() {
    return kontostand;
  }

  public void addToKontostand(int valueToAdd) {
    this.kontostand += valueToAdd;
  }

  public void subtractFromKontostand(int valueToSubtract) {
    this.kontostand -= valueToSubtract;
  }
}
