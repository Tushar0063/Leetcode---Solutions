class Solution {
    public int longestOnes(int[] nums, int k) {


 int n = nums.length ;
 int st = 0 ;
 int e = 0 ;
int len = 0 ;
 int zeros = 0 ;

 while(e < n){
    if (nums[e] == 0) zeros++;

    while(zeros > k){
        if (nums[st] == 0) zeros--;
        st++;
    }
    len = Math.max(len ,  e-st+1);
    e++;
 }      
 return len; 
    }
}