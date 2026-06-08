import java.util.Scanner;

public class Print {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int neg = 0;
    int oddpos = 0;
    int pos = 0;

    while (true) {
      int n = sc.nextInt();

      if (n == 0) {
        break;
      }

      if (n < 0) {
        neg += n;
      } else if (n % 2 == 0) {
        pos += n;
      } else if (n % 2 != 0) {
        oddpos += n;
      }

    }

    System.err.println(neg);
    System.out.println(pos);
    System.err.println(oddpos);

  }
}
