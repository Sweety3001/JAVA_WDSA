

public class Leetcode416 {
  static Boolean[][] dp;
  static boolean solveSum(int[] arr,int idx,int target, boolean[][] dp){
    if(target==0) return true;
    if(idx<0) return false;
    if(dp[idx][sum]!=null){
      return dp[idx][target];
    }
    boolean notpick=solveSum(arr, idx-1, target, dp);
    boolean pick=false;
    if(arr[idx]<=target){
      pick=solveSum(arr, idx-1, target-arr[idx], dp);
    }
    dp[idx][target]=pick||notpick;
    return dp[idx][target];
  }
  static boolean partition(int[] arr){
    int n=arr.length;
    int sum=0;
    for(int x:arr){
      sum+=x;
    }
    if(sum%2!=0) return false;
    // if(n<2) return false;
    int target=sum/2;
    dp = new Boolean[n][target+1];
    boolean res=solveSum(arr,n-1,target,dp);
    return res;
  }
  
  public static void main(String[] args) {
    int[] arr={1,5,11,5};
    boolean res=partition(arr);
    System.out.println(res);
  }
}
