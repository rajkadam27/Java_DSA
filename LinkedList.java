public class LinkedList{

    public static class Node{
        int data;
        Node next;  // the next node is reference variable to store the address of next node

        public Node(int data){
            this.data = data;
            this.next = null;
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

        // step3 - head =newnode
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

        // step3 - tail = newnode
        tail = newNode;
    }

    public void middleAdd(int idx, int data){

        if(idx == 0){
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Size++;

        Node temp = head ; 
        int i = 0;

        while(i < idx-1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;

    }

    public int removeFirst(){

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
        
        int value = head.data;
        head  = head.next;
        Size--;
        return value;
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

    public int itrSearch(int key){
        int index = 0;
        Node temp = head ; 

        while(temp != null){
            if(temp.data == key){
                return index;
            }
            temp  = temp.next;
            index++;
        }
        return -1;
    }

    public void reverse(){

        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public void remoneNthIndex(int n){

        int sz=0;
        Node temp = head;

        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if(n == sz){
            head = head.next;   //remove head to make it null
            return;
        }

        int i = 1;
        int toFind = sz-n;
        Node prev = head;

        while(i<toFind){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    public void display(){

        if(head == null){
            System.out.println("linked list is empty");
            return;
        }

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){

        LinkedList l = new LinkedList();

        
        l.addFirst(2);
        l.addFirst(1);
        // l.addFirst(3);
        // l.addFirst(4);

        l.addLast(3);
        l.addLast(4);

        // l.middleAdd(2,9);

        l.display();

        // l.removeFirst();
        // l.display();

        // l.removeLast();
        // l.display();

        l.remoneNthIndex(2);
        l.display();

        // l.reverse();
        // l.display();



        // int key =9;
        // System.out.println(l.itrSearch(key));

        // System.out.println(l.Size);
     
    }
}