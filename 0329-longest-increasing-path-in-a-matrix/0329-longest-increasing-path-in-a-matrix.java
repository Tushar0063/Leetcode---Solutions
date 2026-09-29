class Solution {

    public int Solve(int [][] matrix , int r , int c , int prevVal , int [][] dp){

        int m = matrix.length;
        int n = matrix[0].length;
       

        if (r<0 || c < 0 || r >= m || c >= n || matrix[r][c] <= prevVal) return 0;
        if (dp[r][c] != -1 ) return dp[r][c];

        int current = matrix[r][c];

        int right = Solve(matrix , r , c+1 , current , dp);
        int left = Solve(matrix ,  r ,c -1, current , dp);
        int up = Solve(matrix , r-1 , c, current , dp);
        int down = Solve(matrix , r+1  ,c , current , dp);


       
return  dp[r][c] = 1 + Math.max(Math.max(right , left ) ,  Math.max(up,down));
    }
    public int longestIncreasingPath(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        int maxLen = 0 ;

int [][] dp = new int [m][n];

        for(int i = 0 ; i< m ; i++){
            for(int j = 0 ; j< n ; j++){
                dp[i][j] = -1;
            }
        }

        for (int i = 0 ; i < m ;i++){
            for (int j = 0 ; j < n ; j++){

                maxLen = Math.max(maxLen ,  Solve(matrix  , i , j , Integer.MIN_VALUE , dp));
            }
        }
        return maxLen;
        
    }
}