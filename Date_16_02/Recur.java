import BST.Node;

public class Recur {
  static int add(int n){
    if(n==5) return 0;
    System.out.println("Heellloooo "+ n);
    n++;
    add(n);
    System.out.println("Backtrack "+n);
    return 0;
  }
  static boolean isValidBST(Node root,int max,int min){
    if(root == null) return true;
    if(root.data>max || root.data<min) return false;
    return isValidBST(root.left, root.data, min) && isValidBST(root.right, max, root.data);
  }
  static void leftView(Node root){
    if(root==null) return;
    Node temp=root;
    leftView(root.left);
    System.out.println(root.data);
  }
  static void topView(Node root){
    if(root==null) return;
    leftView(root);
    Node temp=root.right;
    while(temp!=null){
      System.out.print(root.data+" ");
      temp=temp.right;
    }
  }
  public static void main(String[] args) {
    add(1);
    Node root = null;
        root = insert(root, 40);
        insert(root, 20);
        insert(root, 60);
        insert(root, 10);
        insert(root, 30);
        insert(root, 50);
        insert(root, 70);
        insert(root, 80);

        inOrder(root);
        
  }
}
