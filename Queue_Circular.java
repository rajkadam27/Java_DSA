import java.util.ArrayList;
public class Queue_Circular{

    static class Queue{

        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isfull(){
            return (rear+1)%size == front;
        }

        //add 

        public static void add(int data){
            if(isfull()){
                System.out.println("Queue is full");
                return;
            }
            // add first element

            if(front == -1){
                front = 0;
            }

        rear = (rear+1)%size;
        arr[rear] = data;
        }

        //remove

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            int result = arr[front];

            // delete last element 
            if(rear == front){
                rear = front = -1;
            }
            else{
                 front = (front+1)%size;

            }
            return result;

        }

        // peek

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[front];
        }
    }


    public static void main(String args[]){

        Queue s = new Queue(3);
        s.add(1);
        s.add(2);
        s.add(3);

        System.out.println(s.remove());
        s.add(4);

        System.out.println(s.remove());
        s.add(5);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.remove();
        }
        
    }

}
