import java.util.*;
import java.util.LinkedList;

class BinaryTreeB_Problem {

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

   public static void Klevel(Node root ,int level ,int k){

    if(root == null){
        return;
    }
    if(level == k){
        System.out.print(root.data+" ");
        return;
    }
    Klevel(root.left,level+1,k);
    Klevel(root.right,level+1,k);
   }

   public static Node LCA(Node root , int n1 , int n2){

    if(root == null ||root.data==n1 || root.data==n2){
        return root;
    }

        Node leftCA = LCA(root.left,n1,n2);
        Node rightCA = LCA(root.right,n1,n2);

    if(rightCA == null){
        return leftCA;
    }
    if(leftCA == null){
        return rightCA;
    }

    return root;

   }

   public static int lcaDist(Node root , int n){
    if(root == null){
        return -1;
    }

    if(root.data == n){
        return 0;
    }

    int leftDist = lcaDist(root.left, n);
    int rightDist = lcaDist(root.right, n);

    if(leftDist==-1 && rightDist==-1){
        return -1;
    }
    else if(leftDist== -1){
        return rightDist+1;
    }
    else{
        return leftDist+1;
    }
   }

   public static int MinDist(Node root , int n1 , int n2){
    Node lca = LCA(root,n1,n2);
    int dist1 = lcaDist(root.left,n1);
    int dist2 = lcaDist(root.right,n2);

    return dist1 + dist2;
   }


   public static int transform(Node root){

        if(root==null){
            return 0;
        }

        int leftChild = transform(root.left);
        int rightChild = transform(root.right);

        int data = root.data;
        
        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;

        root.data = newLeft + leftChild + newRight +rightChild ;
        return data;
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

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Klevel(root,1,3);
        // System.out.println();

        int n1 = 4 ,n2 = 7;
        System.out.println(LCA(root,n1,n2).data);
        // System.out.println(MinDist(root,n1,n2));

        // transform(root);
        Preorder(root);

  }
}