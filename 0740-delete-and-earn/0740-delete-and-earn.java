class Solution {

      HashMap<Integer,Integer> map = new HashMap<>();

// public int Solve(int curr , int max){


//     if(curr > max ) return 0;


//     int freq = map.getOrDefault(curr,0);
//     int take = curr * freq + Solve(curr+2 , max);
//     int skip  = Solve(curr+1,max);

//     return Math.max(take,skip);
// }
   
//     public int deleteAndEarn(int[] nums) {
        
        
//         int max = 0 ;
       
//         for (int i : nums) {

//             map.put(i, map.getOrDefault(i, 0) + 1);
//             max = Math.max(max , i);
//         }
        
//    return Solve(0,max);

public int Solve(int curr , int max,int [] dp){

    if(curr > max) return 0;
    if(dp[curr] != -1) return dp[curr];

    int freq = map.getOrDefault(curr,0);
    int take = freq*curr + Solve(curr+2 , max , dp);
    int skip = Solve(curr+1,max,dp);

    dp[curr] = Math.max(take , skip);
    return dp[curr];


    }
   public int deleteAndEarn(int[] nums) {

    int max = 0;

    for(int i : nums){
        map.put(i , map.getOrDefault(i,0) + 1);
        max = Math.max(max,i);
    }
    int dp[] = new int [max+2];
Arrays.fill(dp,-1);
    return Solve(0,max,dp);
   }

}