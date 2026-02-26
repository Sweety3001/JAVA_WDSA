import java.util.*;
public class BinarytreeSir {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static Node root;
    static void insert(int d){
        Node newNode = new Node(d);
        if(root==null){
            root=newNode;
            return ;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node temp=q.poll();
            if(temp.left==null){
                temp.left=newNode;
                return ;
            }else{
                q.offer(temp.left);
            }
            if(temp.right==null){
                temp.right=newNode;
                return ;
            }else{
                q.offer(temp.right);
            }
        }
    }

    static void preOrder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void inOrder(Node root){
        if(root==null){
            return ;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

     static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
     }

     static void levelOrder(Node root){
        if(root==null){
            return ;
        }
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node temp=q.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null){
                q.offer(temp.left);
            }
            if(temp.right!=null){
                q.offer(temp.right);
            }
        }
     }

     static boolean search(int key){
        if(root==null){
            return false;
        }
        Queue<Node> q=new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            Node temp=q.poll();
            if(temp.data==key){
                return true;
            }
            if(temp.left!=null){
                q.offer(temp.left);
            }
            if(temp.right!=null){
                q.offer(temp.right);
            }
        }
        return false;
     }

     static int height(Node root){
        if(root==null){
            return -1;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        return Math.max(leftHeight, rightHeight)+1;
     }

     static void delete(int key){
        if(root==null){
            return ;
        }
        if(root.data==key && root.left==null && root.right==null){
            root=null;
            return ;
        }
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        Node keyNode=null;
        Node temp=null;

        while(!q.isEmpty()){
            temp=q.poll();
            if(temp.data==key){
                keyNode=temp;
            }
            if(temp.left!=null){
                q.offer(temp.left);
            }
            if(temp.right!=null){
                q.offer(temp.right);
            }
        }
        if(keyNode!=null){
            keyNode.data=temp.data;
            deleteDeepest(temp);
        }
     }

     static void deleteDeepest(Node delNode){
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        Node temp;
        while(!q.isEmpty()){
            temp=q.poll();
            if(temp==delNode){
                temp=null;
                return ;
            }
            if(temp.right!=null){
                if(temp.right==delNode){
                    temp.right=null;
                    return ;
                }else{
                    q.offer(temp.right);
                }
            }
            if(temp.left!=null){
                if(temp.left==delNode){
                    temp.left=null;
                    return ;
                }else{
                    q.offer(temp.left);
                }
            }
        }
    }

    public static void main(String args[]){
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insert(50);

        preOrder(root);//10 20 40 50 30 
        System.out.println();
        inOrder(root);//40 20 50 10 30
        System.out.println();
        postOrder(root);//40 50 20 30 10
        System.out.println();
        levelOrder(root);//10 20 30 40 50
        System.out.println();

        System.out.println(height(root));
    }
    
}