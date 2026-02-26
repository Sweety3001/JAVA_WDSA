public class multiLevelLL {
  static class Node{
    int data;
    Node next;
    Node child;
    Node prev;
    Node(int data){
      this.data=data;
      this.next=null;
      this.child=null;
      this.prev=null;
    }
  }
  public static void main(String[] args) {
    
  }
}
// 1<->2<->3<->4
//         |
//         5<->6<->7<->8
//             |
//             9<->10
