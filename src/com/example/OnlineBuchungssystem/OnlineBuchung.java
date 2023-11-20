package com.example.OnlineBuchungssystem;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class OnlineBuchung {

  private Object[][] data_stored; 
  
  public OnlineBuchung() {
    this.data_stored = new Object[20][4];;
  }

  // Platzreservierung
  public void reserveSeat(int seat, int row) {
    if (this.data_stored[seat][row] == null) {
      this.data_stored[seat][0] = seat;
      this.data_stored[seat][row] = "X";
      System.out.println("Platz wurde reserviert.");
    } else {
      System.out.println("Platz is schon reserviert.");
    }
  }


  // Verfügbare Sitzplätze anzeigen
  public void displaySeats() {
    JFrame frame = new JFrame();
    String[] columnNames = { "SitzplatzNummer", "Reihe A", "Reihe B", " Reihe C" };
    JTable table = new JTable(this.data_stored, columnNames);
    table.setFillsViewportHeight(true);
    JScrollPane scrollPane = new JScrollPane(table);


    frame.add(scrollPane);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 400);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }

}
