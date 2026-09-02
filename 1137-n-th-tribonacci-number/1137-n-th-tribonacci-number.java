class Solution {

//     public int Solve(int n , int [] dp) {
//  if (n == 0 || n== 1) return n ;
//      if (n == 2 ) return 1 ;


    
    
            
     
//      if(dp[n] != -1) return dp[n];

//        dp[n] = Solve(n-3,dp) +  Solve(n-2 , dp) +  Solve(n-1 , dp);

//      return dp[n];

//     }
//     public int tribonacci(int n) {
       


     
//      int [] dp = new int [n+1];
//           Arrays.fill(dp , -1);

//       return Solve(n , dp);
      
//     }


 public int tribonacci(int n) {

    if(n==0) return 0;
    if(n==1) return 1;

    int [] dp = new int[n+1];
    dp[0] = 0 ;
    dp[1] = 1;
    dp[2] = 1;

    for(int i = 3 ; i<= n ;i++){

        dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
    }

return dp[n];
 }

}