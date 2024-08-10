import java.util.*;

public class Heap_Sort{

    public static void heapify(int arr[] , int i, int size){
        int left = 2*i+1;
        int right = 2*i+2;
        int MaxIdx = i;

        if(left < size && arr[left] > arr[MaxIdx]){
            MaxIdx = left;
        }

        if(right < size && arr[right] > arr[MaxIdx]){
            MaxIdx = right;
        }

        if(MaxIdx!= i){
            int temp  = arr[i];
            arr[i] = arr[MaxIdx];
            arr[MaxIdx] = temp;

            heapify(arr , MaxIdx , size);
        }
    }

    public static void heapSort(int arr[]){
        // step 1 - build a max heap

        int n = arr.length;
        for(int i=(n/2)-1; i>0; i--){
            heapify(arr,i,n);
        }

        // step2 - push large element at last 

        for(int i = n-1 ; i>=0; i--){
             // swap 1st element to last
            int temp  = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;  

            heapify(arr,0,n);
        }
    }


    public static void main(String args[]){

    int arr[] = {1,2,4,5,3};
    heapSort(arr);

    for(int i=0; i<arr.length; i++){
        System.out.println(arr[i]+" ");
    }
    System.out.println();

    }
}