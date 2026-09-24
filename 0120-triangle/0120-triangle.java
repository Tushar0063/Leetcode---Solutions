class Solution {

    public int Solve(List<List<Integer>> triangle ,  int r , int c ,Integer [][]dp  ){
        
        if (triangle.size() - 1 == r) return triangle.get(r).get(c);
        if(dp[r][c] != null) return dp[r][c];

        int down = Solve(triangle ,  r+1 , c , dp);
        int right  = Solve(triangle  ,r+1 , c+1 , dp);
 
       dp[r][c] =  triangle.get(r).get(c) + Math.min(down , right );

       return dp[r][c];
        
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        
       // return Solve(triangle , 0 , 0);
       int m = triangle.size();
       

       Integer [][] dp =  new Integer[m+1][m+1];
       

       for(int i = 0 ; i < m ; i++){
        for(int j = 0 ; j<m ; j++){
            dp[i][j] = null;
        }
       }
  return Solve(triangle,0,0 , dp);


    }
}