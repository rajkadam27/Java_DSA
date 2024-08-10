import java.util.Stack;

public class Valid_Paranthesis {

    public static boolean isValid(String str) {

        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // opening 
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                // closing
                if (s.isEmpty()) {
                    return false;
                }

                if ((s.peek() == '(' && ch == ')') || (s.peek() == '{' && ch == '}') || (s.peek() == '[' && ch == ']')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }

        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isDuplicate(String str1) {

        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);

            // opening 
            if (ch == ')') {
                int count = 0;
                while(s.peek() != '(') {
                s.pop();
                count++;
            }
            if(count<1){
                return true; // dulpicate
            }
            else{
                s.pop(); //opening pair
            }
        }

         else{
            // oppening
            s.push(ch);
        }
    }
        return false; 
    }
    
    public static void maxAreaHistogram(int arr[]){

        int maxArea = 0;
        int nextRightSmaller[] = new int[arr.length];
        int nextLeftSmaller[] = new int[arr.length];

        //next smaller right 

        Stack<Integer> s = new Stack<>();

         for(int i=arr.length-1 ; i>=0 ; i--){

            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop(); 
            }

            if(s.isEmpty()){
                nextRightSmaller[i] = arr.length;
            }
            else{
                nextRightSmaller[i] = s.peek();
            }
            s.push(i);  
         }

             //next smaller left 

         s = new Stack<>();

         for(int i=0 ; i<=arr.length ; i++){

            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop(); 
            }

            if(s.isEmpty()){
                nextLeftSmaller[i] = -1;
            }
            else{
                nextLeftSmaller[i] = s.peek();
            }
            s.push(i);
        }

        // current area 

        for(int i = 0 ; i<arr.length ; i++){
            int height = arr[i];
            int widht = nextRightSmaller[i]-nextLeftSmaller[i]-1;
            int currentArea = height*widht;
            maxArea = Math.max(currentArea,maxArea);
        }

        System.out.println("maximum area in histogram is = " + maxArea);


    }

    public static void main(String args[]) {

        
        String str = "({})[]";
        System.out.println(isValid(str));

        // String str1 = "((a+b))";
        String str1 = "(a+b)";
        System.out.println(isDuplicate(str1));

        int arr[]  = {2,1,5,6,2,3};
        maxAreaHistogram(arr);

    }
}
