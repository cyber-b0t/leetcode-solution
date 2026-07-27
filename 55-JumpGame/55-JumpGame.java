// Last updated: 7/28/2026, 2:01:48 AM
1class Solution {
2    public boolean canJump(int[] nums) {
3        int maxD=0;
4        for(int i=0;i<nums.length;i++){
5            int n = nums[i];
6            if(i>maxD) return false;
7            maxD = Math.max(maxD,i+n);
8        }
9
10        return true;
11    }
12}