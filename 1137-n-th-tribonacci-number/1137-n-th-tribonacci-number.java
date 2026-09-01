class Solution {

    public int Solve(int n , int [] dp) {
 if (n == 0 || n== 1) return n ;
     if (n == 2 ) return 1 ;


    
    
            
     
     if(dp[n] != -1) return dp[n];

       dp[n] = Solve(n-3,dp) +  Solve(n-2 , dp) +  Solve(n-1 , dp);

     return dp[n];

    }
    public int tribonacci(int n) {
       


     
     int [] dp = new int [n+1];
          Arrays.fill(dp , -1);

      return Solve(n , dp);
      
    }
}