// Last updated: 7/7/2026, 12:34:05 PM
1class Solution {
2    int[] dp;
3    public int robMax(int n,int[] nums){
4        if(n==0) return nums[0];
5        if(n==1) return Math.max(nums[0],nums[1]);
6        if(dp[n]!=-1) return dp[n]; 
7
8        int pick = nums[n] + robMax(n-2,nums);
9        int notPick = robMax(n-1,nums);
10
11        return dp[n]=Math.max(pick,notPick);
12    }
13    public int rob(int[] nums) {
14        dp = new int[nums.length];
15        Arrays.fill(dp,-1);
16        return robMax(nums.length-1,nums);
17    }
18}