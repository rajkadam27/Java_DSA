import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class Queue_problem1{

    public static void Reverse(Queue<Integer> s){

        Stack<Integer> st = new Stack<>();

        while(!s.isEmpty()){
            st.push(s.remove());  // queue madhun remove karun stack madhe add 

        }

        while(!st.isEmpty()){
            s.add(st.pop());
        }

        
    }
    public static void main(String args[]){

     Queue<Integer> s = new LinkedList<>();

        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        s.add(6);
        s.add(7);
        s.add(8);
        s.add(9); 
        s.add(10);

        Reverse(s);

    
        while(!s.isEmpty()){
            System.out.print(s.remove()+" ");
        }
        System.out.println();
        
    }

}
