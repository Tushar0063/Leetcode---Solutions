class Solution {

 
 public void Solve ( int n , String curr , int open , int close ,  List<String  > ans ){

    if ( curr.length() ==  2*n ) {
        ans.add(curr);
        return;
    }

        // opening;

         if(open  < n) {
        Solve( n , curr + "(" , open + 1 , close , ans );
         }
        // close 
       if (close < open ){
     Solve(n , curr + ")" , open , close + 1 , ans );

       }
       

 }

    public List<String> generateParenthesis(int n) {
        
        List<String  > ans = new  ArrayList<>();
          
           String curr = "";
           Solve( n , curr , 0 , 0 , ans );

return ans ;
    }
}