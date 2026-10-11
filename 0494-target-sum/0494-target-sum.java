class Solution {

    public int Solve(int [] nums , int target , int curr , int i){

        int n = nums.length ;
        if (i > n ) return 0 ;
        if (i == n){
        if (curr == target ){
            return 1 ;
        } else{
            return 0 ;
        }}



       
      
      int take = Solve(nums , target ,nums[i] + curr  , i+1);
    
        int skip = Solve(nums , target , curr - nums[i] , i+1);

        return (skip + take );
    }
    public int findTargetSumWays(int[] nums, int target) {

return Solve(nums , target , 0 , 0);

    }
}