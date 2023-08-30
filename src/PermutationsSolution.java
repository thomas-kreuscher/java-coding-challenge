import java.time.LocalDateTime;

public class PermutationsSolution {

  public static void main(String[] args) {
    
    String text = "abc";
    permuteAndPrint("", text);
    // permuteAndPrint1(text);
    
  }

  // public static void permuteAndPrint(String str) {
  //   permuteAndPrint("", str);
  // }


  private static void permuteAndPrint1(String str) {
    int n = str.length();
    
    for (int i = 0; i < n; i++) {
      StringBuilder newStr1 = new StringBuilder();
      String newStr = str.charAt(i) + str.substring(0, i) + str.substring(i+1, n);
      String newStr3 = str.charAt(i) + str.substring(i+1, n) + str.substring(0, i);
      newStr1.append(newStr);
      System.out.println(newStr + " " + newStr1.reverse() + " " + newStr3);
    }
  }


  private static void permuteAndPrint(String prefix, String str) {
    System.out.println("Before-prefix: " + prefix + " " );
    System.out.println("The str: " + str + " " );
    int n = str.length();
    if (n == 0) {
      System.out.println("THIS IS THE PERMUTATION: " + prefix + "  " );
    } else {
      
      System.out.println("You are in ELSE block" );
      
      for (int i = 0; i < n; i++) {
        
        System.out.println("i: " + i);
        System.out.println("The str under for loop: " + str + " " );
        System.out.println("Before substring (i+1 bis n):  " + str.substring(i + 1, n));
        System.out.println("Before substring (0 bis i): " + str.substring(0, i));
        
        permuteAndPrint(prefix + str.charAt(i),
        str.substring(i + 1, n) + str.substring(0, i));

        
        System.out.println("-------------------------------" );
        System.out.println("The str after the function: " + str + " " );
        //System.out.println(LocalDateTime.now());
        System.out.println("After prefix + charAt(i): " + prefix  + str.charAt(i) + " ");
        System.out.println("After substring (i+1 bis n): " + str.substring(i + 1, n));
        System.out.println("After substring (0 bis i): " + str.substring(0, i));
        System.out.println("-------------------------------" );
      }

    }
  }
}

