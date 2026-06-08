import java.util.Scanner;

public class Exp14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a value:");
    double a = sc.nextDouble ();

    double res = (1.73205080757 / 4) * (a*a);
    System.out.println(res);

  }
}
