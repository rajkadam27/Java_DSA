import java.util.*;

public class QuickSorting {
    public static void quick_sort(int arr[] , int start, int end){

        if(start >= end){
            return;
        }

        int pvIdx = partition(arr, start, end);
        quick_sort(arr, start, pvIdx-1);
        quick_sort(arr,pvIdx+1,end);
        // merge(arr, start, mid, end);
    }

    public static int partition(int arr[] , int start,int end){

        int povit = arr[end];
        int i  = start-1; // to make palces for the elements which is smallert than the povit element

        for(int j =start ; j<end ; j++){
            if(arr[j] <= povit){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            
        }
        i++;
        int temp = povit;
        arr[end] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void printarr(int arr[]){
        
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args []){
        
        int arr[] = {2,5,3,9,7,8,1};
        
        quick_sort(arr , 0 , arr.length - 1);
        printarr(arr);
        
    }
}