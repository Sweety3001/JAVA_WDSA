import java.util.*;
public class postFix {
  static int evaluatePostFix(String s){
    Deque<Integer>st=new ArrayDeque<>();
    //implementation of stack using deque
    for(char ch:s.toCharArray()){
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
    String exp = "24*3+5/";
    int result = evaluatePostFix(exp);
    System.out.println("Result = " + result);
  }
}
// evaluate postfix expression using stack 24*3+5/
//psuedocode
/*
Deque<Integer>st=new ArrayDeque<>();
*/