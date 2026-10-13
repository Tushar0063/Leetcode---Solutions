class Solution {
    public int Solve (int n ,  int i , int [] arr ,int [][] dp ){

        int l = arr.length ;
       if (n == 0) return 0 ;
       if ( i >= l) return Integer.MAX_VALUE ;
 
 if (dp[n][i] != -1) return dp[n][i];

       int skip = Solve(n , i +1 ,  arr , dp );
       int take = 10000; 
       if (arr[i]  <= n){
        take = 1 + Solve(n - arr[i] , i , arr , dp );
       }
 
return dp[n][i] = Math.min(take , skip);
    }


    public int numSquares(int n) {
 
        List<Integer> list = new ArrayList<>();
        for (int i = 1 ; i <= n ; i++){
            if (Math.pow(i,2) <= n){
                list.add((int)Math.pow(i,2));
            }
        }
 int l = list.size();

   int [][] dp = new int [n+1][l+1];
   for (int i = 0 ; i <= n ; i++){
    for (int j = 0 ; j <= l ;j++){
        dp[i][j] = -1 ;
    }
   }

 int [] arr = new int[l];
 for (int i = 0 ; i < l ; i++){
    arr[i] = list.get(i);
 }
 return Solve( n ,0 , arr , dp);


    }
}