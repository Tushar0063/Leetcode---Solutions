class Solution {
    public int Solve(int m , int n , int r , int c , int [][] dp){


        // if(dp[r][c] != -1) return dp[r][c];



          if (r == m-1 && c == n-1) return 1 ;
        if ( r > m || c> n) return 0;
      

     if(dp[r][c] != -1) return dp[r][c];

        int down = Solve(m , n ,r+1 , c , dp);
        int right = Solve(m , n , r , c+1 , dp);

        dp[r][c] = (down + right);

        return dp[r][c] ;
    }
    public int uniquePaths(int m, int n) {

       // return Solve( m ,n , 0 , 0);

       int [][] dp = new int [m+1][n+1];
    
      for(int i = 0 ; i<= m ; i++){
        for(int j = 0 ; j <= n ;j++){
            dp[i][j] = -1;
        }
      }

       return Solve(m , n ,0 , 0 , dp);

    }
}