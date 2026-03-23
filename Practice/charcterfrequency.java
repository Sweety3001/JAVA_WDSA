import java.util.HashMap;
import java.util.Scanner;
public class charcterfrequency {
  public static void main(String[] args) {
    //charcterfrequency
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    HashMap<Character,Integer> map=new HashMap<>();
    for(char ch:str.toCharArray()){
      map.put(ch,map.getOrDefault(ch, 0)+1);
    }
    map.forEach((key, value)->System.out.print(key+""+value+" "));
  }
}
