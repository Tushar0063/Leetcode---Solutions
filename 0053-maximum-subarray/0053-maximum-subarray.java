class Solution {
 
    public int maxSubArray(int[] nums) {
        
        int n = nums.length;
      int currentSum = 0;
      int MaxSum = Integer.MIN_VALUE;

      for(int i = 0 ;i < n ;i++){
        currentSum += nums[i];
      
      if (currentSum > MaxSum){
        MaxSum = currentSum;
      }
      if(currentSum < 0){
        currentSum = 0;
      }}

      return MaxSum;

    }
}