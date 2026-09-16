class Solution {

//  public int Solve(int [][]grid , int r, int c ){

//     int m = grid.length;
//     int n = grid[0].length;

//      if(r == m-1 && c == n-1 ) return grid[r][c];

//     if (r >= m || c >= n) return Integer.MAX_VALUE;
     
//     int down =  Solve(grid  , r+1 , c);
//     int right =  Solve(grid ,  r , c+1);

//     return  grid[r][c] + Math.min(down,right);
     

     // memorisation 
//     if (r == m-1 && c == n-1) return grid[r][c];
//     if (r >= m || c >= n) return Integer.MAX_VALUE;

//     if (dp[r][c] != -1)  return dp[r][c];

//     int right  = Solve(grid ,  r , c+1 , dp);
//     int down = Solve(grid , r+1 ,c , dp);

//  dp[r][c] = grid[r][c] + Math.min(right , down);
//  return dp[r][c];

 //}
    public int minPathSum(int[][] grid) {
        
       /// return Solve(grid ,  0 ,0 );

     int [][] dp = new int [grid.length+1][grid[0].length + 1];

//      for (int i = 0 ; i<= grid.length ; i++){
//         for (int j = 0 ;j <= grid[0].length ; j++){
//             dp[i][j] =  -1 ;
//         }
//      }
//   return Solve(grid , 0 , 0 , dp);
int m = grid.length;
   int n = grid[0].length;

dp[m-1][n-1] = grid[m-1][n-1];

for(int i = m- 2 ; i >= 0 ; i--){
    dp[i][n-1] = grid[i][n-1] + dp[i+1][n-1];
}
for(int j = n-2 ; j >= 0 ; j--){
    dp[m-1][j] =grid[m-1][j] + dp[m-1][j+1];
}

for (int i = m-2 ; i>= 0 ;i--){
    for(int j = n-2 ; j>= 0 ; j--){

        dp[i][j] = grid[i][j] + Math.min(dp[i+1][j] , dp[i][j+1]);
    }
}
return dp[0][0];

    }}
