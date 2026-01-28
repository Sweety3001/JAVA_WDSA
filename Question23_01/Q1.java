import java.util.*;
public class Q1 {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String msg=sc.nextLine();
      String[] words=msg.trim().split("\\s+");
      int count=words.length;
      System.out.println(count);
  }
}
// wap to count total number of words ina string or a message input by user