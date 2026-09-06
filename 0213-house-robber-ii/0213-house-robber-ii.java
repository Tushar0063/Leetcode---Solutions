class Solution {

    static int[] dp;

    public int sol(int[] nums, int i, int end) {

        if (i > end) return 0;

        if (dp[i] != -1) return dp[i];

        int rob = nums[i] + sol(nums, i + 2, end);
        int skip = sol(nums, i + 1, end);

        return dp[i] = Math.max(rob, skip); 
    }

    public int rob(int[] nums, int st, int end) {

        dp = new int[nums.length];
        Arrays.fill(dp, -1);

        return sol(nums, st, end);
    }

    public int rob(int[] nums) {

        int n = nums.length;

        if (n == 1) return nums[0];

        int inc = rob(nums, 1, n - 1);
        int exc = rob(nums, 0, n - 2);

        return Math.max(inc, exc);
    }
}