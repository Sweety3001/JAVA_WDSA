public class LLmergeSort {
  
    static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    static Node addElementFront(Node head,int d){
        Node newNode=new Node(d);
        if(head==null){
            return newNode;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return head;
    }
    static Node findMid(Node head){
      if(head==null || head.next==null) return head;
      Node slow=head;
      Node fast=head;
      while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
      }
      return slow;
    }
    static Node mergeSort(Node head){
      if(head==null || head.next==null) return head;
        Node mid=findMid(head);
        Node right=mid.next;
        mid.next=null;
        head=mergeSort(head);
        right=mergeSort(right);
        return merge(head,right);
      
      
    }
    static Node merge(Node l1,Node l2){
      Node l3=new Node(-1);
      Node temp=l3;
      while(l1!=null && l2!=null){
        if(l1.data<=l2.data){
          temp.next=new Node(l1.data);
          l1=l1.next;
        }else{
          temp.next=new Node(l2.data);
          l2=l2.next;
        }
        temp=temp.next;
        while(l1!=null){
          temp.next=new Node(l1.data);
          l1=l1.next;
          temp=temp.next;
        }
        while(l2!=null){
          temp.next=new Node(l2.data);
          l2=l2.next;
          temp=temp.next;
        }
      }
      return l3.next;
    }
  static void traverse(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    //10 20 30 40 50 60
  public static void main(String[] args) {
        Node head = null;
        head = addElementFront(head, 6);
        head = addElementFront(head, 1);
        head = addElementFront(head, 2);
        System.out.println("Original: ");
        traverse(head);
        System.out.println("Sorted");
        head=mergeSort(head);
        traverse(head);
  }
}
