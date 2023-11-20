package com.example.diverse;
// Aufgabe: Palindrom-Überprüfung

// Schreibe eine Java-Funktion, die überprüft, ob eine 
// gegebene Zeichenkette ein Palindrom ist oder nicht. 
// Ein Palindrom ist eine Zeichenkette, die von vorne 
// und von hinten gelesen identisch ist, nachdem alle 
// nicht-alfabetischen Zeichen entfernt wurden.


public class PalindromeChecker {

  static void is_Palindrome(String text) {
    
    text = text.toLowerCase();

    for (int i = 0, j = text.length()-1; i < text.length() && j >= 0; i++, j--) { 
      
      System.out.println(text.charAt(i));
      System.out.println(text.charAt(j));
      
      while (text.charAt(i) != text.charAt(j)) {
        System.out.println("No palindrome!");
        break;
      }
      System.out.println("Yes PALINDROME!");
    }
  }
  
  public static void main(String[] args) {
    String text = "Ebber";
    is_Palindrome(text);
  }
}


