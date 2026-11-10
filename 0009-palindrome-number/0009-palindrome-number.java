class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int r,s=0;
        int c=x;
        while(x>0){
            r=x%10;
            s=s*10+r;
            x=x/10;
        }
       if(c==s){

        return true;
       }else {
        return false;
       }
    }
}