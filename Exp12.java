import java.util.Scanner;

class Exp12{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Height:");
    int height = sc.nextInt();
    System.out.println("Enter the Width:");
    int width = sc.nextInt();

    int res = height * width;
    System.out.println(res);
  }
}