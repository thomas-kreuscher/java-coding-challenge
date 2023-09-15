package com.example.newsapp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Nachrichtenvermittlung {
    private Map<String, List<Empfaenger>> empfängerMap = new HashMap<>();

    public void registriereEmpfaenger(String typ, Empfaenger empfänger) {
        empfängerMap.computeIfAbsent(typ, k -> new ArrayList<>()).add(empfänger);
        System.out.println("EMpfängermap: " + empfängerMap);
    }

    public void übergebeNachricht(String typ, Nachricht nachricht) {
        List<Empfaenger> empfängerList = empfängerMap.get(typ);
        System.out.println("EMpfängerliste: " + empfängerList);
        if (empfängerList != null) {
            for (Empfaenger empfänger : empfängerList) {
                empfänger.empfangeNachricht(nachricht);
            }
        }
    }
}
