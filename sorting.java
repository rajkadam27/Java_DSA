import java.util.*;
public class sorting{

    public static void Bubble_sort(int arr[]){
        
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr.length-1-i ; j++){  //arr.length-1-i => array last element always found in every tern suppose 3rd tern then
                                                    //  -1 postion from array and value of i aslo substract ie in 3rd i=2 => n-1-2 = -3
                                                    //  i.e 3 element in array are found from last  2 1 [3 5 8] 
                                                    //  now comparison between 2 and 1 
                if(arr[j]>arr[j+1]){
                    //swap
                   int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            
        }    
    }

    public static void selection_sort(int arr[]){
        
        for(int i=0 ; i<arr.length-1 ; i++){  //n-1 bcz last element is not used for a comparison beacuse it a largest element from the array
            int minPos =i;

            //inner loop starting
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[minPos]>arr[j]){
                    
                    minPos=j;
                   
                }
            }
                    int temp = arr[minPos];
                    arr[minPos] = arr[i];
                    arr[i] = temp;
            
        }    
    }
    
    public static void insertion_sort(int arr[]){   
        
        for(int i=1 ; i<arr.length ; i++){  
            int curr =arr[i];
            int prev = i-1;

            while(prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }

            arr[prev+1] = curr;
        }    
    }

    
    public static void couting_sort(int arr[]){
        
        int largest = Integer.MIN_VALUE;

        for(int i=0 ; i<arr.length ; i++){  
            
            largest = Math.max(largest,arr[i]);
        }  

//frequency

        int count[] = new int[largest+1];   //we give on array by performing the operation on given array ... which is initallise by int count

        for(int i=0 ; i<arr.length ; i++){  
            
            count[arr[i]]++;
        }  

        int j=0;
        for(int i=0 ; i<count.length ; i++){   
            
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }  

    }

    public static void printarr(int arr[]){
        
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args []){
        
        int arr[] = {2,5,3,8,1};
        
        // Bubble_sort(arr);
        // selection_sort(arr);
        // insertion_sort(arr);
        couting_sort(arr);

        

        Arrays.sort(arr); // inbuilt sort
        // Arrays.sort(arr,0,3); //0-3 madhil element sort honar
        // Arrays.sort(arr,Collections.reverseOrder()); // for reverse of array
          
        printarr(arr);



    }
}


