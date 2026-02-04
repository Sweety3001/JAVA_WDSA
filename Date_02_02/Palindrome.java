public class Palindrome {

    // ================= NODE =================
    static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    // ================= ADD AT BEGINNING =================
    static Node addElementAtBeg(Node head, int d) {
        Node newNode = new Node(d);
        newNode.next = head;
        return newNode;
    }

    // ================= FIND MIDDLE =================
    static Node findMiddle(Node head) {
        if (head == null) return null;

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // left middle
    }

    // ================= REVERSE LIST =================
    static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // ================= PALINDROME CHECK =================
    static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        // 1. Find middle
        Node middle = findMiddle(head);

        // 2. Reverse second half
        Node secondHalf = reverse(middle.next);

        // 3. Compare both halves
        Node p1 = head;
        Node p2 = secondHalf;
        boolean isPal = true;

        while (p2 != null) {
            if (p1.data != p2.data) {
                isPal = false;
                break;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        // 4. Restore original list
        middle.next = reverse(secondHalf);

        return isPal;
    }

    // ================= TRAVERSE =================
    static void traverse(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // ================= CYCLE DETECTION =================
    static Node isCycle(Node head) {
        if (head == null) return null;

        Node slow = head;
        Node fast = head;

        // Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Find cycle start
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null; // no cycle
    }

    // ================= MAIN =================
    public static void main(String[] args) {

        // -------- PALINDROME TEST --------
        Node head = null;
        head = addElementAtBeg(head, 10);
        head = addElementAtBeg(head, 20);
        head = addElementAtBeg(head, 30);
        head = addElementAtBeg(head, 20);
        head = addElementAtBeg(head, 10);

        System.out.print("Linked List: ");
        traverse(head);

        System.out.println("Is Palindrome? " + isPalindrome(head));

        System.out.print("After Check (restored): ");
        traverse(head);

        // -------- CYCLE TEST --------
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b; // cycle starts at node 'b'

        Node cycleStart = isCycle(a);
        if (cycleStart != null) {
            System.out.println("Cycle starts at node: " + cycleStart.data);
        } else {
            System.out.println("No cycle detected");
        }
    }
}
