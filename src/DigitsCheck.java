// Checking whether a string contains only digits: 
// Write a program that checks whether the given 
// string contains only digits.


public class DigitsCheck {

  static void is_digit(String x) {

    if (x.matches(".*[a-zA-Z]+.*")) {
      System.out.println("Characters are included");
    } else {
      System.out.println("There are only digits" );
    }
  }

  // Counting vowels and consonants: Write a program that 
  // counts the number of vowels and consonants in a given 
  // string. Do this for the English language, which has 
  // five vowels (a, e, i, o, and u).

  static void countVowCons(String x) {

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

  public static void main(String[] args) {
    String text = "jgzfsluuueejhaaanplÖ0";                                                                                                                                                                                                                                                                                                                                                                                                                                        
    System.out.println("----------");
    System.out.println("This is the String = " + text);
    // is_digit(text);
    countVowCons(text);
  }
  
}
