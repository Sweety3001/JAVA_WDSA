import java.util.ArrayDeque;
import java.util.Deque;

public class minNum {
  
  public static void main(String[] args) {
    String s="00124219010";
    int k=2;
    Deque<Character>st=new ArrayDeque<>();
    for(char ch:s.toCharArray()){
      while(!st.isEmpty() && st.peek()>ch && k>0){
        st.pop();
        k--;
      }
      st.push(ch);
    }
      while(k-- > 0) st.pop();
      StringBuilder sb=new StringBuilder();
      while(!st.isEmpty()){
        sb.append(st.pop());
      }
      while(sb.length()>1 && sb.charAt(sb.length()-1)=='0'){
        sb.deleteCharAt(sb.length()-1);
      }
    System.out.println(sb.reverse().toString());
  }
}
