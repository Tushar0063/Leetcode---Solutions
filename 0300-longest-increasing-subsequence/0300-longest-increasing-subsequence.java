class Solution {

    // curr , prev are the indices of the nums array.

    // public int Solve(int nums [] , int curr , int prev , int [][] dp){

    //     int n = nums.length;
    //     if (curr >= n) return 0;
    //     if (dp[curr][prev + 1] != -1) return dp[curr][prev + 1];

    //     int skip = Solve(nums , curr +1 , prev , dp);
    //     int take = 0 ;

    //     if (prev == -1 || nums[curr] > nums[prev]){

    //         take  = 1 + Solve(nums , curr + 1 , curr , dp);
    //     }

    //     return  dp[curr][prev+1] = Math.max(take , skip);
    // }

    public int lengthOfLIS(int[] nums) {

        //int n= nums.length  ;

        //  int [][] dp = new int [n+2][n+2];

        //  for (int i = 0 ; i < n+2 ; i++){
        //     for (int j = 0 ; j < n+2 ; j++){

        //         dp[i][j] = -1 ;
        //     }
        //  }

        //  return Solve(nums , 0  , -1 , dp);

        //     return Solve(nums , 0 , -1 );

        // TABULATION 

        // int n = nums.length;

        // int[] dp = new int[n + 1];
        // Arrays.fill(dp, 1);
        // int len = 1;

        // for (int i = 1; i < n; i++) {
        //     for (int j = i - 1; j >= 0; j--) {

        //         if (nums[i] > nums[j]) {

        //             dp[i] = Math.max(dp[i], 1 + dp[j]);
        //         }
        //     }

        //     len = Math.max(len, dp[i]);
        // }
        // return len;


     // PATIENCE SORTING 

     ArrayList<Integer> ans =  new ArrayList<>();
      
      for (int i = 0 ; i < nums.length ; i++){
     int low = 0 ;
     int high = ans.size() - 1 ;
     int Ca = nums[i] ;

     while( low <= high ){

   int mid  = low + (high - low )/2;

   if (ans.get(mid) >= Ca){
   high = mid - 1 ;
   } else{

   low = mid + 1  ;
   }
     }
     if (low == ans.size()){
        ans.add(Ca);
     } else{
        ans.set(low , Ca);
     }
      }
      return ans.size();
    }
}