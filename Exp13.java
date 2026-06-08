import java.util.Scanner;

public class Exp13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter p");
    int p  = sc.nextInt();
    System.out.println("Enter q");
    int q = sc.nextInt();

    int res = (p*q)/2;
    System.out.println(res);


  }
}
