import java.util.Scanner;

public class Q5 {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String s1=sc.nextLine().toLowerCase();
      String s2=sc.nextLine().toLowerCase();
      char[] ch1= new char[s1.length()];
      char[] ch2=new char[s2.length()];
      if(s1.length()!=s2.length()){
        System.out.println("Not Anagram");
      }
      for(int i=0;i<s1.length();i++){
        ch1[i]=s1.charAt(i);
        ch2[i]=s2.charAt(i);
      }
      
  }
}
