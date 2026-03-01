public class palindromeString {
  static boolean palindrome(int i,String s){
    int n=s.length();
    if(i>=n/2) return true;
    if(s.charAt(i)!=s.charAt(n-i-1)){
      return false;
    }
    return palindrome(i+1, s);
  }
  public static void main(String[] args) {
    String s="madam"; 
    boolean flag=palindrome(0,s);
    System.out.println(flag);
  }
}
