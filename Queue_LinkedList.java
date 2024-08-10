import java.util.*;
public class Queue_LinkedList{

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Queue{

        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        //add 
        public static void add(int data){
            
            Node newNode = new Node(data);

            if(head == null){
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        public static int remove(){

            if(isEmpty()){
                System.out.println("Empty queue");  
                return -1;
            }
            
            int front = head.data;

            //single element
            if(tail == head){
                tail = head = null;
            }
            else{
                head = head.next;
            }
            return front;
        
        }

        public static int peek(){

            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            
            return head.data;
            
        }
     }
        

    public static void main(String args[]){

        Queue s = new Queue();
        s.add(1);
        s.add(2);
        s.add(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.remove();
        }
        
    }
}
