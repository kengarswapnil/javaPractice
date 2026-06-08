import java.util.Scanner;

public class Reverse {
  public static void ReverseStr(String s) {
    char str[] = s.toCharArray();
    for (int i = 0; i < str.length / 2; i++) {
      char temp = str[i];
      str[i] = str[str.length - 1 - i];
      str[str.length - 1 - i] = temp;

    }

    System.out.println("Reverse String 1 :");
    System.out.println(new String(str));

  }

  // method 2
  public static void Reverse2(String str){
    int i = 0;
    int j = str.length() -1 ;

    char s [] = str.toCharArray();

    while (i < j) {
      char temp  = s[i];
      s[i] = s[j];
      s[j] = temp;

      i++;
      j--;
    }
    
    System.out.println("Reverse String 2 :");
    System.out.println(new String(s));
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The String : ");
    String s = sc.nextLine();

    ReverseStr(s);
    Reverse2(s);
  }
}
