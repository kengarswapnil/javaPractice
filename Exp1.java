import java.util.Scanner;

class Exp1{
  public static void CheckEvenOdd(int n){
    if(n%2 == 0){
      System.out.println("Even");
    }else{
      System.out.println("Odd");
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number :");
    int n  = sc.nextInt();
    CheckEvenOdd(n);
  }
}