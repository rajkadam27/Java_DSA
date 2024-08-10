import java.util.*;

class BST_problem {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
          this.data = data;
        }  
    }

    public static Node insert(Node root , int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data>val){
            root.left = insert(root.left, val);
        }

        else{
            root.right = insert(root.right, val);
        }
        return root;

    }

    
    public static void printRoot2path(Node root , ArrayList<Integer> path){

        if(root==null){
            return;
        }

        path.add(root.data);
        if(root.left==null && root.right==null){
            printpath(path);
        }

        printRoot2path(root.left, path);
        printRoot2path(root.right, path);
        path.remove(path.size()-1);
    }

    
    public static void Inorder(Node root){

        if(root == null){
            return;
        }

        Inorder(root.left);
        System.out.print (root.data + " ");
        Inorder(root.right);
    }

    public static void printpath(ArrayList<Integer> path){
        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }

    public static boolean isValid(Node root , Node min , Node max){

        if(root == null){
            return true;
        }

        if(min != null && root.data<=min.data){
            return false;
        }

        else if(max != null && root.data>=max.data){
            return false;
        }

        return isValid(root.left, min, root) && isValid(root.right,root,max);


    }

    public static Node CreateMirror(Node root){
        if(root == null){
            return null;
        }

        Node LeftMirror = CreateMirror(root.left);
        Node RightMirror = CreateMirror(root.right);

        root.left = RightMirror;
        root.right = LeftMirror;
        return root;
    }

    public static void Preorder(Node root){

        if(root == null){
            return;
        }

        System.out.print (root.data + " ");
        Preorder(root.left);
        Preorder(root.right);
    }

    public static void main(String[] args) {

        // int val[] = {8,5,3,1,4,6,10,11,14}; 
        // Node root = null;

        // for(int i=0 ; i<val.length ; i++){
        //     root = insert(root, val[i]);
        // }

        // Inorder(root);
        // System.out.println(); 
        // printRoot2path(root , new ArrayList<>());

        // if(isValid(root,null,null)){
        //     System.out.print("valid BST");
        // }
        // else{
        //     System.out.print("Invalid BST");
        // }

        Node root = new Node(8);
        root.left = new Node(5); 
        root.right = new Node(10);  
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        root = CreateMirror(root);
        Preorder(root);
        
        }
  }
