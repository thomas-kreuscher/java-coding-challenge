import java.util.ArrayList;
import java.util.List;

public class StringsNumbersMath {

  static void countChar(String x) {

    // 1. Counting duplicate characters: Write a program that 
    // counts duplicate characters from a given string.

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
    System.out.println("----------");
  }


  static void firstNonRepChar(String x) {

    // 2. Finding the first non-repeated character: Write a program that 
    // returns the first non-repeated character from a given string.

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

  static void reverseLettWord(String x) {

    // 3. Reversing letters and words: Write a program that reverses 
    // the letters of each word and a program that reverses the 
    // letters of each word and the words themselves.
    
    System.out.println(x);
    for (int i = x.length()-1; i>=0; i--) {
      System.out.println(x.charAt(i));
    }
  }

  private static void isDigit(String x) {

    // 4. Checking whether a string contains only digits:
    // Write a program that checks whether the given
    // string contains only digits.

    if (x.matches(".*[a-zA-Z]+.*")) {
      System.out.println("No, it has also characters..");
    } else {
      System.out.println("Yes, there are only digits");
    }
  }

  private static void countVowCons(String x) {

    // 5. Counting vowels and consonants: Write a program that
    // counts the number of vowels and consonants in a given
    // string. Do this for the English language, which has
    // five vowels (a, e, i, o, and u).

    int count_vow = 0;
    int count_cons = 0;

    for (int i = 0; i < x.length(); i++) {
      if (x.charAt(i) == 'a' || x.charAt(i) == 'e' || x.charAt(i) == 'o' || x.charAt(i) == 'u') {
        count_vow += 1;
        count_cons += 0;

      } else {
        count_cons += 1;
      }

    }
    System.out.println("Vowels: " + count_vow);
    System.out.println("Consonants: " + count_cons);
  }

  private static void countChar(String x, Character y) {

    // 6. Counting occurrences of a certain character:
    // Write a program that counts the occurrences of
    // a certain character in a given string.

    int count_char = 0;

    for (int i = 0; i < x.length(); i++) {
      if (x.charAt(i) == y) {
        count_char += 1;
      } else {
        continue;
      }
    }
    System.out.println("The number of " + y + " = " + count_char);

  }


  static void stringConverter(String x, String y) {

    // 7. Converting String into int, long, float, or double:
    // Write a program that converts the given String object
    // (representing a number) into int, long, float, or double.

    // System.out.println(
    checkVarType(x);
    
    if (y == "int") {
      int num1 = Integer.parseInt(x);
      System.out.println("parseInt of the String = " + num1);
      checkVarType(num1); 
    } else if (y == "long") {
      long strLong = Long.parseLong(x);
      System.out.println("parseLong of the String = " + strLong);
      checkVarType(strLong); 
    } else if (y == "float") {
      Float strFloat = Float.parseFloat(x);
      System.out.println("parseFloat of the String = " + strFloat);
      checkVarType(strFloat);
    } else {
      double strDouble = Double.parseDouble(x);
      System.out.println("parseDouble of the String = " + strDouble);
    }
    

    
  }

  static void checkVarType(Object obj) {

    // checks the variable type

    if (obj instanceof Double) {
      System.out.println("It´s a Double type.");
    } else if (obj instanceof Long) {
        System.out.println("It´s a Long type.");
    } else if (obj instanceof Float) {
        System.out.println("It´s a Float type.");
    } else if (obj instanceof String) {
        System.out.println("It´s a String type.");
    } else {
       System.out.println("It´s an Integer type.");
    }
  }  
  




  public static void main(String[] args) {
    String text = "676869";
    char y = 'l';
    String dtype = "float";
    System.out.println("----------");
    System.out.println("This is the String = " + text);
    System.out.println("-----Nr 1-----");
    countChar(text);
    System.out.println("----Nr 2------");
    firstNonRepChar(text);
    System.out.println("----------");
    System.out.println("----------");
    System.out.println("----------");
    reverseLettWord(text);
    System.out.println("----------");
    isDigit(text);
    System.out.println("----------");
    countVowCons(text);
    System.out.println("----------");
    countChar(text, y);
    System.out.println("-----StringConverter-----");
    System.out.println(text);
    stringConverter(text, dtype);
  }

}
