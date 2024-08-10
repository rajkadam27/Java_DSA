class Solution_leetcode_rob {
    
    public int[] rob(int[] nums, int rob) {
        
        for(int i = 0 ; i<nums.length ; i++){
            for(int j=i+1 ; j<nums.length ; j++){
                if(nums[i]+nums[j]==rob){
                    return new int[] {i,j};
                }

            }
        }
        throw new IllegalArgumentException("No two sum solution");

    }

    public static void main(String [] args){

        int nums[] = {1,2,3,1};
        int rob = 4;
        Solution_leetcode_rob solution = new Solution_leetcode_rob();
        int output[] = solution.rob(nums , rob);
        
        System.out.println("The index of the first number is at index " +output[0]+ " & " + output[1]);
        
    }
}

        