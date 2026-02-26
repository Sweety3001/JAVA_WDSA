public class CollisionHandle{
    static class Node{
        String key;
        String value;
        Node next;
        Node(String k,String v){
            this.key=k;
            this.value=v;
            this.next=null;
        }
    }

    static int capacity=5;
    static Node[] arr = new Node[capacity];

    static int hash(String key){
        int idx=Math.abs(key.hashCode())%capacity;
        return idx;
    }

    static void put(String k,String v){
        int idx=hash(k);
        Node head=arr[idx];
        while(head!=null){
            if(head.key.equals(k)){
                head.value=v;
                return;
            }
            head=head.next;
        }

        Node newNode=new Node(k,v);
        newNode.next=arr[idx];
        arr[idx]=newNode;

    }

    static String get(String k){
        int idx=hash(k);
        Node head=arr[idx];

        while(head!=null){
            if(head.key.equals(k)){
                return head.value;
            }
            head=head.next;
        }
        return null;
    }

    public static void main(String args[]){
        put("bhoomi","jain");
        put("piyu","kumar");
        put("kirtan","jain");
        put("bhoomi","sharma");
        System.out.println(get("bhoomi"));
        System.out.println(get("piyu"));
        System.out.println("bhoomi: "+ hash("bhoomi"));   

    }
}