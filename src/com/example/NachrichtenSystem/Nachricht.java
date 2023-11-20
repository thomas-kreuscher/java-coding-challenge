package com.example.NachrichtenSystem;
import java.time.LocalDateTime;

// Nachrichtenklasse

class Nachricht {
    private static int idCounter = 1;
    private int id;
    private LocalDateTime sendezeitpunkt;
    private Object inhalt;

    public Nachricht(String inhalt) {
        this.id = idCounter++;
        this.sendezeitpunkt = LocalDateTime.now();
        this.inhalt = inhalt;
    }

    public Nachricht(byte[] inhalt) {
        this.id = idCounter++;
        this.sendezeitpunkt = LocalDateTime.now();
        this.inhalt = inhalt;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getSendezeitpunkt() {
        return sendezeitpunkt;
    }

    public Object getInhalt() {
        return inhalt;
    }
}



