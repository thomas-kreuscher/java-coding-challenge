package com.example.newsapp;

import java.util.Arrays;

class TypspezifischerEmpfaenger implements Empfaenger {
    
    private String typ;

    public TypspezifischerEmpfaenger(String typ) {
        this.typ = typ;
    }

    @Override
    public void empfangeNachricht(Nachricht nachricht) {
        Object inhalt = nachricht.getInhalt();

        if (inhalt instanceof String && typ.equals("Text")) {
            String textInhalt = (String) inhalt;
            System.out.println("Textnachricht empfangen: " + textInhalt +
                    " (ID: " + nachricht.getId() +
                    ", Sendezeitpunkt: " + nachricht.getSendezeitpunkt() + ")");
        } else if (inhalt instanceof byte[] && typ.equals("Binär")) {
            byte[] binärInhalt = (byte[]) inhalt;
            System.out.println("Binärnachricht empfangen: " +
                    " (ID: " + nachricht.getId() +
                    ", Sendezeitpunkt: " + nachricht.getSendezeitpunkt() +
                    ", Länge: " + binärInhalt.length +
                    ", Erste 4 Bytes: " + Arrays.toString(Arrays.copyOfRange(binärInhalt, 0, 4)));
        }
    }
}
