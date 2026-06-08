import java.util.Scanner;

public class AvgMarks {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 5;

    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += sc.nextInt();
    }

    int res = sum / n;
    System.out.println(res);


  }
}
