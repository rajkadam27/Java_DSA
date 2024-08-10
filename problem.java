class Solution { 
    public void divide(int dividend, int divisor) { 
        if(divisor == 0){ 
            throw new IllegalArgumentException("Divisor cannot be 0"); 
            } 
            int ans = dividend/divisor; System.out.println(ans); 

            } 
            public static void main(String[] args) {
                 Solution s=new Solution(); s.divide(10, 0); 
                 } 
                 }

                 class Solution {
    public int maxArea(int[] height) {
        int ans = 0, i = 0, j = height.length-1, res = 0;
        while (i < j) {
            if (height[i] <= height[j]) {
                res = height[i] * (j - i);
                i++;
            } else {
                res = height[j] * (j - i);
                j--;
            }
            if (res > ans) ans = res;
        }
        return ans;
    }
    public static void main(String [] args){
        Solution s = new Solution();
        System.out.println(maxArea(1,8,6,2,5,4,8,3,7))

    }
}