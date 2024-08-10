 class problem1 {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i : nums) {
            result ^= i;
        }
        return result;
    }

//     int singleNumber(int[] nums) {
//     int result = 0;
//     for (int i = 0; i < nums.length; i++) {
//         result ^= nums[i];
//     }
//     return result;
// }
    public static void main(String[] args) {
        problem1 p = new problem1();
        int[] num = {2,2,1};
        System.out.println(p.singleNumber(num));
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

        public static void printarr(int arr[]){
        
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args []){
        
        problem1 p = new problem1();
        int arr[] = {2,5,3,8,1};
        insertion_sort(arr);
        printarr(arr);
    } 

 }

    
public class Solution {
    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {-1,-100,3,99};
        int k = 3;
        rotate(nums, k);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}