class Solution {

    public int Solve(int [][]grid , int r , int c ,boolean [][] visit , int cells ){

        int m = grid.length;
        int n = grid[0].length;  



        if(r<0 || c < 0 || r >= m || c >= n) return 0;
         if(grid[r][c] == -1) return 0;
         if(visit[r][c] == true) return 0;
        if(grid[r][c] == 2) {
            if(cells == 1) return 1;
            return 0;
        }
     
           visit[r][c] = true ;
        

     int down =    Solve(grid , r+1, c, visit , cells-1);
    int up =     Solve(grid , r-1 , c ,  visit , cells-1);
     int right =    Solve(grid , r ,c+1 ,  visit , cells-1);
      int left =  Solve(grid , r ,c-1 ,  visit , cells-1 );

        visit[r][c] = false;

         return (down + up + right + left) ;
      
    }
    public int uniquePathsIII(int[][] grid) {
        
        int totalSteps =  0 ;
        int sr = 0;
        int sc = 0 ;

        for(int i = 0 ; i < grid.length ;i++){
            for(int j = 0 ; j < grid[0].length ; j++){
                if(grid[i][j] == -1) continue;
                    totalSteps += 1;
                if(grid[i][j] == 1){
                    sr = i ;
                    sc = j;
                }
            }
        }

        boolean [][] vis = new boolean[grid.length][grid[0].length];
         
       
        return  Solve(grid , sr , sc , vis , totalSteps );
    }
}