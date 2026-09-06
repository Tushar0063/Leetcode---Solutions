class Solution {

    public int Solve(int [] nums , int i  ,int end ,  int [] dp){
      
      int n = nums.length;
        if (i > end) return 0;
        if(dp[i] != -1) return dp[i];


      int take =nums[i] +  Solve(nums,i+2 , end ,dp );
      int skip = Solve(nums , i+1 ,end ,dp );

      dp[i] = Math.max(take,skip);
      return dp[i];




    }
    public int rob(int[] nums) {
        
        int n = nums.length;
        int [] dp1 = new int [n];


        Arrays.fill(dp1,-1);
        
        if(n==1) return nums[0];

        int one = Solve(nums , 0 , n-2 ,dp1);

        int [] dp2 = new int [n];
         Arrays.fill(dp2,-1);
        int two= Solve(nums , 1 , n-1 , dp2);

        return Math.max(one , two);

         

        
    }
}