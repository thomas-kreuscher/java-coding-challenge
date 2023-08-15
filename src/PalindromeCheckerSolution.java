public class PalindromeCheckerSolution {
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String testStr1 = "A man, a plan, a canal, Panama";
        String testStr2 = "hello world";
        
        System.out.println(isPalindrome(testStr1)); // Erwartete Ausgabe: true
        System.out.println(isPalindrome(testStr2)); // Erwartete Ausgabe: false
    }
}

