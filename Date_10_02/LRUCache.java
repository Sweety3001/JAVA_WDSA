import java.util.HashMap;

public class LRUCache {
  static class Node{
    int key;
    int val;
    Node prev,next;
    Node(int k, int v){
      this.key=k;
      this.val=v;
    }
  }
  static Node head= new Node(0,0);
  static Node tail= new Node(0,0);
  static HashMap<Integer, Node>map=new HashMap<>();
  static int cap=3;
  static int get(int key){
    if(!map.containsKey(key)){
      return -1;
    }
    Node curr=map.get(key);
    remove(curr);
    insertAtTail(curr);
    return curr.val;
  }
  static void remove(Node curr){
    curr.prev.next=curr.next;
    curr.next.prev=curr.prev;
  }
  static void insertAtTail(Node curr){
    curr.prev=tail.prev;
    tail.prev=curr;
    curr.next=tail;
  }
  static void addLRU(int k,int v){
    Node newNode=new Node(k,v);
    if(cap>map.size()){
      insertAtTail(newNode);
    }else{
      remove(head.next);
      insertAtTail(newNode);
    }
    map.put(k,newNode);
  }
  public static void main(String[] args) {
    
  }
}
//lru cache