import java.util.*;

class BST {

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

    public static boolean search(Node root , int key){
        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        }

        if(root.data>key){
            return search(root.left, key);
        }
        else{
            return search(root.right,key);
        }
    }

    public static void Inorder(Node root){

        if(root == null){
            return;
        }

        Inorder(root.left);
        System.out.print (root.data + " ");
        Inorder(root.right);
    }

    public static Node Delete(Node root , int val){
        if(root.data<val){
            root.right = Delete(root.right, val);
        }
        else if(root.data>val){
            root.left = Delete(root.left, val);
        }
        else{
            //case 1 - leaf node 
            if(root.left==null && root.right==null){
                return null;
            }

            // case 2 - single node 
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }

            //case 3
            Node IS = findInorderSuccesor(root.right);
            root.data = IS.data;
            root.right = Delete(root.right,IS.data);
        }

        return root;
    }

    public static Node findInorderSuccesor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void printpath(ArrayList<Integer> path){
        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("null ");
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


    
    public static void main(String[] args) {

        int val[] = {8,5,3,1,4,6,10,11,14}; 
        Node root = null;

        for(int i=0 ; i<val.length ; i++){
            root = insert(root, val[i]);
        }
        
        Inorder(root);
        System.out.println();

        if(search(root,1)){
            System.out.println("found");
        }
        else{
            System.out.print("not found");
        }

        root = Delete(root,1);
        System.out.println();
        
        Inorder(root);
        System.out.println();

        printRoot2path(root , new ArrayList<>());
        }

  }
