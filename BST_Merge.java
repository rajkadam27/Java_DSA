import java.util.*;

class BST_Merge {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
          this.data = data;
          this.left = null;
          this.right = null;
        }  
    }


    public static void GetInorder(Node root , ArrayList<Integer> arr){

        if(root == null){
            return;
        }

        GetInorder(root.left,arr);
        arr.add(root.data);
        GetInorder(root.right,arr);
    }

    public static Node createBST_balanced (ArrayList<Integer> arr , int start, int end){

        if(start>end){
            return null;
        }

        int mid = (start + end) / 2;
        Node root = new Node(arr.get(mid));

        root.left = createBST_balanced(arr, start, mid-1);
        root.right = createBST_balanced(arr, mid+1, end);

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


    public static Node MergeBST(Node root1 , Node root2){


//step 1
        ArrayList<Integer> arr1 = new ArrayList<>();
        GetInorder(root1,arr1);
// step 2  
        ArrayList<Integer> arr2 = new ArrayList<>();
        GetInorder(root2,arr2);
//step 3 -> merge
        int i = 0 , j = 0;

        ArrayList<Integer> finalArray = new ArrayList<>();

        while(i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)){
                finalArray.add(arr1.get(i));  // compare and add small element in arr1
                i++;
            } else {
                finalArray.add(arr2.get(j));
                j++;
            }
        }

        while(i < arr1.size()) {  //for remaining elements in arr
            finalArray.add(arr1.get(i));
            i++;
        }

        while(j < arr2.size()) {
            finalArray.add(arr2.get(j));
            j++;
        }

// soerted array -> create balanced BST
        return createBST_balanced(finalArray, 0, finalArray.size()-1);

    }

    public static void main(String[] args) {
        

        Node root1 = new Node(2);
        root1.left = new Node(1); 
        root1.right = new Node(4);

        
        Node root2 = new Node(9);
        root2.left = new Node(3); 
        root2.right = new Node(12);

        Node root = MergeBST(root1,root2);
        Preorder(root);

        }
  }
