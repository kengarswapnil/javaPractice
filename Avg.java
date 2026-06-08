import java.util.Scanner;

public class Avg {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n ;
    int sum  = 0;
    int count = 0;

    do{
      n = sc.nextInt();
      sum += n;
      count++;
    }while(n != 0);

    if(count == 0){
  System.out.println("nothing");
    }else{
       double avg = (double) sum / count;
        System.out.println(avg);
    }
   
  }
}
