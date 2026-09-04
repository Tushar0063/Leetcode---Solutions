class Solution {

    // recursion 

    // public int Solve(int [] nums , int i ){

    //     int n = nums.length;
    //     if (i >= n) return 0;

    //     int take = nums[i] + Solve(nums , i+2);
    //     int skip = Solve(nums, i+1);

    //     return Math.max(take , skip) ;

    // }
    // public int rob(int[] nums) {


    //     return Solve(nums , 0);
        
    // }

    // memorisation 


//     public int Solve(int [] nums ,  int i , int [] dp){
           
//            if ( i >= nums.length) return 0 ;

//            if(dp[i] != -1) return dp[i];

//            int one = nums[i] + Solve(nums , i+2 ,dp);
//            int two = Solve(nums , i+1 , dp);

//            return dp[i] = Math.max(one , two);
//     }

//   public int rob(int[] nums) {

//     int n = nums.length;
//     int [] dp = new int[n+1];

//     Arrays.fill(dp , -1);

//     return Solve(nums , 0 ,  dp);

// }

// Tabulation

public int Solve(int [] nums ,  int [] dp){

    int n = nums.length;
   dp[n] = 0; 

   for(int i = n-1 ; i>=0 ; i--){

    dp[i] = Math.max( nums[i] + dp[i+2] , dp[i+1] );
    
   }
return dp[0];
}

 public int rob(int[] nums) {

int dp[]  = new int [nums.length  + 2];

return Solve(nums , dp);


}}