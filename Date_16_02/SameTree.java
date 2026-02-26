import java.util.*;

public class SameTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int d){
            this.data = d;
            this.left = null;
            this.right = null;
        }
    }
    static Node root;
    static void insert(int d){
        Node newNode = new Node(d);
        if(root==null){
            root = newNode;
            return ;
        }
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            Node temp = que.poll();
            if(temp.left==null){
                temp.left = newNode;
                return;
            }
            else{
                que.offer(temp.left);
            }
            if(temp.right == null){
                temp.right = newNode;
                return;
            }
            else{
                que.offer(temp.right);
            }
        }
    }
    static void preOrder(Node root){
        if(root==null) return;
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    static void inOrder(Node root){
        if(root==null) return;
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    static void postOrder(Node root){
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);

    }
    static boolean isEqual(Node root1, Node root2){
        if(root1==null && root2==null) return true;
        if(root1==null || root2==null) return false;

        if(root1.data != root2.data){
            return false;
        }
        return root1.data==root2.data && isEqual(root1.left, root2.left) && isEqual(root1.right, root2.right);
        
    }
    public static void main(String[] args){
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insert(50);
        System.out.println("preorder");
        preOrder(root);      //output: [10,20,40,50,30]
        System.out.println("Inorder");
        inOrder(root);    //output : 40,50,30,10,20
        System.out.println("Postorder");
        postOrder(root);      //output: 40,50,20,30,10
        System.out.println("LevelOrder");

    }
}