public class Q1 {
  public static void main(String[] args) {
    int[] arr={3,4,6,4,6};
    int[] prefix=new int[arr.length];
    prefix[0]=arr[0];
    for(int i=1;i<arr.length;i++){
      prefix[i]=arr[i]+prefix[i-1];
    }
    int l=2;
    int r=4;
    int sum=prefix[r]-prefix[l-1];
    System.out.println(sum);
  }
}
// 3,4,6,4,6
//you are given with an array that keeps track of your monthly expenses you have to find the total expenses spend between l to r days using prefix sum