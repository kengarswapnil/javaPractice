import java.util.Scanner;

public class CountVowels {
  public static void CountVowels(String s) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        count++;
      }
    }
    System.out.println(count);
  }

  // method 2
  public static void CountVowels2(String s) {
    int count = 0;
    String Vowels = "aeiouAEIOU";
    int constant = 0;

    for (int i = 0; i < s.length(); i++) {
      if (Vowels.indexOf(s.charAt(i)) != -1) {
        count++;
      } else {
        constant++;
      }
    }
    System.out.println("Number of Constant : " + constant);
    System.out.println("Number of Count vowels : " + count);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String:");
    String s = sc.nextLine();
    // CountVowels(s);

    CountVowels2(s);

  }
}
