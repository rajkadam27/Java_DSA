import java.util.Stack;

class Stack_Problem2 {

    public static void maxAreaHistogram(int arr[]) {

        int maxArea = 0;
        int nextRightSmaller[] = new int[arr.length];
        int nextLeftSmaller[] = new int[arr.length];

        // next smaller right 

        Stack<Integer> s = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {

            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nextRightSmaller[i] = arr.length;
            } else {
                nextRightSmaller[i] = s.peek();
            }
            s.push(i);
        }

        // next smaller left 

        s = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nextLeftSmaller[i] = -1;
            } else {
                nextLeftSmaller[i] = s.peek();
            }
            s.push(i);
        }

        // current area 

        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nextRightSmaller[i] - nextLeftSmaller[i] - 1;
            int currentArea = height * width;
            maxArea = Math.max(currentArea, maxArea);
        }

        System.out.println("maximum area in histogram is = " + maxArea);

    }

    public static void main(String args[]) {

    int arr[]  = {2,1,5,6,2,3};
    maxAreaHistogram(arr);

    }


}