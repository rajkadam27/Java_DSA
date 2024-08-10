// import java.util.LinkedList;
public class LinkedList_mergesort{

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


    private Node getMid(Node head){

        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //mid
    }

    private Node merge(Node head1, Node head2){

        Node mergell = new Node(-1);
        Node temp  = mergell;

        while(head1 != null && head2 != null){
            if(head1.next <= head2.next){
                temp.next = head1;
                head1 = head1.next;
                head1.next = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                head2.next = temp.next;
            }

            while(head1 != null){
                temp.next = head1;
                head1 = head1.next;
                head1.next = temp.next;
            }
            while(head2 != null){
                temp.next = head2;
                head2 = head2.next;
                head2.next = temp.next;
            }


        }
            return mergell.next;

    }

    public Node megresort(Node head){

        if(head == null || head.next == null){
            return head;
        }

        Node mid = getMid(head);
        Node righthhead = mid.next;
        mid.next = null;

        Node newLeft = megresort(head);
        Node newRight = megresort(righthhead);

        return merge(newLeft, newRight);

    }



    public static void main(String args[]){

        LinkedList_mergesort l = new LinkedList_mergesort();

        // add

        l.addFirst(1);
        l.addFirst(2);
        l.addFirst(3);
        l.addFirst(4);
        l.addFirst(5);

        l.display();
        l.head = l.megresort(l.head);
        l.display();
    }
}
