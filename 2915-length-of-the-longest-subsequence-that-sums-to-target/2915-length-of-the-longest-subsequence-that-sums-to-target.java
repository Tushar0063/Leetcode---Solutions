class Solution {
    public int Solve(List<Integer> nums, int target , int curr , int i , Integer [][] dp ){

       if (curr == target){
        return 0;
       } 
        if ( i >= nums.size() || curr > target )return -1 ;
        if (dp[i][curr] != null) return dp[i][curr];

        int skip = Solve(nums , target , curr , i+1 , dp);
        int take = -1 ;
          if (curr + nums.get(i) <= target){
        int res =   Solve(nums , target , curr + nums.get(i) , i+1 , dp);
        if (res != -1){
            take = 1 + res;
        }
          }
        return  dp[i][curr] = Math.max(skip , take );
    }
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {

        Integer [][] dp = new Integer [nums.size() + 1][target + 1];

      return Solve(nums , target, 0 , 0 , dp);  
    }
}