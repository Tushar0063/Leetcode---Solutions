class Solution {

    public int Solve (int [][] grid , int r1, int r2 ,  int c1 , int c2 , int dp[][][][]){


         if (r1 < 0 || c1 < 0 || r1 > grid.length-1 || c1 > grid[0].length - 1 || c2 > grid[0].length - 1|| c2<0 || r2 < 0 || r2 > grid.length -1 || grid[r1][c1] == -1 || grid[r2][c2] == -1 ) return Integer.MIN_VALUE;

if (dp[r1][r2][c1][c2] != -1) return dp[r1][r2][c1][c2];
int q1 =  grid[r1][c1];
int q2 = grid[r2][c2];

        int cheries = 0 ;

 if (r1 == r2 && c1 == c2 ){
    cheries += grid[r1][c1];
    if (r1 == grid.length -1 && c1 == grid[0].length - 1){
        return dp[r1][r2][c1][c2] = grid[r1][c1] ;
    }
    grid[r1][c1] = 0 ;
 } else{
    cheries += grid[r1][c1] + grid[r2][c2];
    grid[r1][c1] = 0 ;
    grid[r2][c2] = 0 ;
 }
// RR
 int a = Solve(grid , r1  , r2 , c1 + 1 , c2 + 1 , dp );
 // RD
 int b = Solve(grid , r1 , r2 + 1 , c1 +1  , c2 , dp);
 // DR
 int c =  Solve(grid , r1 + 1 , r2 , c1 , c2 +1  , dp);
 // RR
 int d =  Solve(grid , r1 + 1 , r2 + 1, c1  , c2 , dp );

  grid[r1][c1] = q1 ;
    grid[r2][c2] = q2 ;
 
cheries += Math.max(Math.max(a,d) , Math.max(b,c));
return dp[r1][r2][c1][c2] =  cheries;
    }
    public int cherryPickup(int[][] grid) {
        
int ans = 0 ;
int [][][][] dp = new int [50][50][50][50];

for (int i = 0 ; i<50 ; i++){
    for (int j = 0 ; j<50 ; j++){
    for (int k = 0 ; k<50 ; k++){
    for (int l = 0 ; l<50 ; l++){
    dp[i][j][k][l] = -1;
}
}
}
}
       
         ans = Math.max(ans , Solve(grid , 0 ,0, 0 ,0 , dp)) ;
         return ans ;
    }
}