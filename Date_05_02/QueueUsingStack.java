import java.util.*;
public class QueueUsingStack {
  static Stack<Integer> top1=new Stack<>();
  static Stack<Integer> top2=new Stack<>();
  static void enqueue(int d){
    top1.push(d);
  }
  static int dequeue(){
    if(top2.isEmpty()){
      while(!top1.isEmpty()){
        top2.push(top1.pop());
      }
    }
    return top2.pop();
  }
  public static void main(String[] args) {
    enqueue(10);
    enqueue(20);
    enqueue(30);
    System.out.println(dequeue());
    enqueue(40);
    enqueue(50);
    enqueue(60);
    System.out.println(dequeue());
    System.out.println(dequeue());
    System.out.println(dequeue());
    System.out.println(dequeue());
  }
}
