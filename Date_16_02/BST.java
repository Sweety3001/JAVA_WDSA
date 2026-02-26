// package Day 16;
// BST using recursive function.


import java.util.*;
public class BST {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }
    static Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key > root.data) {
            root.right = insert(root.right, key);
        } else {
            root.left = insert(root.left, key);
        }
        return root;
    }
    static void inOrder(Node root) {
        if (root == null) {
           return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        System.out.println("\nLevel Order:");
        while (!q.isEmpty()) {
            Node temp = q.poll();
            System.out.print(temp.data + " ");

            if (temp.left != null) {
                q.offer(temp.left);
            }
            if (temp.right != null) {
                q.offer(temp.right);
            }
        }
    }
    static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (key > root.data) {
            return search(root.right, key); 
        }else {
            return search(root.left, key);
        }
    }
// Find minimum maximum
    static ArrayList<Integer> findMaxMin(Node root) {
        ArrayList<Integer> lst = new ArrayList<>();
        if (root == null) {
            return lst;
        }
        Node temp = root;
        while (temp.left != null) {
            temp = temp.left;
        }
        lst.add(temp.data);
        temp = root;
        while (temp.right != null) {
            temp = temp.right;
        }
        lst.add(temp.data);
        return lst;
    }
// Is valid or not
    static boolean isValid(Node root, int max, int min){
        if(root==null)
            return true;
        if(root.data >= max || root.data<= min) return false;
        return isValid(root.left, min, root.data) && isValid(root.right, max, root.data);
    }
// Top View
    static void leftView(Node root){
        if(root == null) return;
        Node temp = root;
        leftView(root.left);
        System.out.println(root.data);
        
    }
    static void topView(Node root){
        if(root == null) return;
        leftView(root);
        Node temp = root.right;
        while(temp!=null){
            System.out.println(root.data + " ");
            temp = temp.right;
        }
    }
    static Node dlt(Node root,int key){
        if(root == null) return null;
        if(root.data<key){
            root.right=dlt(root.right,key);
        }
        else if(root.data>key){
            root.left=dlt(root.left,key);
        }
        else{
            if(root.left==null) return root.right;
            else if(root.right==null) return root.left;

            Node replaceNode=findNode(root.right);
            root.data=replaceNode.data;
            root.right=dlt(root.right, replaceNode.data);
        }
        return root;
    }
    static Node findNode(Node root){
        if(root==null) return null;
        while(root.left !=null){
            root=root.left;
        }
        return root;
    }
    static void kth_ancestor(Node root, int keyNode, int target, int k){
        if(root==null) return;
        if(root.data < keyNode){
            kth_ancestor(root.right, keyNode, target+1, k);
        }
        else if(root.data > keyNode){
            kth_ancestor(root.left, keyNode,target+1, k);
        }
        else if(root.data==keyNode){
            return;
        }
        if(target+1==k){
            System.out.println(root.data+" ");
        }
    }
    public static void main(String[] args) {
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
        System.out.println();
        System.out.println("Search 80: " + search(root, 80));
        levelOrder(root);   
        System.out.println("\nMin & Max: " + findMaxMin(root));
        System.out.println("Is Valid BST: " + isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
        System.out.println();
        root=dlt(root,20);
        inOrder(root);
    }
}