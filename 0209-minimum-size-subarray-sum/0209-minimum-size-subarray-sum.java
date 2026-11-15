class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int n = nums.length;
        int st = 0;
        int e = 0;
        int current = 0;
        int len = Integer.MAX_VALUE;

        while (e < n) {
            current += nums[e];

            while (current >= target) {
                len = Math.min(len, e - st + 1);
                current -= nums[st];
                st++;
            }
            e++;
        }

if (len == Integer.MAX_VALUE){
    return 0;
}else{
        return len;
}
    }
}