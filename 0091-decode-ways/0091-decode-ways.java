class Solution {

    // RECURSIVE 

//     public int Solve(String s ,  int i){
       
//    if(i >= s.length()) return 1;
//    if (s.charAt(i) == '0') return 0;

//    int single = Solve(s , i+1);

//    int two =0;
//    if(i < s.length()-1){
//     int curr  = s.charAt(i) - 48;
//     int next = s.charAt(i+1) - 48;

//     int num = curr*10 + next;

//     if(num <= 26) two = Solve(s,i+2);
//    }
    
//     return single + two;
//     }

// MEMORISATION 

// public int Solve(int i , String s ,int [] dp){

//     if( i >= s.length()) return 1;
//     if (s.charAt(i) == '0') return 0;
//     if(dp[i] != -1) return dp[i];

//     int single = Solve(i+1 , s ,dp);

//     int two = 0 ;
//     if(i < s.length()-1) {
//         int curr = s.charAt(i) - 48;
//         int next = s.charAt(i+1) - 48;

//         int num = curr*10 + next;
//         if (num <= 26) two = Solve(i+2 , s, dp);

//     }
//     dp[i] = single + two;
//     return dp[i];
// }

    public int numDecodings(String s) {
        
      // return Solve(s,0);

    //   int [] dp = new int [s.length()+ 1];
    //    Arrays.fill(dp,-1);
    //    return Solve(0 , s, dp);

    // TABULATION 
    int n = s.length();
    int [] dp = new int[n+1];

    dp[n] = 1;

    for(int i = n-1 ; i>= 0 ;i--){
       if (s.charAt(i) == '0') continue ;

       int single = dp[i+1];
       int two = 0 ;

       if (i < n-1)  {
        int curr = s.charAt(i) - 48;
        int next = s.charAt(i+1) - 48;

         int num = curr*10 + next;
         if(num <= 26) two = dp[i+2];
       }

       dp[i] = single + two;

    }
     return dp[0];

    }
}