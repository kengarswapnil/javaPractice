import java.util.Scanner;

public class EvenMonth {
  public static void EvenMonth(int n) {
    int count = 0;
    for (int i = 0; i < n; i++) {
      if (i % 2 == 0) {
        count++;
      }
    }
    System.out.println("Number of Days " + count);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    EvenMonth(31);
  }
}
