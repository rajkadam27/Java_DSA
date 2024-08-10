public class LinkedList_Double{

     public static class Node{
        int data;
        Node next;  // the next node is reference variable to store the address of next node
        Node prev; // the previous node is reference variable to store the address of

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head ;
    public static Node tail ;
    public static int Size;


    public void addFirst(int data){

        // step1 - creating the node
        Node newNode = new Node(data);
        Size++;
        if(head == null){

            head = tail = newNode;
            return;
        }

        // step2 -newnode next = head

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data){

        // step1 - creating the node
        Node newNode = new Node(data);
        Size++;

        if(head == null){

            head = tail = newNode;
            return;
        }

        // step2 - tali.next = head
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    

    public int removeFirst(){
        if(head == null){

            System.out.println("dll is empty");
            return Integer.MAX_VALUE;
        }

        if(Size == 1){
            int val = head.data;
            head = tail = null;
            Size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;
        Size--;
        return val;
    }

    public int removeLast(){

        if(Size == 0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }

        else if(Size == 1){

            int value = head.data;
            head = tail = null;
            Size = 0;
            return value;
        }
        
        Node prev = head;
        for(int i=0; i<Size-2 ; i++){
            prev = prev.next;

        }
        int value = tail.data;
        prev.next = null;
        tail = prev;
        Size--;
        return value;
    }


     
    
    public void display(){

        if(head == null){
            System.out.println("linked list is empty");
            return;
        }

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    
    public void reverse(){

        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }

        head = prev;
    }


    public static void main(String args[]){

        LinkedList_Double l = new LinkedList_Double();

        // add

        l.addFirst(1);
        l.addFirst(2);
        l.addFirst(3);
        l.addFirst(4);
        l.addFirst(5);

        // l.display();
        // System.out.println(l.Size);

        // l.removeFirst();
        // l.display();
        // System.out.println(l.Size);

        l.addLast(7);
        l.display();
        System.out.println(l.Size);

        l.removeLast();
        l.display();
        System.out.println(l.Size);

        // l.reverse();
        // l.display();
        
    }
}
