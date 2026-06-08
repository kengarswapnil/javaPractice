import java.util.Scanner;

public class Exp8 {

  public static void isAmstrong(int n){
    int origial = n;
    int sum = 0;

    while(n > 0){
      int rem = n % 10;
      sum = sum + (rem*rem*rem);
      n = n /10;
    }

    if(origial == sum){
      System.out.println("It is Amstrong number " + sum);
    }

  }
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);

   System.out.println("Enter first number");
   int num1 = sc.nextInt();

   System.out.println("Enter Second number");
   int num2 = sc.nextInt();


   for(int i=num1;i<=num2;i++){
      isAmstrong(i);
   }
  }
}