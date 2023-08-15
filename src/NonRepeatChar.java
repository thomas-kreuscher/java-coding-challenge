// Finding the first non-repeated character: Write a program that 
// returns the first non-repeated character from a given string.

import java.util.ArrayList;
import java.util.List;

public class NonRepeatChar {

  static void firstNonRepChar(String x) {

    x = x.toLowerCase().replaceAll("\\s+", "");
    List<Character> dub_char_list = new ArrayList<Character>();

    for (int i = 0; i <= x.length()-2; i++) {
      for (int j = i+1; j <= x.length()-1; j++) {
        while (x.charAt(i) == x.charAt(j)) {
          dub_char_list.add(x.charAt(i));
          break;
        }
      }
    }

    for (int i = 0; i <= x.length()-1; i++) {
      if (!dub_char_list.contains(x.charAt(i))) {
        System.out.println("This is the first non-repeated character is: " + x.charAt(i));
        break;
      }
    }



    System.out.println("These are the duplicated characters: " + dub_char_list);






  }

  public static void main(String[] args) {
    String text = "Mama S backk";
    System.out.println("----------");
    System.out.println("This is the String = " + text);
    firstNonRepChar(text);
    
  }
  
}
