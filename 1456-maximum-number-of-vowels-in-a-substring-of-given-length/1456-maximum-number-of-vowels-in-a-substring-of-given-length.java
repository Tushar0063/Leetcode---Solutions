class Solution {
    public int maxVowels(String s, int k) {
        
        int n = s.length();

        int st = 0; 
        int e =0 ;
        int current = 0 ;
          int maxCount = 0 ;

        while(e < n ){

            if (s.charAt(e) == 'a' || s.charAt(e) == 'e' || s.charAt(e) == 'i' || s.charAt(e) == 'o' || s.charAt(e) == 'u' ){
                current += 1;
            }
           //  maxCount = current ;

            if (e - st + 1 == k){
                maxCount = Math.max(maxCount ,  current );

            

             if (s.charAt(st) == 'a' || s.charAt(st) == 'e' || s.charAt(st) == 'i' || s.charAt(st) == 'o' || s.charAt(st) == 'u' ){
                current -= 1;
             
            }
            st++;

            }
            e++;
        }

        return maxCount ;
    }
}