import java.util.ArrayDeque;
import java.util.Deque;

public class MultilevelLL{
	static class Node{
		int data;
		Node prev;
		Node next;
		Node child;
		Node(int data){
			this.data = data;
		}
	}

	static void printDepthFirst(Node head){
		if(head==null){
			System.out.println();
			return;
		}
		Deque<Node> stack = new ArrayDeque<>();
		Node curr = head;
		boolean first = true;
		while(curr!=null || !stack.isEmpty()){
			if(curr==null){
				curr = stack.pop();
				continue;
			}
			if(first){
				first = false;
			}else{
				System.out.print("->");
			}
			System.out.print(curr.data);

			if(curr.child!=null){
				if(curr.next!=null){
					stack.push(curr.next);
				}
				curr = curr.child;
			}else{
				curr = curr.next;
			}
		}
		System.out.println();
	}

	public static void main(String[] args){
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		n1.next = n2; n2.prev = n1;
		n2.next = n3; n3.prev = n2;
		n3.next = n4; n4.prev = n3;
		n4.next = n5; n5.prev = n4;
		n5.next = n6; n6.prev = n5;

		Node n7 = new Node(7);
		Node n8 = new Node(8);
		n7.next = n8; n8.prev = n7;
		n3.child = n7;

		Node n9 = new Node(9);
		Node n10 = new Node(10);
		n8.next = n9; n9.prev = n8;
		n9.next = n10; n10.prev = n9;

		Node n11 = new Node(11);
		Node n12 = new Node(12);
		n11.next = n12; n12.prev = n11;
		n8.child = n11;

		printDepthFirst(n1);
	}
}