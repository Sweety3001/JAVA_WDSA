
import java.util.ArrayList;

public class Q2 {
  public static void main(String[] args) {
    String str="abcdcba";
    ArrayList<String> list=new ArrayList<>();
    for(int i=0;i<str.length();i++){
      for(int j=i;j<str.length();j++){
        list.add(str.substring(i,j+1));
      }
    }
    int count =0;
    for(String x:list){
      int i =0;
      int j=x.length()-1;
      boolean palin=true;
      while(i<j){
        if(x.charAt(i)!=x.charAt(j)){
          palin=false;
          break;
        }
        i++;
        j--;
      }
      if(palin){
        count++;
      }
    }
    System.out.println(count);
  }
}
//palindrome substrings count