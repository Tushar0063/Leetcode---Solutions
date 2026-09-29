class Solution {

//     public int Solve(int[][] dungeon , int r , int c , int [][] dp){

//         int m = dungeon.length;
//         int n = dungeon[0].length;

//         if ( r > m-1 || c > n-1) return Integer.MAX_VALUE;
//         if (r == m-1 && c == n-1 ) return  Math.max(1, 1 - dungeon[r][c]);
//         if (dp[r][c] != -1 ) return dp[r][c];
        

//         int right =   Solve(dungeon , r , c+1 , dp);
//         int down =  Solve(dungeon , r+1 ,c , dp);

//         int next=Math.min(right , down );     
//   dp[r][c]  = Math.max(1,next  - dungeon[r][c])  ;
//   return dp[r][c];
 
//     }

// public int Solve(int [][] dungeon , int r, int c ){

//     int m = dungeon.length;
//     int n = dungeon[0].length;

//     if (r<0 || c<0 || r > m-1 || c > n-1) return Integer.MAX_VALUE;
//     if (r == m-1 && c == n-1) return Math.max(1 , 1 - dungeon[r][c]);

//     int down = Solve(dungeon , r+1 , c);
//     int right = Solve(dungeon , r , c+1);

//     int next =  Math.min(down , right );

//     return Math.max(1 ,  next - dungeon[r][c]);
// }


public int Solve(int [][] dungeon , int r , int c , int [][] dp){

    int m = dungeon.length;
    int n = dungeon[0].length;

    if (r<0 || c< 0 || r > m-1 || c > n-1) return Integer.MAX_VALUE;
    if (r == m-1 && c == n-1 ) return Math.max(1 , 1- dungeon[r][c]);
    if (dp[r][c] != -1 ) return dp[r][c];

    int right = Solve(dungeon , r ,c+1 , dp);
    int down = Solve(dungeon , r+1 , c , dp);

    int next = Math.min(right , down );
    dp[r][c] = Math.max(1 , next - dungeon[r][c]);
    return dp[r][c];
}
    public int calculateMinimumHP(int[][] dungeon) {

       

        int [][] dp = new int [dungeon.length][dungeon[0].length];
        for (int i = 0 ; i< dungeon.length ; i++){
            for (int j = 0 ; j < dungeon[0].length ; j++){
                dp[i][j] = -1 ;
            }
        }
        
        return Solve(dungeon , 0 , 0 , dp );
    }
}