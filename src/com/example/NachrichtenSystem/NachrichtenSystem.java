package com.example.NachrichtenSystem;

public class NachrichtenSystem {
    
    public static void main(String[] args) {
        Nachrichtenvermittlung nachrichtenvermittlung = new Nachrichtenvermittlung();
        TypspezifischerEmpfaenger textEmpfaenger = new TypspezifischerEmpfaenger("Text");
        TypspezifischerEmpfaenger binärEmpfaenger = new TypspezifischerEmpfaenger("Binär");

        nachrichtenvermittlung.registriereEmpfaenger("Text", textEmpfaenger);
        nachrichtenvermittlung.registriereEmpfaenger("Binär", binärEmpfaenger);
        

        Nachricht textNachricht = new Nachricht("Steadforce rocks!");
        Nachricht binärNachricht = new Nachricht(new byte[]{0x53, 0x74, 0x65, 0x61, 0x64, 0x66, 0x6F, 0x72, 0x63, 0x65});

        nachrichtenvermittlung.übergebeNachricht("Text", textNachricht);
        nachrichtenvermittlung.übergebeNachricht("Binär", binärNachricht);
    }
}