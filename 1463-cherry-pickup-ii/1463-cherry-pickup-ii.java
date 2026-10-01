class Solution { 

//     public int Solve(int [][] grid , int r , int c1 , int c2 , Integer [][][] dp ){

//         int m = grid.length;
//         int n = grid[0].length;

//          int cheries =  grid[r][c1];
//         if (c1 != c2 ){
//             cheries +=  grid[r][c2];
//         } 
//         if (r == m-1 ) return cheries ;

// if (dp[r][c1][c2] != null ) return dp[r][c1][c2];
//         int max = 0 ;

//        for(int d1 = -1 ; d1 <= 1 ; d1++ ){
//         for (int d2 = -1 ; d2 <= 1 ; d2++){

//             int nc1 = c1 + d1;
//             int nc2 =  c2 + d2 ;

// if (nc1 < 0 || nc2 < 0 || nc1 >= n || nc2 >= n) continue ;

//             max = Math.max(max , Solve (grid , r+1 , nc1 , nc2 ,  dp));

        
//         }
//        }
//        return dp[r][c1][c2] =  max + cheries ;

//     }
    public int cherryPickup(int[][] grid) {


     //return Solve(grid , 0 , 0 , grid[0].length - 1);

     int m = grid.length ;
     int n = grid[0].length ;


    //  Integer [][][] dp = new Integer[m][n][n];

    //     return Solve(grid , 0 , 0 , n-1 , dp);

    int [][][] dp = new int [m][n][n];

    // Base case 



    for (int c1 = 0 ; c1 < n ; c1++){
        for (int c2 = 0; c2 < n ; c2++){

            if (c1 == c2 ){
                dp[m-1][c1][c2]= grid[m-1][c1];
            } else {
          dp[m-1][c1][c2] = grid[m-1][c1] + grid[m-1][c2];
            }
        }
    }

    // fill bottom up 
    for (int r = m-2 ; r>= 0 ; r--){
        for (int c1 = 0 ; c1 < n ; c1++){
            for (int c2 = 0 ;c2 < n ;c2++){

                int current =  grid[r][c1];
                if (c1 != c2 ){
                     current  += grid[r][c2];

                }
                int max =  0;

                // direction 
                for (int d1 = -1 ; d1 <= 1 ; d1++){
                    for(int d2 = -1 ; d2 <= 1 ; d2++){

                        int nc1 = c1 + d1;
                        int nc2 =  c2 + d2 ;

                        if (nc1 < 0 || nc2 < 0 || nc1 >= n || nc2 >= n){
                            continue ;
                        }
                            max =  Math.max (max ,  dp[r+1][nc1][nc2]);
                    }
                }
dp[r][c1][c2] = current + max ;

            }
        }
    }
    return dp[0][0][n-1];
    }
}