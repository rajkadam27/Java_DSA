import java.util.*;

class Leetcode_linkedList{

    public static class Node{
        int data;
        Node next;  // the next node is reference variable to store the address of next node
        

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null;
    

    public static Node swapPairs(Node head) {
    if (head == null || head.next == null) {
        return head;
    }

    Node newHead = head.next;
    Node currNode = head;

    while (currNode != null && currNode.next != null) {
        Node next = currNode.next;
        currNode.next = currNode.next.next;
        next.next = currNode;
        if (currNode.next != null) {
            currNode.next.next = next;
        }

        currNode = currNode.next;
    }

    return newHead;
}
    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println(swapPairs(head));
        
    }
}