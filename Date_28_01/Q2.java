import java.util.Scanner;
public class Q2 {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt(); 
      int[] arr=new int[n];
      int k=sc.nextInt();
      int max=0;
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      for(int i=0;i<k;i++){
        max+=arr[i];
      }
      for(int i=1;i<=n-k;i++){
        int sum=max-arr[i-1]+arr[i+k-1];
        if(sum>max){
          max=sum;
        }
      }
      System.out.println(max);
  }
}
// 2->
// there is a camera on a toll gate that keeps track of the cars passing every minute find the maximum cars passed in k consecutive minutes
// input-you are given with an array and k
// output- max no of cars passed in k consecutive minute
// ex-
// [3,5,13,8,12,5,18,2], k=3