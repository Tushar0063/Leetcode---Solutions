/*
class Solution {

//     public int Solve(String [] strs , int m ,int  n , int i , int [][][] dp ){

//           int l = strs.length;
//           if ( i >= l ) return 0 ;
       
//        if (dp[i][m][n]  != -1 ) return dp[i][m][n];

//         String temp = strs[i];

// int zeros = 0 ;
// int ones = 0 ;

// for(int j = 0 ; j < temp.length() ; j++){
// if (temp.charAt(j) == '0'  ){
//         zeros++;

// } else{
//     ones++;
// }
//         }

//         int skip = Solve(strs , m , n , i+1 , dp);

//          int take = 0 ;

//         if (zeros <= m && ones <= n  ){
//            take = 1 + Solve(strs ,  m - zeros , n- ones , i+1 , dp );
//         }

//         return dp[i][m][n] =   Math.max(take ,  skip);
//     }

    public int findMaxForm(String[] strs, int m, int n) {
        
        int l = strs.length;

        int [][][]  dp = new int [l+1][m+1][n+1];

//         for (int i =0 ; i <= l ; i++){
//             for(int j = 0 ; j <= m ; j++){
//                 for (int k = 0 ; k <= n ; k++){
//                     dp[i][j][k] = -1 ;
//                 }
//             }
//         }


for (int i = 0 ;i <= m ;i++){
    for (int j = 0 ; j <= n ;j++){
        dp[n][i][j] = 0 ;
    }
}

// return Solve(strs , m, n , 0 , dp );


       for(int i = 0 ; i < l ; i++){    
        String temp = strs[i];

int zeros = 0 ;
int ones = 0 ;

for(int j = 0 ; j < temp.length() ; j++){
if (temp.charAt(j) == '0'  ){
        zeros++;
} else{
    ones++;
}   }
       

for (int  z = m ; z>= 0 ; z--){
    for (int x = n ; x >= 0 ; x--){
        dp[i][z][x] = Math.max(dp[i][z][x] ,  1 + dp[i][z-zeros][x - ones]);
    }
}

}
return dp [0][m][n];

    }

}

*/

class Solution {
    public int findMaxForm(String[] strs, int m, int n) {

        int l = strs.length;

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = 0;
            }
        }
        for (int i = 0; i <l; i++) {
            String temp = strs[i];

            int zeros = 0;
            int ones = 0;

            for (int j = 0; j < temp.length(); j++) {
                if (temp.charAt(j) == '0') {
                    zeros++;
                } else {
                    ones++;
                }
            }

            for (int z = m; z >= zeros; z--) {
                for (int x = n; x >= ones; x--) {
                    dp[z][x] = Math.max(dp[z][x], 1 + dp[z - zeros][x - ones]);
                }
            }

        }
        return dp[m][n];

    }
}