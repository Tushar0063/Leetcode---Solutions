class Solution {

public int Solve(int n , int x ,  int [] arr , int curr , int i , int [][] dp){
    int m = arr.length;
    int mod = 1000000007;

     if (curr == n) return 1 ;
    if ( i >= m || curr > n )  return 0 ;
    if (dp[i][curr] != -1 )  return dp[i][curr];
  

    int skip = Solve( n, x , arr , curr , i+1 , dp);
    int take =  0 ;
    if (curr + arr[i] <= n){
        take = Solve(n ,x , arr , curr + arr[i] , i+1 , dp); 
    }

    return dp[i][curr] = (take + skip ) % mod;
}

    public int numberOfWays(int n, int x) {
        
        int index = 0 ; 

     
        
        for (int i = 0 ; i <= n ; i++){

            if (Math.pow(i ,x) >= n){
                index = i ;    
                break ;            
            }
            
        }

        int  [] arr = new int [index];
        for (int i = 1 ; i <= index ; i++){
            arr[i-1] = (int)Math.pow(i , x);
        }
            
               int [][] dp = new int [arr.length +1 ][n+1];
               for(int i = 0 ; i < arr.length ; i++){
                for(int j = 0 ; j < n; j++){
                    dp[i][j] = -1 ;
                }
               }

            return Solve(n,x,arr,0,0 , dp);

    }
}