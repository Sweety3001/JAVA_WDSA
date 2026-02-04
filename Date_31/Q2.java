public class Q2 {
  public static void main(String[] args) {
    int[] arr={6,-4,2,10,-1,5};
    int k=7;
    int n=arr.length;
    int[] prefix=new int[arr.length];
    prefix[0]=arr[0];
    for(int i=1;i<arr.length;i++){
      prefix[i]=arr[i]+prefix[i-1];
    }
    int count = 0;
    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        int sum;
        if (i == 0) {
          sum = prefix[j];
        } else {
          sum = prefix[j] - prefix[i - 1];
        }
        if (sum == k) {
          count++;
          System.out.println("length: "+(j-i+1));
        }
      }
    }
    System.out.println("no. of subarray: "+count);
  }
}
//find the number of subarray that sum equals k
// 6,-4,2,10,-1,5
// k=7
// using prefix sum