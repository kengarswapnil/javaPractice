import java.util.Scanner;

public class Bill {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double n = sc.nextDouble();


    double bill = 0;
    if (n >= 0 && n <= 100) {
     bill =  n * 4.50;
    } else if (n >= 101 && n <= 300) {
     bill =  (100 * 4.50)  + ((n -100 ) * 7.50);
    } else if (n >= 300) {
    bill =   (100 * 4.50) + (200 * 7.50) + ((n -300 ) * 7.50);
    }
    System.out.println(bill);
    
  }
}
