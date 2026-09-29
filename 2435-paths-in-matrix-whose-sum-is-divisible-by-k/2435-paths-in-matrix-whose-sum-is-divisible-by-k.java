class Solution {

    public int Solve(int [][] grid , int k , int r , int c ,int currentRem ,Integer [][][] dp){

        int m = grid.length ;
        int n = grid[0].length ;
  
   if ( r >= m || c >= n  ) return 0 ;
int newRem = (currentRem + grid[r][c]) % k ;

   if (r == m-1 && c == n-1 ) {
    if (newRem == 0){
        return 1 ;
    }else{
    return 0 ;
   }  }
   if (dp[r][c][currentRem] != null ) return dp[r][c][currentRem];


     
       int mod = 1000000007;

        int right = Solve(grid , k , r , c+1 , newRem,dp);
        int down  = Solve(grid , k , r+1 ,  c , newRem,dp);
       

        return dp[r][c][currentRem] = (right + down) % mod ;


    }
    public int numberOfPaths(int[][] grid, int k) {

           int m = grid.length ;
        int n = grid[0].length ;

Integer [][][] dp = new Integer [m][n][k];

// for (int i = 0 ; i< m ; i++){
//     for (int j = 0 ; j< n ; j++){
//     for(int l = 0  ; l< k-1 ; l++){
//         dp[i][j][l] = null;
//     }
// }}
     return Solve(grid , k ,  0 , 0 , 0,dp);   
    }
}