class Solution {
    public int minStartValue(int[] nums) {
        

        int n = nums.length ;

        int currSum = 0 ;
        int minSum = 0 ;

        for (int i = 0 ;i < n ; i++){
            currSum += nums[i];
            minSum = Math.min(minSum , currSum);
        }

        return 1 - minSum;
    }
}