import java.util.ArrayDeque;
import java.util.Deque;

public class expandString {
  public static void main(String[] args) {
    String s="a2[b]3[c]";
    String currstr="";
    int currnum=0;
    Deque<String>st=new ArrayDeque<>();
    Deque<Integer>num=new ArrayDeque<>();
    for(char c:s.toCharArray()){
      if(Character.isDigit(c)){
        currnum=currnum*10+(c-'0');
      }
      else if(c=='['){
        num.push(currnum);
        currnum=0;
        st.push(currstr);
        currstr="";
      }
      else if(c==']'){
        String prev=st.pop();
        int repeat=num.pop();
        StringBuilder sb=new StringBuilder(prev);
        for(int i=0;i<repeat;i++){
          sb.append(currstr);
        }
        currstr=sb.toString();
      }else{
        currstr+=c;
      }
      
    }
    System.out.println(currstr);
  }
}

//s="3[a2[c]]";
// output=accaccacc