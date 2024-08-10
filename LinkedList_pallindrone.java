public class LinkedList_pallindrone{

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

    public Node findMid(Node head){

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean isPallindrone(){

        if(head == null || head.next == null){

            return true;
        }

        // step-1 => find mid

        Node mid = findMid(head);

        // step-2 => reverse  second half of linked list 

        Node prev = null;
        Node curr = mid;
        Node next;

        while(curr != null){
            
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;  //right half head
        Node left = head;  //left half head

        // step-3 => check left and right half

        while(right != null){
            if(right.data != left.data){
                return false;
            }
            right = right.next;
            left = left.next;
        } 

        return true;
    }

    public static boolean iscycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){
                return true;  //cycle exits
            }
        }
        return false;
    }

    public static boolean isRemoveCucle(){

        //1 . find cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){
                cycle = true;  //cycle exits
                break;
            }
        }
        if(cycle == false){

          return;
        }

        // finding meeting point
        slow = head;
        Node prev = null; //last node

        while(slow != fast){

            prev = fast;
            slow = slow.next;
            fast = fast.next;

        }

        //last node null

        prev.next = null; 
    }
    
    public static void main(String args[]){

        LinkedList_pallindrone l = new LinkedList_pallindrone();

        
        l.addFirst(2);
        l.addFirst(1);

        l.addLast(2);
        l.addLast(1);

        l.display();

        System.out.println(l.isPallindrone());

        //isCycle();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;

        System.out.println(iscycle());

    }
}