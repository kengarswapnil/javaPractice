public class Power {

  public static void power(int base ,int exp){
    int res = 1;
    for(int i=0;i<=exp;i++){
      res *= base;
    }
    System.out.println(res);
  }
  public static void main(String[] args) {
    // double res = Math.pow(2, 3);
    // System.out.println(res);

    int base = 2,exp =3 ;
    power(base, exp);
  }
}
