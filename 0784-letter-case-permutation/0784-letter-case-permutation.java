class Solution {

public void Solve ( List <String > ans , String curr , int i , String s){


if ( i >= s.length()){
    ans.add(curr);
    return ;
}
  char ch = s.charAt(i);


if (Character.isDigit(ch)){

    Solve(ans , curr + ch , i+1 ,s);

} 
else{
 Solve(ans , curr + Character.toLowerCase(ch) , i+1 ,s);
  Solve(ans , curr + Character.toUpperCase(ch) , i+1 ,s);

}
}

    public List<String> letterCasePermutation(String s) {
        
        List <String > ans = new ArrayList <>();

        String curr = "";
        Solve(ans , curr , 0  ,s);
        return ans ;
    }
}