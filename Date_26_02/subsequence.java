public class subsequence
 {
  static int lcsTab(String s1, String s2){
    int m=s1.length();
    int n=s2.length();

    int[][] dp=new int[m+1][n+1];
    for(int i=1;i<=m;i++){
      for(int j=1;j<=n;j++){
        if(s1.charAt(i-1)==s2.charAt(j-1)){
          dp[i][j]=1+dp[i-1][j-1];
        }else{
          dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
        }
      }
    }
    return dp[m][n];
  }
  
  static int lcsmemo(String s1, String s2, int i, int j,int[][] dp){
    if(i<0 || j<0) return 0;
    if(s1.charAt(i)==s2.charAt(j)){
      dp[i][j]=1+lcsmemo(s1, s2, i-1, j-1, dp);
    }else{
      dp[i][j]=Math.max(lcsmemo(s1, s2, i-1, j, dp), lcsmemo(s1, s2, i, j-1, dp));
    }
    return dp[i][j];
  }
  public static void main(String[] args) {
    String s1="abcbbbaacdcc";
    String s2="abcdfyuhjba";
    // int res=lcsTab(s1,s2);
    int m=s1.length();
    int n=s2.length();
    int res=lcsmemo(s1,s2,m-1,n-1,new int[m][n]);

    System.out.println(res);
  }
}
/*
//you are given with an array
[1,5,11,5]
you must divide it into two subsets such that sum of both subsets is equal.or if it is possible return true otherwise false;
*/
