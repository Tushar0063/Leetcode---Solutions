class Solution {

    public int Solve(int [] rewardsValues , int i , int previous  , int [][] dp ){

        int n = rewardsValues.length;
        if (i >= n) return 0 ;

 if (dp[i][previous] != -1) return dp[i][previous];
 
     
        int curr = rewardsValues[i] ;
        int skip = Solve(rewardsValues , i+1 , previous , dp );

        int take = 0 ;

        if (curr > previous ){

          take =  curr +  Solve(rewardsValues , i+1 , previous + curr , dp);
        }

        return dp[i][previous] =  Math.max(take , skip);
    }
    public int maxTotalReward(int[] rewardValues) {

        Arrays.sort(rewardValues);
        int n = rewardValues.length;


        int [][] dp = new int [n+1][10000];
        for (int [] num : dp){
            Arrays.fill(num , -1);
        }


        return Solve(rewardValues , 0 , 0 , dp);

    }
}

// class Solution {
//       public int maxTotalReward(int[] rewardValues) {

//        int n = rewardValues.length ;

//        int [][] dp = new int 

//       }
//       }
