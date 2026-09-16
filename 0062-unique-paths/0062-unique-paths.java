class Solution {
    // public int Solve(int m , int n , int r , int c , int [][] dp){

    //       if (r == m-1 && c == n-1) return 1 ;
    //     if ( r > m || c> n) return 0;
      

    //  if(dp[r][c] != -1) return dp[r][c];

    //     int down = Solve(m , n ,r+1 , c , dp);
    //     int right = Solve(m , n , r , c+1 , dp);

    //     dp[r][c] = (down + right);

    //     return dp[r][c] ;
    // }
    public int uniquePaths(int m, int n) {

       // return Solve( m ,n , 0 , 0);

       int [][] dp = new int [m+1][n+1];
    
    //   for(int i = 0 ; i<= m ; i++){
    //     for(int j = 0 ; j <= n ;j++){
    //         dp[i][j] = -1;
    //     }
    //   }

    //    return Solve(m , n ,0 , 0 , dp);

    for(int i = 0 ; i<m ; i++){
        dp[i][n-1] = 1;
    }
    for (int j = 0 ; j < n ;j++){
        dp[m-1][j] = 1;
    }

    for(int i = m-2 ; i >= 0 ;i--){
    for(int j = n-2 ; j >= 0 ; j--){

           int down = dp[i+1][j];
           int right = dp[i][j+1];

           dp[i][j] = down + right ;
}
          }
    
    return dp[0][0];
    }
    }
