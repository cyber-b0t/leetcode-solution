// Last updated: 7/28/2026, 1:50:52 PM
1class Solution {
2    public int maximumProduct(int[] nums) {
3        Arrays.sort(nums);
4        int ans=1;
5        int i=0;
6        int j=nums.length-1;
7        
8        ans = Math.max(nums[i]*nums[i+1]*nums[j],nums[j]*nums[j-1]*nums[j-2]);
9
10        return ans;
11    }
12}