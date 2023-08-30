import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        } else {
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

    for (int i = 0; i <= x.length() - 2; i++) {
      for (int j = i + 1; j <= x.length() - 1; j++) {
        while (x.charAt(i) == x.charAt(j)) {
          dub_char_list.add(x.charAt(i));
          break;
        }
      }
    }

    for (int i = 0; i <= x.length() - 1; i++) {
      if (!dub_char_list.contains(x.charAt(i))) {
        System.out.println("This is the first non-repeated character is: " + x.charAt(i));
        break;
      }
    }
    System.out.println("These are the duplicated characters: " + dub_char_list);
  }

  static void reverseLettWord(String x) {

    // 3 Reversing letters and words: Write a program that reverses
    // the letters of each word and a program that reverses the
    // letters of each word and the words themselves.

    System.out.println(x);
    for (int i = x.length() - 1; i >= 0; i--) {
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

    // 7 Converting String into int, long, float, or double:
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

  static void removeSpaces(String x) {

    // 8. Removing white spaces from a string:
    // Write a program that removes all white
    // spaces from the given string.

    x = x.replaceAll("\\s+", "");
    System.out.println("Without spaces now: " + x);

  }

  static void joinStrings(String x, String y, String delimiter) {

    // 9. "Joining multiple strings with a delimiter:
    // Write a program that joins the given strings
    // by the given delimiter."

    String message = String.join(delimiter, x, y);
    System.out.println(message);
  }

  public static String joinByDelimiter(char delimiter, String... args) {

    // 9. Solution of "Joining multiple strings with a delimiter:
    // Write a program that joins the given strings
    // by the given delimiter."

    StringBuilder result = new StringBuilder();
    int i = 0;
    for (i = 0; i < args.length - 1; i++) {
      result.append(args[i]).append(delimiter);
    }
    result.append(args[i]);
    return result.toString();

  }

  static void permuteString(String x) {
    // 10. Generating all permutations: Write a program
    // that generates all of the permutations of a given string.
    // List<Character> dub_char_list = new ArrayList<Character>();

    // List<String> permuted_list = new ArrayList<String>();

    // Input: str = “geek”
    // Output: geek geke gkee egek egke eegk eekg ekge ekeg kgee kege keeg

    for (int i = 0; i < x.length(); i++) {
      Character b = x.charAt(i);
      String c = "";
      c = c + b;
      // System.out.print(c);

      int index = 0;

      while (c.length() >= 2) {
        char currentChar = x.charAt(index);
        System.out.print(currentChar);
        c = c + currentChar;
        index = (index + 1) % x.length(); // Move to the next index, looping back to 0 if at the end
        // if (c.length() >= 2) {
        System.out.print(c);
        // break;
        // } else {
        // continue;
        // }

      }

    }
  }

  // 11. Checking whether a string is a palindrome:
  // Write a program that determines whether the
  // given string is a palindrome or not.

  // 13.Removing given characters: Write a
  // program that removes the given character
  // from the given string.

  public static Pair<Character, Integer> maxOccurenceCharacter(String str) {

    // 14. Finding the character with the most
    // appearances: Write a program that finds
    // the character with the most appearances
    // in the given string.

    Map<Character, Integer> counter = new HashMap<>();
    System.out.println("its the string: " + str);
    char[] chStr = str.toCharArray();
    System.out.println(chStr);
    for (int i = 0; i < chStr.length; i++) {
      char currentCh = chStr[i];
      System.out.println("its currentCh: " + currentCh);
      if (!Character.isWhitespace(currentCh)) {
        Integer noCh = counter.get(currentCh);
        System.out.println("its noCh: " + noCh);
        if (noCh == null) {
          counter.put(currentCh, 1);
        } else {
          counter.put(currentCh, ++noCh);
        }
      }
    }
    int maxOccurrences = Collections.max(counter.values());
    System.out.println("its maxOccurrences: " + maxOccurrences);
    char maxCharacter = Character.MIN_VALUE;
    System.out.println("its maxCharacter: " + maxCharacter);
    for (Entry<Character, Integer> entry : counter.entrySet()) {
      if (entry.getValue() == maxOccurrences) {
        maxCharacter = entry.getKey();
        System.out.println("its maxCharacter after: " + maxCharacter);
      }
    }
    System.out.println("its maxOccurrences at end: " + maxOccurrences);
    return Pair.of(maxCharacter, maxOccurrences);
    // return Map.getKey(maxCharacter);
  }

  public static void stringsByLength(String[] arr) {

    // 15. Sorting an array of strings by length

    System.out.println("The original array is: ");
    for (String num : arr) {
      System.out.print(num + " ");
    }
    Arrays.sort(arr);
    System.out.println("\nThe sorted array is: ");
    for (String num : arr) {
      System.out.print(num + " ");
    }
  }

  public static void anagramStrings(String str1, String str2) {
    // 18. Checking whether two strings are anagrams

    List<Character> listOfCharsStr1 = new ArrayList<>();
    List<Character> listOfCharsStr2 = new ArrayList<>();

    str1 = str1.toLowerCase().replaceAll("\\s", "");
    str2 = str2.toLowerCase().replaceAll("\\s", "");
    // System.out.println(str2);

    if (str1.length() == str2.length()) {

      for (int i = 0; i < str1.length(); i++) {

        int countCharStr1 = 0;
        int countCharStr2 = 0;

        for (int j = 0; j < str1.length(); j++) {

          // System.out.println("i:" + str1.charAt(i));
          // System.out.println("j:" + str1.charAt(j));
          // System.out.println("k:" + str2.charAt(k));

          if (str1.charAt(i) == str1.charAt(j) && !listOfCharsStr1.contains(str1.charAt(i))) {
            System.out.println("I:" + str1.charAt(i));
            System.out.println("j:" + str1.charAt(j));
            countCharStr1 += 1;
            listOfCharsStr1.add(str1.charAt(i));
          } else {
            continue;
          }
        }

        for (int k = 0; k < str2.length(); k++) {
          if (str1.charAt(i) == str2.charAt(k) && !listOfCharsStr2.contains(str1.charAt(i))) {
            System.out.println("I:" + i + " " + str1.charAt(i));
            System.out.println("k:" + k + " " + str2.charAt(k));
            countCharStr2 += 1;
            listOfCharsStr2.add(str1.charAt(i));
          } else {
            continue;
          }
        }

        System.out.println("listOfCharsStr1: " + listOfCharsStr1);
        System.out.println("listOfCharsStr2: " + listOfCharsStr2);
        System.out.println("countCharStr1: " + countCharStr1);
        System.out.println("countCharStr2: " + countCharStr2);
        if (countCharStr1 == countCharStr2) {
          System.out.println("counts are equal");
        } else {
          System.out.println("counts are NOT equal - No anagram");
          break;
        }
      }
      // System.out.println("-----------------");
      // System.out.println("It´s an anagram!!");
      // System.out.println("-----------------");

    } else {
      System.out.println("-----------------");
      System.out.println("Differnt length of strings - No anagram");
      System.out.println("-----------------");
    }
  }

  public static void anagramStrings1(String str1, String str2) {

    // 18. Checking whether two strings are anagrams

    str1 = str1.toLowerCase().replaceAll("\\s", "");
    str2 = str2.toLowerCase().replaceAll("\\s", "");

    String[] charArray1 = str1.split("");
    String[] charArray2 = str2.split("");

    if (str1.length() == str2.length()) {

      Arrays.sort(charArray1);
      Arrays.sort(charArray2);

      System.out.println(Arrays.toString(charArray1));
      System.out.println(Arrays.toString(charArray2));

      if (Arrays.equals(charArray1, charArray2)) {
        System.out.println("It is an anagram");
      } else {

        System.out.println("No anagram");
      }
    } else {
      System.out.println("-----------------");
      System.out.println("Differnt length of strings - No anagram");
      System.out.println("-----------------");
    }
  }

  public static void concatStrNtimes(String str, int n) {
    
    String result = str;

    for (int i = 1; i < n; i++) {
      result = result + str;
    }

    System.out.println(result);
  }

  public static void transformString(String[] strs) {
    // 24. Transforming strings

    List<String> myStr = Stream.of(strs)
    .map(x -> x + " Java")
    .collect(Collectors.toList());

    System.out.println(myStr);


    
    List<String> resultMap = Stream.of(strs)
        .map(s -> s + " world")
        .collect(Collectors.toList());
    
    System.out.println(resultMap);
  }

  public static void main(String[] args) {

    String[] strArray = {"Hallloo", "Buenos tardes"};
    String text = "Hallloo";
    String textB = "a lll  hO";
    // anagramStrings1(text, textB);
    // transformString(strArray);
    concatStrNtimes(text, 5);
    // char y = 'l';
    // String dtype = "float";
    // System.out.println("----------");
    // System.out.println("This is the String = " + text);
    // System.out.println("-----Nr 1-----");
    // // countChar(text);
    // System.out.println("----Nr 2------");
    // // firstNonRepChar(text);
    // System.out.println("----------");
    // System.out.println("----------");
    // System.out.println("----------");
    // // reverseLettWord(text);
    // System.out.println("----------");
    // // isDigit(text);
    // System.out.println("----------");
    // // countVowCons(text);
    // System.out.println("----------");
    // // countChar(text, y);
    // System.out.println("-----StringConverter-----");
    // System.out.println(text);
    // // stringConverter(text, dtype);
    // System.out.println("-----WhiteSpaceRemover-----");
    // removeSpaces(text);
    // System.out.println("-----JoinStringsByDelimiter-----");
    // joinStrings(text, textB, "-");
    // System.out.println("-----JoinStringsByDelimiterSolution-----");
    // System.out.println(joinByDelimiter(';', "Jason", "Thomas", "Susi"));
    // System.out.println("-----StringPermutation-----");
    // permuteString(text);
    // System.out.println("-----MaxOccurrenceCharacter-----");
    // System.out.println(maxOccurenceCharacter(text));
    // System.out.println("-----SortStringsByLength-----");
    // int[] arrNum = { 5, -2, 23, 7, 87, -42, 509 };
    // String[] arrStr = {"Thor", "Thors", "Thorst", "Thorste", "Thorsten"};
    // stringsByLength(arrStr);

  }

}
