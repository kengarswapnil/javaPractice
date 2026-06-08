import java.util.Scanner;

public class Exp24 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n ;
    int max = 0;


    do{
      n = sc.nextInt();
      if(n > max){
        max = n;
      }
    }while(n != 0);

    System.out.println("Largest number :"+max);
  }
}
