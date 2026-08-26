class Solution {

public boolean   Solve(char [][] board , String word ,int r ,int c ,int i ){

     int n = board.length;
     int m = board[0].length;

      if(i == word.length()) return true;

     if(r>= n || c>= m || r <0 || c < 0 ) return false;

    

      
     if( board[r][c] != word.charAt(i)) return false;

     char t  = board[r][c];
          board[r][c] = '1';


     boolean found =( Solve(board , word , r+1 ,c , i+1) || Solve(board , word ,r-1,c,i+1 ) || Solve
     (board , word , r , c+1 , i+1 ) || Solve(board , word , r , c-1 , i+1));

     board[r][c] = t;
     return found; 

}

    public boolean exist(char[][] board, String word) {

     int n = board.length;
     int m = board[0].length;

     for(int i = 0 ; i< n ;i++){
        for(int j = 0 ; j< m ;j++){
            if(board[i][j] == word.charAt(0)){
                if(Solve(board , word , i, j, 0)) {
                    return true ;
                }
            }
        }
     }
     return false;

        
    }
}