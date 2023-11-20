package com.example.diverse;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NonRepChar {

  public static Entry<Character, Integer> maxOccurenceCharacter(String str) {
    
    // 14. Finding the character with the most
    // appearances: Write a program that finds
    // the character with the most appearances
    // in the given string.
    
    Map<Character, Integer> counter = new HashMap<>();
    char[] chStr = str.toCharArray();
    for (int i = 0; i < chStr.length; i++) {
      char currentCh = chStr[i];
      if (!Character.isWhitespace(currentCh)) { // ignore spaces
        Integer noCh = counter.get(currentCh);
        if (noCh == null) {
          counter.put(currentCh, 1);
        } else {
          counter.put(currentCh, ++noCh);
        }
      }
    }
    int maxOccurrences = Collections.max(counter.values());
    System.out.println("this is maxOccurrences: " + maxOccurrences);
    char maxCharacter = Character.MIN_VALUE;
    for (Entry<Character, Integer> entry : counter.entrySet()) {
      if (entry.getValue() == maxOccurrences) {
        maxCharacter = entry.getKey();
      }
    }
    System.out.println("this is maxCharacter: " + maxCharacter);
    return new AbstractMap.SimpleEntry<>(maxCharacter, maxOccurrences);
    
  }

  public static void main(String[] args) {
    // String text = "sdhhhhhh";
    Entry<Character, Integer> result = maxOccurenceCharacter("sdhhhhhh");
    System.out.println("Max Character: " + result.getKey());
    System.out.println("Max Character: " + result.getValue());
    // System.out.println(maxOccurenceCharacter(text));
  }
}
