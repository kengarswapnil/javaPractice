import java.util.Scanner;

public class Exp15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Radius");
    double radius = sc.nextInt();
    
    double res =  (2 * 3.14159 * radius);

    System.out.println(res);
  }
}
