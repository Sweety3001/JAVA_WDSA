public class LLsum {

    static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    static Node addElementFront(Node head, int d) {
        Node newNode = new Node(d);
        newNode.next = head;
        return newNode;
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

    static Node addElement(Node head, Node newNode) {
        newNode.next = head;
        return newNode;
    }

    static Node sum(Node head1, Node head2) {
        if (head1 == null && head2 == null) return null;
        if (head1 == null) return head2;
        if (head2 == null) return head1;
        Node head = null;
        Node temp1 = reverse(head1);
        Node temp2 = reverse(head2);
        int carry = 0;
        while (temp1 != null && temp2 != null) {
            int key = temp1.data + temp2.data + carry;
            carry = key / 10;
            head = addElement(head, new Node(key % 10));

            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        while (temp1 != null) {
            int key = temp1.data + carry;
            carry = key / 10;

            head = addElement(head, new Node(key % 10));
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            int key = temp2.data + carry;
            carry = key / 10;

            head = addElement(head, new Node(key % 10));
            temp2 = temp2.next;
        }
        if(carry!=0){
          head=addElement(head, new Node(carry));
        }
        return head;
    }

    public static void main(String[] args) {

        // First number: 843
        Node head1 = null;
        head1 = addElementFront(head1, 3);
        head1 = addElementFront(head1, 4);
        head1 = addElementFront(head1, 8);

        // Second number: 564
        Node head2 = null;
        head2 = addElementFront(head2, 4);
        head2 = addElementFront(head2, 6);
        head2 = addElementFront(head2, 5);

        Node result = sum(head1, head2);

        traverse(result);
    }
}
