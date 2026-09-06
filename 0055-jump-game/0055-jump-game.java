class Solution {

    //RECURSUIVE 

// public boolean Solve(int curr , int [] nums){

//     if (curr == nums.length-1) return true;
//     if(curr >= nums.length) return true ;


// int j = Math.min(curr + nums[curr], nums.length - 1);

//     for(int i = curr + 1 ; i <= j ; i++){

//         if(Solve(i , nums)) return true;

//     }
//     return false;
// }

//     public boolean canJump(int[] nums) {

//         return Solve(0 , nums);
        
//     }

// MEMORISATION

public boolean Solve (int nums [] , int curr , Boolean  [] dp){
 
 if (curr >= nums.length-1) return true;
 if (dp[curr] != null) return dp[curr];

 int j = Math.min(curr + nums[curr] , nums.length - 1);

 for(int i = curr+1 ; i <= j ;i++){
    if(Solve(nums ,  i , dp)){
 dp[curr] = true;
 return true ;
    }
 }

 dp[curr] = false;
 return false;



}
public boolean canJump(int[] nums) {

 Boolean [] dp = new Boolean[nums.length];


 return Solve(nums , 0 ,dp);
}


}
