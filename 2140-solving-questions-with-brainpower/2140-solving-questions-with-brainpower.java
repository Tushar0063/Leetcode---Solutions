class Solution {

    //RECURSIVE 

    // public long Solve(int i , int [][] questions ){
       
    //    int m = questions.length;     // points 
    //    int n= questions[0].length ;   // questions skip 


    //     if(i >= m) return 0 ;

    //     int take = questions[i][0] + Solve(i+ questions[i][1] +1 , questions );
    //     int skip = Solve(i+1 , questions );

    //     return Math.max(take, skip); 
    // }

    //MEMORISATION 

    // public long Solve(int i ,int [][] questions,long [] dp){
    //     int m = questions.length;
    //     int n = questions[0].length;
      
    //   if( i  >= m) return 0;
    //   if(dp[i] != -1) return dp[i];
       
    //    long take = questions[i][0] + Solve(i + questions[i][1]  + 1, questions,dp);
    //    long skip = Solve(i+1 , questions ,dp);

    //    dp[i] = Math.max(take,skip);
    //    return dp[i];

    // }

  


    public long mostPoints(int[][] questions) {

       // return Solve(0 , questions );

    //    long [] dp = new long [questions.length + 1];
    //    Arrays.fill(dp , -1);

    //    return Solve(0 , questions ,dp);
        
        int n = questions.length;
        long [] dp = new long [questions.length+1];

        

        dp[n] = 0 ;
       

        for(int i = n-1 ; i>= 0 ;i--){
            long  skip = dp[i+1];
            long take = questions[i][0];
             int nextIndex = i + questions[i][1]  + 1;

             if(nextIndex < n){
                take += dp[nextIndex];
             }
        

         dp[i] = Math.max(take,skip);
        }
return dp[0];
        
    }
}