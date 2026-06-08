import java.util.Scanner;

public class Exp3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int p = sc.nextInt();
    int t = 2;
    int r = 20000;

    int simpleIntrest = (p+t+r)/100;

    System.out.println(simpleIntrest);
  }
}
