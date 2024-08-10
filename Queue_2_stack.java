import java.util.*;
public class Queue_2_stack{

    static class Queue{

    static Stack<Integer> s1  = new Stack<>();
    static Stack<Integer> s2  = new Stack<>();
    
    public static boolean isEmpty(){
        return s1.isEmpty();
        //&& s2.isEmpty();
    }

    public static void add(int data){
        
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }

        s1.push(data);

        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public static int remove(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }

        return s1.pop();
    }

    public static int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }

        return s1.peek();
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
