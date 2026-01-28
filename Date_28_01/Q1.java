import java.util.Scanner;
public class Q1 {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine().trim();
    boolean found=false;
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      if(Character.isDigit(ch)){
        System.out.print(ch);
        found=true;
      }else{
        if(found){
          break;
        }
      }
    }
  }
}
// 1->
// you are given a string as you must convert it into a integer following some strict rules
// ->ignore leading spaces
// ->check signs +/-
// ->read digits until a non digit is found
// -> if number goes out of the integer range you have to clamp it
// ->if no digits just return zero
// ex- hello123
// output-0

// ex-12@hello123
// output-12

// ex-12@1244
// output-12