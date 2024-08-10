import java.util.Stack;

public class Stack_Reverse {

    public static void reverse(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();
        
        while (!stack.isEmpty()) {
            tempStack.push(stack.pop());
        }
        
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }

    public static void pushAtBottom(Stack<Integer> stack , int data) {
       if(stack.isEmpty()){
        stack.push(data);
        return;
       }
       int top = stack.pop();
       pushAtBottom(stack, data);
       stack.push(top);
        }

        // public static void printStack(Stack<Integer> stack){

        // if(!stack.isEmpty()){
        //     System.out.println(stack.pop());
        //     // s.pop();
        //  }
    
    
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        
        while(!stack.isEmpty()){
            System.out.print(stack.peek()+" ");
            stack.pop();
        }
        // System.out.println("Original Stack: " + stack);
        reverse(stack);
        // printStack(stack);
        // System.out.println("Reversed Stack: " + stack);
        pushAtBottom(stack,6);
        // printStack(stack);
        // System.out.println("Reversed Stack: " + stack);

    }
}

