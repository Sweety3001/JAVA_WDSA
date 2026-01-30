public class reverseNum {
  public static void main(String[] args) {
    int n=1625;
    int rev=0;
    while(n!=0){
      int res=n%10;
      rev=rev*10+res;
      n=n/10;
    }
    System.out.println(rev);
  }
}
