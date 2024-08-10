import java.util.*;

class BST_problem2 {

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


    
    public static void Inorder(Node root){

        if(root == null){
            return;
        }

        Inorder(root.left);
        System.out.print (root.data + " ");
        Inorder(root.right);
    }


    public static void Preorder(Node root){

        if(root == null){
            return;
        }

        System.out.print (root.data + " ");
        Preorder(root.left);
        Preorder(root.right);
    }

    public static Node createBST_balanced (int arr[] , int start, int end){

        if(start>end){
            return null;
        }

        int mid = (start + end) / 2;
        Node root = new Node(arr[mid]);

        root.left = createBST_balanced(arr, start, mid-1);
        root.right = createBST_balanced(arr, mid+1, end);

        return root;
    }

    static class Info{
        boolean IsBST;
        int size;
        int min;
        int max;

        public Info(boolean isBST , int size, int min, int max){
            this.IsBST = IsBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
    
    public static int maxBST=0;
    public static Info largeBst(Node root){

        if(root == null){
            return new Info (true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }

        Info leftInfo = largeBst(root.left);
        Info rightInfo = largeBst(root.right);

        int size  = leftInfo.size+rightInfo.size+1;
        int min = Math.min(root.data , Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data , Math.max(leftInfo.max , rightInfo.max));

        if(root.data<=leftInfo.max && root.data>=rightInfo.min){
            return new Info(false , size, min, max);
        }

        if(leftInfo.IsBST && rightInfo.IsBST){
            maxBST = Math.max(maxBST, size);
            return new Info(true , size, min, max);
        }

        return new Info(false , size, min, max);

    }

    public static void main(String[] args) {
        
        int arr[] = {3,5,6,8,10,11,12};

        // Node root = createBST_balanced(arr,0,arr.length-1); 
        // Preorder(root);

        Node root = new Node(50);
        root.left = new Node(30); 
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60); 
        root.right.left = new Node(45); 
        root.right.right = new Node(70);
        root.right.right.left = new Node(65); 
        root.right.right.right = new Node(80);

        Info info = largeBst(root);
        System.out.println("largest BST size "+maxBST);


        }
  }
