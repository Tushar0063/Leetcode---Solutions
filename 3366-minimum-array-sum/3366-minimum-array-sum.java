class Solution {

    public int Solve(int [] nums , int k , int op1 , int op2 , int i , int [][][] dp){

        int n = nums.length;
        
        if (i >= n ) return 0  ;
        if (dp[i][op1][op2] != -1 ) return dp[i][op1][op2];

// No operation 
        int take =nums[i] +  Solve(nums  , k , op1 , op2 , i+1 , dp);

 // op1 
 int take1 = Integer.MAX_VALUE ;
 if (op1 > 0){
     take1 = (nums[i] + 1 )/2 + Solve(nums , k , op1 -1 , op2 , i+1 , dp);
 }

 // op2 
 int take2 = Integer.MAX_VALUE ; 
 if (op2 > 0 && nums[i] >= k ){
     
     take2 =  (nums[i] - k ) + Solve(nums , k ,op1 , op2 -1 , i+1 , dp);
 }

 // op1 then op2 
int take3 = Integer.MAX_VALUE ; 

if (op1 > 0 ){
   // take3 = (nums[i] + 1)/2 + Solve(nums , k , op1 -1 , op2 , i+1);

    if (op2 > 0 && (nums[i] + 1)/2 >= k){
        take3 =  ((nums[i] + 1)/2 - k) +  Solve(nums ,  k , op1 - 1 , op2 -1 , i+1 , dp);
    }
}

// op2 then op1 

int take4 = Integer.MAX_VALUE ;
if (op2 > 0 && nums[i] >= k){

      if (op1 > 0 ){
    take4 = ((nums[i] - k) +1)/2 + Solve(nums , k , op1 - 1, op2 -1 , i+1 ,dp);
}}

return  dp[i][op1][op2] =   Math.min(take , Math.min(take1 , Math.min(take2 , Math.min(take3,take4))));

    }
    public int minArraySum(int[] nums, int k, int op1, int op2) {
        


        int [][][] dp = new int [nums.length + 1 ][op1+1][op2+1];
 for (int i = 0 ; i<= nums.length ; i++){
    for (int j = 0 ; j <= op1 ; j++){
        for(int m = 0 ; m <= op2 ; m++){
            dp[i][j][m] = -1;
        }
    }
 }


        return Solve(nums ,  k ,op1 ,op2 , 0 , dp);
    }
}