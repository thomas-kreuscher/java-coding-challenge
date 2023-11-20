package com.example.OnlineBuchungssystem;


public class Konsole {

  public static void main(String[] args) {

    OnlineBuchung onlineBuchung = new OnlineBuchung();

    onlineBuchung.reserveSeat(14, 2);
    onlineBuchung.reserveSeat(2, 3);
    onlineBuchung.reserveSeat(19, 3);
    onlineBuchung.reserveSeat(19, 3);
    onlineBuchung.displaySeats();
    
    // onlineBuchung.displaySeats();
    // onlineBuchung.displaySeats();
  
  }
}
