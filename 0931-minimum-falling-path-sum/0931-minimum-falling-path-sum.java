class Solution {

    public int Solve(int [][]matrix ,  int r , int c , Integer [][] dp ){

   
        if (c<0 || c >= matrix[0].length ) return Integer.MAX_VALUE;
             if (r == matrix.length -1 ) return matrix[r][c];
          
          if(dp[r][c] != null ) return dp[r][c];
         
        int down = Solve(matrix , r+1 ,c  , dp);
        int leftdia = Solve(matrix , r+1 , c-1 , dp);
        int rightdia = Solve(matrix , r+1 , c+1 , dp);

      dp[r][c] =  Math.min(down ,Math.min( leftdia , rightdia)) + matrix[r][c];
        return dp[r][c] ;
    }
    public int minFallingPathSum(int[][] matrix) {
        

        int sc = 0;
        int ans = Integer.MAX_VALUE ;
         Integer [][] dp = new Integer [matrix.length][matrix[0].length];
         for(int i = 0 ; i< matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                dp[i][j] = null;
            }
         }

        for(int k = 0 ; k< matrix[0].length ; k++){
           sc = k;
           ans = Math.min(ans , Solve(matrix , 0, sc , dp));
        }
        return ans ;
    }
}