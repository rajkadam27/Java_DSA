import java.util.*;
import java.util.LinkedList;

class BinaryTreeB_Height {

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

    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh)+1;
    }

    public static int Count(Node root){
        if(root == null){
            return 0;
        }

        int leftCount = Count(root.left);
        int rightCount = Count(root.right);
        return leftCount+rightCount+1;
    }

    public static int sum(Node root){
        if(root == null){
            return 0;
        }

        int leftsum= sum(root.left);
        int rightsum = sum(root.right);
        return leftsum+rightsum+root.data;
    }

    public static int Diametre(Node root){  //0(n^2)
        if(root == null){
            return 0;
        }

        int leftDiametre= Diametre(root.left);
        int lh = height(root.left);
        int rightDiametre = Diametre(root.right);
        int rh = height(root.right);

        int selfDiametre = lh + rh +1;

        return Math.max(selfDiametre , Math.max(lh , rh));
    }

    static class info{  //0(n)
        int dia;
        int ht;

        public info(int dia, int ht){
            this.dia = dia;
            this.ht = ht;
        }
    }

    public static info Diametre1(Node root){

        if(root == null){
            return new info(0,0); 
        }

        info leftinfo = Diametre1(root.left);
        info rightinfo = Diametre1(root.right);

        int dia = Math.max(Math.max(leftinfo.dia , rightinfo.dia ), leftinfo.ht + rightinfo.ht + 1);
        int ht = Math.max(leftinfo.ht , rightinfo.ht)+1;
        return new info(dia , ht);
    }

    static class information{  //0(n)
        Node node;
        int hd;

        public information(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root){

        Queue <information> queue = new LinkedList<>();
        HashMap<Integer , Node > map = new HashMap<>();

        int min=0 ;
        int max = 0;

        queue.add(new information(root , 0));
        queue.add(null);

        while(!queue.isEmpty()){
            information curr  = queue.remove();
            if(curr==null){
                System.out.println();
            
                if(queue.isEmpty()){
                    break;
                }
                else{
                    queue.add(null);
                }
            }
            if(!map.containsKey(curr.hd)){

                map.put(curr.hd, curr.node);
            }

            if(curr.node.left != null){
                queue.add(new information(curr.node.left , curr.hd-1));
                min = Math.min(min, curr.hd-1);
            }

            if(curr.node.right != null){
                queue.add(new information(curr.node.right , curr.hd+1));
                max = Math.max(max, curr.hd+1);
            }
                    
    }
    for(int i = min ; i < max ; i++){
        System.out.println(map.get(i).data+" ");
    }
    System.out.println();   

    }


    
    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(height(root));
        System.out.println(Count(root));
        System.out.println(sum(root));
        System.out.println(Diametre(root));
        System.out.println(Diametre1(root).dia);
         
        topView(root);
  }
}