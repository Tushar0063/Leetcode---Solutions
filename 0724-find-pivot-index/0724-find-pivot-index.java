class Solution {

    public int pivotIndex(int[] nums) {

        int n = nums.length;

        int ts = 0;

        for (int i = 0; i < n; i++) {
            ts += nums[i];
        }

        int prev = 0;
        int suff = 0;

        for (int i = 0; i < n; i++) {

            suff = ts - prev - nums[i];

            if (prev == suff) {
                return i;
            }
            
            prev += nums[i];
        }

        return -1;
    }
}