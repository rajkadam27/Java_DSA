import java.util.*;

public class MergeSorting {
    public static void merge_sort(int arr[] , int start, int end){

        if(start >= end){
            return;
        }

        int mid = (start + end) / 2;
        merge_sort(arr, start, mid);
        merge_sort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    public static void merge(int arr[] , int start, int mid, int end){

        int temp[] = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= end){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while(i <= mid){
            temp[k++] = arr[i++];
        }

        while(j <= end){
            temp[k++] = arr[j++];
        }

        for(int l = 0; l < temp.length; l++){
            arr[start + l] = temp[l];
        }
    }

    public static void printarr(int arr[]){
        
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args []){
        
        int arr[] = {2,5,3,9,7,8,1};
        
        merge_sort(arr , 0 , arr.length - 1);
        printarr(arr);
        
    }
}