class Solution {

    public int Solve (int m , int n , int maxMove , int startRow , int startColumn , int dp[][][] ){
          
          int mod = 1000000007;

          if ( startRow < 0 || startColumn < 0 || startRow >=m || startColumn >= n) return 1 ;
           if (maxMove == 0) return 0;
          if (dp[startRow][startColumn][maxMove] != -1) return dp[startRow][startColumn][maxMove];
              
                if (maxMove == 0) return 0;
                
          long right = Solve(m , n ,maxMove -1, startRow , startColumn +1 ,dp );
          long down = Solve(m , n ,maxMove -1 , startRow + 1 , startColumn , dp);
          long left = Solve(m , n ,maxMove -1, startRow , startColumn - 1 , dp);
          long up = Solve(m , n ,maxMove -1 , startRow -1, startColumn  ,dp);

          dp[startRow][startColumn][maxMove] = (int)((right + down + left + up ) % mod) ;
         return dp[startRow][startColumn][maxMove];
    }

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        
        int dp [][][] = new int [m][n][maxMove + 1];
        for (int i = 0 ; i< m ;i++){
            for (int j = 0 ; j < n ; j++){
                for (int k = 0 ; k <= maxMove ; k++){
                    dp[i][j][k] = -1;
                }
            }
        }

        return Solve(m , n ,maxMove , startRow , startColumn ,dp );
    }
}