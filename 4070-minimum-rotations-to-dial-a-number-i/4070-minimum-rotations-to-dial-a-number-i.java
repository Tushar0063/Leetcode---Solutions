class Solution {
    public int minRotations(String s) {

        int count = 0 ;
        int current = 0 ; // pointer initially 
        
        for (int i = 0 ; i< s.length() ; i++){

         int    target = s.charAt(i) - '0';
            int diff = Math.abs(target - current );

            count += Math.min(diff , 10 - diff);
            current = target;
            }
        
        return count;
    }
}