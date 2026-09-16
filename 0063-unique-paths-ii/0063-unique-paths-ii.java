class Solution {

    public int Solve(int [][] obstacleGrid , int r , int c , int [][] dp){
         
       
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        if (r >= m || c >= n) return 0;
         if (obstacleGrid[r][c] == 1 ) return 0 ; 
          if (r == m-1 && c == n-1) return 1 ;

          if(dp[r][c] != -1) return dp[r][c];

       int down  = Solve(obstacleGrid , r+1 , c ,dp);
       int right = Solve(obstacleGrid , r, c+1 ,dp);

       dp[r][c] = down + right ;
       return dp[r][c];

    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
      
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

          int [][] dp = new int [m+1][n+1];
          for (int i = 0 ; i<= m ;i++){
            for(int j = 0 ; j<= n ;j++){
                dp[i][j] = -1;
            }
          }
           
return Solve(obstacleGrid , 0 , 0 , dp);

        // return Solve(obstacleGrid , 0 , 0);
    }
}
