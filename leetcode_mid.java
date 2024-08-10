import java.util.*;
class leetcode_mid {
    public static void findMedianSortedArrays(int[] num1, int[] num2) {
  
        int a = num1.length;
        int b= num2.length;
        int[] c= new int[a+b];
        int n = c.length;

        for(int i=0 ; i<a ; i++){
            c[i] = num1[i];
        }

        for(int i=0 ; i<b ; i++){
            c[a+i] = num2[i];
        }
        
        for(int i=0 ; i<n ; i++){
            System.out.print(c[i]+" ");
        }
        System.out.println();
        
        // Arrays.sort(c) ;
        int si =0;
        int end = n-1 ;

        int mid = (si+end)/2;
        System.out.println("mid of the merge array at index " +c[mid]+ " and element is " +mid);
        
    }
    public static void main(String[] args){
        Solution s = new Solution();
        int[] num1 = {1,2,3};
        int[] num2 = {4,5,6};
        
        findMedianSortedArrays(num1,num2);
    }
}