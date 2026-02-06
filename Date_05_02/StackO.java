
import java.util.ArrayList;
import java.util.Arrays;


public class StackO {

  static class Node{
    int data;
    Node next;
    Node(int d){
      this.data=d;
      this.next=null;
    }
  }
  static Node top=null;
  static void push(int d){
    Node newNode=new Node(d);
    if(top==null){
      top=newNode;
    }else{
      newNode.next=top;
      top=newNode;
    } 
  }
  static int pop(){
    if(top==null) return -1;
    Node temp=top;
    int k=temp.data;
    top=top.next;
    // temp=null;
    return k;
  }
  static void isEmpty(){
    if(top==null){
      System.out.println("Empty Stack");
    }
  }
  static int len(){
    if(top==null) return 0;
    Node temp=top;
    int c=0;
    while(temp!=null){
      temp=temp.next;
      c++;
    }
    return c;
  }
  static ArrayList<Integer> maxmin(){
    ArrayList<Integer> lst=new ArrayList<>(Arrays.asList(top.data,top.data));
    Node temp=top;
    while(temp!=null){
      if(temp.data<lst.get(0)){
        lst.set(0,temp.data);
      }else if(temp.data>lst.get(1)){
        lst.set(1,temp.data);
      }
      temp=temp.next;
    }
    return lst;
  }
  static Node reverse(){
    Node prev=null;
    Node curr=top;
    Node next =null;
    while(curr != null){
      next=curr.next;
      curr.next=prev;
      prev=curr;
      curr=next;
    }
    top=prev;
  }
  public static void main(String[] args) {
    
  }
}
