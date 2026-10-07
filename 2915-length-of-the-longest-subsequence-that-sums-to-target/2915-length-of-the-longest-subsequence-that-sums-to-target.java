class Solution {
    // public int Solve(List<Integer> nums, int target , int curr , int i , Integer [][] dp ){

    //    if (curr == target){
    //     return 0;
    //    } 
    //     if ( i >= nums.size() || curr > target )return -1 ;
    //     if (dp[i][curr] != null) return dp[i][curr];

    //     int skip = Solve(nums , target , curr , i+1 , dp);
    //     int take = -1 ;
    //       if (curr + nums.get(i) <= target){
    //     int res =   Solve(nums , target , curr + nums.get(i) , i+1 , dp);
    //     if (res != -1){
    //         take = 1 + res;
    //     }
    //       }
    //     return  dp[i][curr] = Math.max(skip , take );
    // }
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {

        int  [][] dp = new int [nums.size() + 1][target + 1];
        int n = nums.size();
    //  return Solve(nums , target, 0 , 0 , dp);  
    for(int i = 0 ; i <= n ; i++){
        Arrays.fill(dp[i] , -1);
        dp[i][0] = 0 ;
    }

for (int i = 1 ; i <= nums.size() ; i++){

    int num = nums.get(i-1);
    for(int j = 1 ; j <= target ; j++){

        int skip = dp[i-1][j];
        int take = -1 ;

        if(num <= j && dp[i - 1][j - num] != -1){
            take = 1 + dp[i-1][j -nums.get(i-1)];
        }
        dp[i][j] = Math.max(take , skip);
    }
}
return dp[nums.size()][target];
    }
}