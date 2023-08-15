// Counting duplicate characters: Write a program that 
// counts duplicate characters from a given string.

import java.util.ArrayList;
import java.util.List;

public class DuplicateCount {

  static void countChar(String x) {

    int count_char = 0;
    x = x.toLowerCase().replaceAll("\\s+", "");
    List<Character> dub_char_list = new ArrayList<Character>();
    

    for (int i = 0; i <= x.length() - 2; i++) {
      for (int j = i + 1; j <= x.length() - 1; j++) {
        if (x.charAt(i) == x.charAt(j) && !dub_char_list.contains(x.charAt(i))) {
          dub_char_list.add(x.charAt(i));
          count_char += 1;
        } 
        else {
          count_char += 0;
        }
      }
    }
    System.out.println("----------");
    System.out.println(count_char);
    System.out.println("Dublicated characters: " + dub_char_list);
    // System.out.println("First NonRep characters: " + non_rep_char_list);
    System.out.println("----------");
  }

  public static void main(String[] args) {
    String text = "Mama is back";
    System.out.println("----------");
    System.out.println("This is the String = " + text);
    countChar(text);
  }
}
