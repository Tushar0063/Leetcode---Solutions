class Solution {

    public int Solve(int [][]grid , int r , int c , Integer [][] dp ){
        
        int m = grid.length;
        int n = grid[0].length;
   
   int ans  = 0 ;

         if (c == n-1 ) return 0;
         if (dp[r][c] != null) return dp[r][c];

// upright 
         if( r-1 >= 0 && grid[r-1][c+1] > grid[r][c] ){
     ans = Math.max(ans , 1 + Solve(grid , r-1 ,c+1 , dp));
         }
 
      // right 
      if (grid[r][c+1] > grid[r][c]){
        ans = Math.max(ans , 1 + Solve(grid , r , c+1, dp));
      }

      // downright 
      if ( r+1 < m && grid[r+1][c+1] > grid[r][c]){
        ans = Math.max(ans , 1 + Solve(grid , r+1  , c+1 , dp));
      }

      dp[r][c] = ans ;

      return ans ;

    }
    public int maxMoves(int[][] grid) {
        

        int m = grid.length;
        int n = grid[0].length;

        Integer [][] dp = new Integer [m][n];

        int ans = 0 ;
        for(int i = 0 ; i < m ; i++){
            ans =Math.max(ans, Solve(grid , i , 0 , dp));
        }

        return ans ;
    }
}