class Solution {

    public int Solve(int [][]  grid , int[][] moveCost , int r , int c , int [][]dp ){

        int m = grid.length;
        int n = grid[0].length;

        int min =  Integer.MAX_VALUE ;
            

            if ( r == m-1 ) return grid[r][c];
            if(dp[r][c] != -1) return dp[r][c];
           
        
         for (int nextCol = 0 ; nextCol < n ; nextCol++){
             
             int cost  = grid[r][c] + moveCost[grid[r][c]][nextCol] +  Solve (grid , moveCost , r+1 ,nextCol , dp) ;
            min = Math.min(cost , min);
            dp[r][c] = min ;
         }

return dp[r][c]  ;

    }
    public int minPathCost(int[][] grid, int[][] moveCost) {
        
        int sc = 0 ;
        int ans = Integer.MAX_VALUE;

        int [][] dp = new int [grid.length][grid[0].length];

        for(int i = 0 ; i < grid.length ; i++){
            for (int j = 0 ; j< grid[0].length ; j++){
                dp[i][j] = -1 ;
            }
        }
        for (int i = 0 ; i < grid[0].length ; i++){
            
            sc =  i ;
            ans =  Math.min(Solve(grid,moveCost , 0 , sc , dp) , ans );

          }
        return ans ;
    }
}