public class Pallindrome {
  public static void Pallindrome(int n){
    int orignal = n;
    int sum = 0;

    while (n > 0) {
      int rem = n % 10;
      sum = (sum * 10 ) + rem;
      n = n /10;
    }

    if(orignal == sum){
      System.out.println("It is pallindrome ");
    }else{
      System.out.println("Not a Pallindrome");
    }
  }
  public static void main(String[] args) {
    int n = 121;
    Pallindrome(n);
  }
}
