import java.util.Scanner;

public class Discount {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter price :");
    double price = sc.nextInt();
    System.out.println("Enter Discount :");
    double discount = sc.nextInt();

    double res = price - (price * (discount / 100));
    System.out.println(res);

  }
}
