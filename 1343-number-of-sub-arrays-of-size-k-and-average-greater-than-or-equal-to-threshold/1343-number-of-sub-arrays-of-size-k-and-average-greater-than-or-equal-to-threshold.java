class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int n = arr.length;
        int st = 0;
        int e = 0;

        int current = 0;
        int count = 0;

        while (e < n) {

            current += arr[e];

            int maxSum = current / k;
            if (e - st + 1 == k) {

                if (maxSum >= threshold) {
                    count++;
                }

                current -= arr[st];
                st++;
            }
            e++;
        }
        return count;
    }
}