class Solution { 

    public int Solve(int [][] grid , int r , int c1 , int c2 , Integer [][][] dp ){

        int m = grid.length;
        int n = grid[0].length;

         int cheries =  grid[r][c1];
        if (c1 != c2 ){
            cheries +=  grid[r][c2];
        } 
        if (r == m-1 ) return cheries ;

if (dp[r][c1][c2] != null ) return dp[r][c1][c2];
        int max = 0 ;

       for(int d1 = -1 ; d1 <= 1 ; d1++ ){
        for (int d2 = -1 ; d2 <= 1 ; d2++){

            int nc1 = c1 + d1;
            int nc2 =  c2 + d2 ;

if (nc1 < 0 || nc2 < 0 || nc1 >= n || nc2 >= n) continue ;

            max = Math.max(max , Solve (grid , r+1 , nc1 , nc2 ,  dp));

        
        }
       }
       return dp[r][c1][c2] =  max + cheries ;

    }
    public int cherryPickup(int[][] grid) {


     //return Solve(grid , 0 , 0 , grid[0].length - 1);

     int m = grid.length ;
     int n = grid[0].length ;


     Integer [][][] dp = new Integer[m][n][n];

        return Solve(grid , 0 , 0 , n-1 , dp);
    }
}