public class ReverseKelement{
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    static Node reversek(Node head, int k){
        if(head==null || k<=1) return head;
        Node dummy = new Node(0);
        dummy.next = head;
        Node groupPrev = dummy;
        while(true){
            Node kth = groupPrev;
            for(int i=0;i<k && kth!=null;i++){
                kth = kth.next;
            }
            if(kth==null){
                Node curr = groupPrev.next;
                Node prev = null;
                while(curr!=null){
                    Node tmp = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = tmp;
                }
                groupPrev.next = prev;
                break;
            }
            Node groupNext = kth.next;

            Node prev = groupNext;
            Node curr = groupPrev.next;
            while(curr!=groupNext){
                Node tmp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = tmp;
            }
            Node newGroupHead = prev;
            Node oldGroupHead = groupPrev.next;
            groupPrev.next = newGroupHead;
            groupPrev = oldGroupHead;
        }
        return dummy.next;
    }

    public static void main(String [] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next = new Node(70);
        head.next.next.next.next.next.next.next = new Node(80);
        head.next.next.next.next.next.next.next.next = new Node(90);
        head.next.next.next.next.next.next.next.next.next = new Node(100);
        head.next.next.next.next.next.next.next.next.next.next = new Node(110);
        

        int k = 3;
        Node result = reversek(head, k);
        printList(result);
    }

    static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data);
            if(curr.next!=null) System.out.print("->");
            curr = curr.next;
        }
        System.out.println();
    }
    
}