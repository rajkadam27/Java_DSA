
import java.util.*;

public class Heap_min{

    static class Heap{ // <-- Changed 'heap' to 'Heap' here

        ArrayList<Integer> arr = new ArrayList<Integer>();

        public void add(int data){
            arr.add(data);

            int x = arr.size()-1;  // child index
            int par = (x-1)/2; // parrent index

            while(arr.get(x) < arr.get(par)){
                //swap
                int temp = arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);

                // x = par ;
                // par  = (x-1)/2;
            }
        }

        public int peek(){
            return arr.get(0);
        }

        private void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int MinIdx = i;

            if(left < arr.size() && arr.get(MinIdx)>arr.get(left)){
                MinIdx = left;
            }

            if(right < arr.size() && arr.get(MinIdx)>arr.get(right)){
                MinIdx = right;
            }

            if(MinIdx!= i){
                int temp = arr.get(i);
                arr.set(i,arr.get(MinIdx));
                arr.set(MinIdx,temp);
                heapify(MinIdx);
            }

        }

        public int remove(){
            //getting first element
            int data = arr.get(0);

            // swap element last and first
            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            // delete last

            arr.remove(arr.size()-1);

            //heapify

            heapify(0);
            return data;

        }

        public boolean isEmpty(){
            return arr.size() == 0;
        }
    }

    public static void main(String args[]){

        Heap h  = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(2);

        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
}