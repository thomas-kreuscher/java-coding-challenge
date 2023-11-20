package com.example.BankSystem2;


// empfängt Geld (Einzahlung)
// sendet Geld (Überweisung)
// fragt Kto-Stand ab

public class TypspezifischeTransaction implements Transaction {

  private String typ;
  private int betrag;

  public TypspezifischeTransaction(String typ, int betrag) {
    this.typ = typ;
    this.betrag = betrag;
  }



  @Override
  public void doTransaction(BankAccount bankAccount1, BankAccount bankAccount2) {

    int ktoStand = (int) bankAccount1.getKontostand();

    if (typ.equals("send") && betrag >=0 && ktoStand >= 100 + betrag) {  // überweisen

      bankAccount1.subtractFromKontostand(betrag);
      bankAccount2.addToKontostand(betrag);

      String log = bankAccount1.getKtoId() + ": " + betrag + " Euro wurden überwiesen an Konto " + bankAccount2.getInhaber() + " am " + bankAccount1.getDatum();
      bankAccount1.setTransactionHistory(log);
      
      System.out.println("Geldbetrag von " 
      + betrag + " Euro wurden überwiesen von Konto " 
      + bankAccount1.getInhaber() + " an Konto " 
      + bankAccount2.getInhaber()
      + ". Neuer Kontostand von " 
      + bankAccount1.getInhaber() 
      + ": " + bankAccount1.getKontostand() 
      +  " und von " + bankAccount2.getInhaber() 
      + ": " + bankAccount2.getKontostand());
      
    } else if (typ.equals("receive")) {  // einzahlen
      bankAccount1.addToKontostand(betrag);

      String log = bankAccount1.getKtoId() + ": " + betrag + " Euro wurden eingezahlt am " + bankAccount1.getDatum();
      bankAccount1.setTransactionHistory(log);

      System.out.println("Geldbetrag von " 
      + betrag 
      + " Euro wurden eingezahlt in Konto " 
      + bankAccount1.getInhaber()
      + ". Neuer Kontostand von " 
      + bankAccount1.getInhaber() 
      + ": " + bankAccount1.getKontostand());

    } else if (typ.equals("withdrawel")) {  // abheben
      bankAccount1.subtractFromKontostand(betrag);

      String log = bankAccount1.getKtoId() + ": " + betrag + " Euro wurden abgehoben am " + bankAccount1.getDatum();
      bankAccount1.setTransactionHistory(log);

      System.out.println("Geldbetrag von " 
      + betrag 
      + " Euro wurden abgehoben von Konto " 
      + bankAccount1.getInhaber()
      + ". Neuer Kontostand von " 
      + bankAccount1.getInhaber() 
      + ": " + bankAccount1.getKontostand());

    } else {
      System.out.println("Kontostand zu niedrig für eine Überweisung.");
    }
  }
}

