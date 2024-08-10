class Solution_leetcode {
    
    public int[] twoSum(int[] nums, int target) {
        
        for(int i = 0 ; i<nums.length ; i++){
            for(int j=i+1 ; j<nums.length ; j++){

                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }

            }
        }
        throw new IllegalArgumentException("No two sum solution");

    }

    public static void main(String [] args){

        int nums[] = {1,2,7};
        int target = 9;
        Solution_leetcode solution = new Solution_leetcode();
        int output[] = solution.twoSum(nums , target);
        
        System.out.println("The index of the first number is " +output[0]);
        System.out.println("The index of the second number is "+output[1]);
    }
}

        