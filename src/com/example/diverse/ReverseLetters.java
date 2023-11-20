package com.example.diverse;


public class ReverseLetters {
  // Reversing letters and words: Write a program that reverses 
  // the letters of each word and a program that reverses the 
  // letters of each word and the words themselves.

  static void reverseLettWord(String x) {
    System.out.println(x);
    for (int i = x.length()-1; i>=0; i--) {
      System.out.println(x.charAt(i));
    }

  }
  
  public static void main(String[] args) {

    String text = "Fischsuppe essen";
    System.out.println("----------");
    System.out.println("This is the String = " + text);
    reverseLettWord(text);
  }


}
