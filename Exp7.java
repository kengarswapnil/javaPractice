import java.util.Scanner;

public class Exp7 {
  
  public static void isPallindrome(String s){
    String res = "";
    for(int i=s.length()-1;i>=0;i--){
      res+=s.charAt(i);
    }
    if(s.equals(res)){
      System.out.println("It is pallindrome");
    }else{
      System.out.println("It is not pallindrome");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s  =  sc.nextLine();

   isPallindrome(s);

  }
}
