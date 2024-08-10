import java.util.*;
public class Stack_Problem{

    public static String reverseString(String str){

        Stack <Character> c = new Stack<Character>();
        int idx=0;

        while(idx < str.length()){
            c.push(str.charAt(idx));
            idx++; // increment
        }

        StringBuilder result = new StringBuilder("");
        while(!c.isEmpty()){
            char curr = c.pop();
            result.append(curr);
        }

        return result.toString();

    }


    public static void pushAtBottom(Stack<Integer> s , int data ){

        if(s.isEmpty()){
            s.push(data);  // all stack is empty then add the data i.e 4
            return;
        }

        int top = s.pop(); // remove the element from the stack
        pushAtBottom(s, data);
        s.push(top); // insert the removing elemenet
        }



    public static void reverseStack(Stack<Integer> s){

        if(s.isEmpty()){
            return;
        }

        int top  = s.pop();
        reverseStack(s);
        pushAtBottom(s , top);
    }

    public static void printStack(Stack<Integer> s){

        if(!s.isEmpty()){
            System.out.println(s.pop());
            // s.pop();
        }
    }


    public static void main(String args[]){


        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s,4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

        reverseStack(s);
        printStack(s);
        
        // String str  = "abc";
        // String result = reverseString(str);
        // System.out.println(result);  

        
    }
}
