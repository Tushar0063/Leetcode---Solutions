class Solution {

    public void Solve(String s ,  List<String> ans , String curr , int i ){

        
    int n = s.length();
    if (i == n){
        ans.add(curr);
        return ;
    }

          char ch = s.charAt(i);
          if (Character.isDigit(ch)){
            Solve(s,ans,curr+ch,i+1);
          } else{
          Solve(s, ans , curr + Character.toUpperCase(ch) , i+1);
          Solve(s, ans ,  curr + Character.toLowerCase(ch) , i+1);
          }

    }
    public List<String> letterCasePermutation(String s) {
        

        List<String> ans = new ArrayList<>();
        String curr = "";

        Solve(s,ans ,curr , 0);

        return ans ;

    }
}