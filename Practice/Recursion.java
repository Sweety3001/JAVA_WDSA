import java.util.Scanner;

public class Recursion {
  static void printName(int i, int n){
    if(i>n) return;
    System.out.println("Sweety");
    printName(i+1, n);
    //Time complexity O(n)
  }
  static void printLinear(int i,int n){
    if(i>n) return;
    System.out.println(i);
    printLinear(i+1, n);
  }
  static void printLinearR(int n){
    if(n<1) return;
    System.out.println(n);
    printLinearR(n-1);
  }
  public static void main(String[] args) {
      //print name n times 
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      // printName(1,n);
      // printLinear(1,n);
      printLinearR(n);
  }
}
