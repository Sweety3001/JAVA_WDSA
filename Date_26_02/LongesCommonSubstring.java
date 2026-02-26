public class LongesCommonSubstring {
  static int lcsTab(String s1, String s2){
    int m=s1.length();
    int n=s2.length();

    int[][] dp=new int[m+1][n+1];
    for(int i=0;i<=m;i++){
      
    }
  }
  public static void main(String[] args) {
    String s1="abcbbbaacdcc";
    String s2="abcbbba";
    int res=lcsTab(s1,s2);
    System.out.println(res);
  }
}
