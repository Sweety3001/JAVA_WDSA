import java.util.Scanner;

public class Q4{
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine().toLowerCase();
      String res="";
      int count=1;
      for(int i=0;i<s.length();i++){
        if(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
          count++;
        }else{
          res+=s.charAt(i)+""+count;
          count=1;
        }
      }
      System.out.println(res);
  }
}

//ypu have compress a string
//String s="aaabbcdd"
//Output= a3b2c1d2