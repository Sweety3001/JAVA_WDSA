public class SumOfNno {
  static void printSum(int i,int n){
    if(i<1){
      System.out.println(n);
      return;
    }
    printSum(i-1, n+i);
  }
  static int sum(int n){
    if(n<=0) return 0;
    return n+sum(n-1);
  }
  public static void main(String[] args) {
    int n=5;
    // printSum(n,0); //parameterised way
    int res=sum(n); //functional recursion
    System.out.println(res);
  }
}
