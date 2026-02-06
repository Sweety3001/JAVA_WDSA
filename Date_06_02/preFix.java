import java.util.ArrayDeque;
import java.util.Deque;

public class preFix {
  static int evaluatePreFix(String s){
    Deque<Integer>st=new ArrayDeque<>();
    //implementation of stack using deque
    for(int i=s.length()-1;i>=0;i--){
      char ch=s.charAt(i);
      if(Character.isDigit(ch)){
        st.push(ch-'0');
      }else{
        int b=st.pop();
        int a=st.pop();
        if(ch=='+') st.push(a+b);
        if(ch=='-') st.push(a-b);
        if(ch=='*') st.push(a*b);
        if(ch=='/') st.push(a/b);
      }
    }
    return st.pop();
  }
  public static void main(String[] args) {
    String exp = "+9*26";
    int result = evaluatePreFix(exp);
    System.out.println("Result = " + result);
  }
}
