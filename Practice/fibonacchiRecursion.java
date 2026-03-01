public class fibonacchiRecursion {
  static int fibonacchi(int n){
    if(n<=1) return n;
    int last=fibonacchi(n-1);
    int start=fibonacchi(n-2);
    return last+start;
  }
  public static void main(String[] args) {
    int n=6; 
    int res=fibonacchi(n);
    System.out.println(res);
  }
}
