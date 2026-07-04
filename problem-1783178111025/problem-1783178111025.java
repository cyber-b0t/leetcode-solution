// Last updated: 7/4/2026, 8:45:11 PM
1class Solution {
2    public int maxValidPairSum(int[] nums, int k) {
3        int best = Integer.MIN_VALUE;
4        int ans = Integer.MIN_VALUE;
5        
6        for (int j = k; j < nums.length; j++) {
7            best = Math.max(best, nums[j - k]);
8            ans = Math.max(ans, best + nums[j]);
9        }
10        
11        return ans;
12    }
13}