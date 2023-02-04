import java.util.Scanner;

public class IsPalindrome {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String str = scan.nextLine();

    System.out.println(str);
    List<String> palindromes = new ArrayList<>();
    for (int i = 0; i < str.length() - 2; i++) {
      for (int j = i + 2; j < str.length(); j++) {
        String subStr = str.substring(i, j + 1);
        if (isPalindrome(subStr)) {
          palindromes.add(subStr);
        }
      }
    }

    // sort the palindromes in the required order
    Collections.sort(palindromes, (s1, s2) -> {
      int s1StartIndex = str.indexOf(s1);
      int s2StartIndex = str.indexOf(s2);
      if (s1StartIndex != s2StartIndex) {
        return s1StartIndex - s2StartIndex;
      }
      return s1.length() - s2.length();
    });

    for (String palindrome : palindromes) {
      System.out.println((str.indexOf(palindrome) + 1) + " " + palindrome);
    }
    System.out.println();
  }

  public static boolean isPalindrome(String str) {
    String result = "";
    for (int i = 0; i < str.length(); i++) {
      result = str.charAt(i) + result;
    }
    return str.equalsIgnoreCase(result);
  }
}
