public class RotateNtimes {
  static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }
    static void traverse(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static Node reverse(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    static Node rotate(Node head,int n){
      Node temp=head;
      while(n!=0 && temp.next.next==null){
        Node newNode=temp.next;
        newNode.next=head;
        temp.next=null;
        n--;
      }
      return head;
    }

    static Node addElementFront(Node head, int d) {
        Node newNode = new Node(d);
        newNode.next = head;
        return newNode;
    }
  public static void main(String[] args) {
    Node head2 = null;
        head2 = addElementFront(head2, 4);
        head2 = addElementFront(head2, 6);
        head2 = addElementFront(head2, 5);
        int n=2;
        rotate(head2,n);
        traverse(head2);
  }
}
