public class DoublyLL {
  static class Node{
    Node prev;
    int data;
    Node next;
    Node(int d){
      this.prev=null;
      this.data=d;
      this.next=null;
    }
  }
  static Node addElementFront(Node head,int d){
    Node newNode=new Node(d);
    if(head==null) return newNode;
    newNode.next=head;
    head.prev=newNode;
    return newNode;
  }
  static Node addElementTail(Node head,int d){
    Node newNode=new Node(d);
    if(head==null) return newNode;
    Node temp=head;
    while(temp.next!=null){
      temp=temp.next;
    }
    temp.next=newNode;
    newNode.prev=temp;
    return head;
  }
  static Node addElementPos(Node head,int d,int pos){
    Node newNode=new Node(d);
    if(head==null) return newNode;
    if(pos==1) return addElementFront(head, d);
    //null<->10<->20<->30<->40<->null
    Node temp=head;//
    int idx=1;
    while(temp!=null && idx<pos-1){
      temp=temp.next;
      idx++;
    }
    if(temp==null) return head;
    if(temp.next==null) return addElementTail(temp, d);
    newNode.next=temp.next;
    temp.next.prev=newNode;
    temp.next=newNode;
    newNode.prev=temp;
    return head;
  }
  static Node deleteFront(Node head){
    if(head==null) return null;
    if(head.next==null) return null;
    head=head.next;
    head.prev=null;
    return head;
  }
  static Node deleteTail(Node head){
    if(head==null || head.next==null) return null;
    Node temp=head;
    while(temp.next.next!=null){
      temp=temp.next;
    }
    temp.next=null;
    return head;

  }
  // static Node deleteWithData(Node head,int key){
  //   if(head==null || (head.data==key && head.next==null)) return null;
  //   Node temp=head;
  //   while(temp!= null && temp.data!=key){
  //     temp=temp.next;
  //   }
  //   if(temp!=null){
  //     temp.prev.next=temp.next;
  //     temp.next.prev=temp.prev;
  //   }
  //   return head;
  // }
  static Node deleteWithData(Node head,int key){
    if(head==null) return null;

    // delete head
    if(head.data == key){
        return deleteFront(head);
    }

    Node temp=head;

    while(temp!=null && temp.data!=key){
        temp=temp.next;
    }

    if(temp==null) return head;

    // delete tail
    if(temp.next == null){
        temp.prev.next = null;
        temp.prev = null;
        return head;
    }

    // delete middle
    temp.prev.next = temp.next;
    temp.next.prev = temp.prev;

    temp.prev = null;
    temp.next = null;

    return head;
  }

  // static Node deletePos(Node head,int pos){
  //   if(head==null||pos<=1){
  //     return deleteFront(head);
  //   }
  //   Node temp=head;
  //   int idx=1;
  //   while(temp.next!=null && idx<pos-1){
  //     temp=temp.next;
  //     idx++;
  //   }
    
  //   if(temp.next!=null){
  //     temp.next=temp.next.next;
  //     temp.next.next.prev=temp;
  //     temp.next.next=null;
  //     temp.next.prev=null;
  //   }
  //   return head;
  // }
  
  static Node deletePos(Node head,int pos){
    if(head==null) return null;
    if(pos==1) return deleteFront(head);

    Node temp=head;
    int idx=1;

    while(temp!=null && idx<pos){
        temp=temp.next;
        idx++;
    }

    if(temp==null) return head;

    // delete tail
    if(temp.next == null){
        temp.prev.next = null;
        temp.prev = null;
        return head;
    }

    // delete middle
    temp.prev.next = temp.next;
    temp.next.prev = temp.prev;

    temp.prev = null;
    temp.next = null;

    return head;
  }
// https://meet.google.com/xxu-ozjp-yuu?authuser=0

  static Node merge(Node l1,Node l2){
    Node temp1=l1;
    Node temp2=l2;
    Node l3=new Node(0);
    Node temp3=l3;
    while(temp1!=null && temp2!=null){
      if(temp1.data<temp2.data){
        temp3.next=new Node(temp1.data);
        temp3.next.prev=temp3;
        temp3=temp3.next;
        temp1=temp1.next;
      }else{
        temp3.next=new Node(temp2.data);
        temp3.next.prev=temp3;
        temp3=temp3.next;
        temp2=temp2.next;
      }
    }
    while(temp1!=null){
      temp3.next=temp1;
      temp1.prev=temp3;
    }
    while(temp2!=null){
      temp3.next=temp2;
      temp2.prev=temp3;
    }
    return l3.next;
  }
  static Node reverse(Node head){
    if(head==null) return null;
    Node curr=head;
    Node prev=null;
    Node next=null;
    while(curr!=null){
      next=curr.next;
      prev=curr.prev;
      curr.next=prev;
      curr.prev=next;
      curr=next;
    }
    return prev.prev;
  }
  static void traverse(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
  public static void main(String[] args) {
    Node head=addElementTail(null,10);
    head=addElementTail(head, 20);
    head=addElementTail(head, 30);
    head=addElementTail(head, 40);
    head=addElementTail(head, 50);
    head=addElementTail(head, 60);
  }
}
