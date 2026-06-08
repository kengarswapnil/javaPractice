import java.util.Scanner;

public class Distance {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the X1 value :");
    double x1 = sc.nextInt();

    System.out.println("Enter the X2 value :");
    double x2 = sc.nextInt();

    System.out.println("Enter the y1 value :");
    double y1 = sc.nextInt();
    System.out.println("Enter the X1 value :");
    double y2 = sc.nextInt();

    double res = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    System.out.println(res);
  }
}