
import java.util.ArrayDeque;
import java.util.Deque;

public class stackUsingQueue {
  static void push(Deque<Integer> que,int d){
    que.offer(d);
  }
  static int pop(Deque<Integer> que){
    int n=que.size();
    for(int i=0;i<n-1;i++){
      que.offer(que.poll());
    }
    return que.poll();
  }
  
  public static void main(String[] args) {
    Deque<Integer> que=new ArrayDeque<>();
    push(que,10);    
    push(que,20);    
    push(que,30);    
    push(que,40);    
    push(que,50);    
    System.out.println(pop(que));
    System.out.println(pop(que));
    push(que, 60);
    System.out.println(pop(que));
  }
}
// implement stack using simple queue