import java.util.Scanner;

public class BAttingAvg {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the totalRuns");
    int totalRuns = sc.nextInt();

    System.out.println("Total number of Dismiss");
    int dismiss = sc.nextInt(); 

    int res = (totalRuns /dismiss ) * 100;
    System.out.println(res);
  }
}
