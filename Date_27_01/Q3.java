import java.util.*;
public class Q3 {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String msg=sc.nextLine().toLowerCase();
      char nm=' ';
      for(int i=msg.length()-1;i>0;i--){
        nm+=msg.charAt(i);
      }
      System.out.println(nm);
      String str=String.valueOf(nm);
      System.out.println(str);
      if(msg==str){
        System.out.println("Palindrome");
      }else{
        System.out.println("Not palindrome");
      }
  }
}
//check for palindrome ignore case