import java.util.Scanner;

public class Cgpa {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int totalSum = 0;
    int maxSum = 0;

    for (int i = 0; i < n; i++) {
      double credit = sc.nextInt();

      double grade = sc.nextInt();

      totalSum += credit;
      maxSum += credit * grade;

    }

    double cgpa = maxSum / totalSum;
    System.out.println(cgpa);

  }
}
