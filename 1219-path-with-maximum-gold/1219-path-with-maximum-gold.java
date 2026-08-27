class Solution {

public int Solve(int [][] grid , int r , int c , boolean [][] vis  ){

    int m = grid.length;
    int n = grid[0].length;


    if(r<0 || c<0 || r >= m || c >= n) return 0 ;
    if (grid[r][c] == 0) return 0;
    if(vis[r][c] == true ) return 0;
 
  
   vis[r][c] = true ;

   int down = Solve(grid , r+1 ,c ,vis);
   int up = Solve(grid , r-1 ,c ,vis);
   int right = Solve(grid , r ,c+1 ,vis);
   int left = Solve(grid , r ,c-1 ,vis);

   vis[r][c]  = false;

   return grid[r][c] + Math.max(Math.max(left,right) , Math.max(up , down)) ;


}
    public int getMaximumGold(int[][] grid) {

int ans = 0 ;

boolean [][] visit = new boolean[grid.length][grid[0].length];

for(int i = 0 ; i< grid.length ; i++){
    for(int j = 0 ; j<grid[0].length ; j++){
        if(grid[i][j] != 0) {
           ans  = Math.max(ans , Solve(grid , i , j ,visit));
        }
    }
}

return ans ;
    }
}