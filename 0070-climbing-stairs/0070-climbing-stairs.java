class Solution {

    // public int number(int s , int n , int [] dp){
        
    //       if (s == n) return 1;
    //    if (s > n ) return 0 ;

    //    if(dp[s] != -1) return dp[s];

    //    dp[s] =  number(s+1,n , dp) +  number(s+2 , n , dp);

    //    return dp[s];
    // }


    // public int climbStairs(int n) {
         

    //      int [] dp = new int [n+1];
    //      Arrays.fill(dp , -1);
    //    return number(0,n, dp);

    // }
public int climbStairs(int n) {

   if( n <= 2) return n ;

    int dp[] = new int [n+1];

    

    dp[n-1] = 1;
    dp[n-2] = 2;

  

    for(int i =n-3 ; i>=0  ; i--){
        dp[i] = dp[i+1] + dp[i+2];
    }

return dp[0];
    
}
}