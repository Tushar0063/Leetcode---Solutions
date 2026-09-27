class Solution {

    public int Solve(int [][] grid , int r , int c , Integer [][] dp ){

      int m = grid.length;
      int n = grid[0].length;
      int min = Integer.MAX_VALUE;

      if (r < 0 || c < 0 || r > m || c > n) return Integer.MAX_VALUE;
      if (r == m-1)  return grid[r][c];

      if (dp[r][c] != null) return dp[r][c];


for (int next = 0 ; next < n ;next++){

if (next == c)  continue ;
       
     min = Math.min(min , grid[r][c] + Solve(grid , r+1 ,next , dp ));
     dp[r][c] = min ;
     
}
return dp[r][c] ;

    }
    public int minFallingPathSum(int[][] grid) {

     int m = grid[0].length;
     int min = Integer.MAX_VALUE;

     Integer [][] dp = new Integer[grid.length][m];
     for(int j = 0 ; j < grid.length ; j++){
        for (int k = 0 ; k< m ; k++){
            dp[j][k] = null;
        }
     }

     for (int i = 0 ; i< m ;i++ ){
        min = Math.min(min , Solve(grid , 0 , i , dp));
     }   
     return min ;
    }
}