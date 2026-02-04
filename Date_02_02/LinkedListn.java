
public class LinkedListn {

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

    static Node addElementEnd(Node head, int d) {
        Node newNode = new Node(d);
        if (head == null) {
            return newNode;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    static Node addElementPos(Node head, int data, int pos) {
        if (pos <= 1) {
            return addElementFront(head, data);
        }

        Node temp = head;
        int idx = 1;

        while (temp != null && idx < pos - 1) {
            temp = temp.next;
            idx++;
        }

        if (temp != null) {
            Node newNode = new Node(data);
            newNode.next = temp.next;
            temp.next = newNode;
        }
        return head;
    }

    static Node deleteElementFront(Node head) {
        if (head == null) {
            return null;
        }
        return head.next;
    }

    static Node deleteElementData(Node head, int d) {
        if (head == null) {
            return null;
        }

        // If head itself needs to be deleted
        if (head.data == d) {
            return head.next;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != d) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
        return head;
    }

    static Node deleteElementPos(Node head, int pos) {
        if (head == null || pos <= 1) {
            return deleteElementFront(head);
        }

        Node temp = head;
        int idx = 1;

        while (temp.next != null && idx < pos - 1) {
            temp = temp.next;
            idx++;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
        return head;
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
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    
    public static void main(String[] args) {
        Node head = null;

        head = addElementFront(head, 10);
        head = addElementFront(head, 20);
        head = addElementFront(head, 30);
        head = addElementFront(head, 40);
        head = addElementEnd(head, 50);
        head = addElementEnd(head, 60);
        head = deleteElementData(head, 10);
        head = reverse(head);
        traverse(head);
    }
}
