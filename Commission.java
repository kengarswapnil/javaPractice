import java.util.Scanner;

public class Commission {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Commission:");
    double c = sc.nextInt();

    System.out.println("Enter TotalSales");
    double total = sc.nextInt();

    double res = (c / total) * 100;

    System.out.println(res);
  }
}