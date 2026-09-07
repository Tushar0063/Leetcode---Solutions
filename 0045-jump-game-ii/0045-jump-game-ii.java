class Solution {

  // RECURSIVE 
//  public int Solve(int [] nums , int curr   ){
      
//        int n = nums.length;
//        if(curr >= n-1) return 0 ;


//        int j = Math.min(curr + nums[curr] ,  n-1);
//        int minJump = 10001;

//        for(int i = curr + 1 ;i<= j ;i++){

//        int jumpfromNext = Solve(nums , i);

//        if(jumpfromNext != 10001){
//         minJump = Math.min(minJump , jumpfromNext + 1 );
//        }
//        }
       
//        return minJump ;
//  }

//     public int jump(int[] nums) {
        

//         return Solve(nums , 0);
//     }

public int Solve(int [] nums ,int curr  ,int[] dp){

    if (curr >= nums.length-1) return 0;
    if(dp[curr] != -1) return dp[curr];

    int minJump = 10001;
    int j = Math.min(curr + nums[curr] , nums.length-1);

    for(int i = curr + 1 ; i <= j ;i++){

        int jumpfromNext = Solve(nums , i , dp);

        if(jumpfromNext != 10001){
            minJump = Math.min(minJump , jumpfromNext +1 );
            
        }
    }
    return dp[curr] = minJump;
}
 
 public int jump(int[] nums) {

    int n = nums.length;
    int [] dp = new int [n+1];
    Arrays.fill(dp,-1);

    return Solve(nums , 0 , dp);
 }

}