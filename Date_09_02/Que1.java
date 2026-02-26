
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;


public class Que1 {
  static void reverseK(Deque<Integer> que,int k){
    if(k==1 || k>que.size()) return;
    Stack<Integer> st=new Stack<>();
    for(int i=0;i<k;i++){
      st.push(que.poll());
    }
    while(!st.isEmpty()){
      que.offer(st.pop());
    }
    for(int i=0;i<que.size()-k;i++){
      que.offer(que.poll());
    }
  }
  public static void main(String[] args) {
    Deque<Integer> que=new ArrayDeque<>();
    que.offer(10);
    que.offer(20);
    que.offer(30);
    que.offer(40);
    que.offer(50);
    reverseK(que,3);
    for(int i:que){
      System.out.println(i);
    }
  }
}
