// Last updated: 11/7/2026, 3:56:04 AM
1class Solution {
2    public boolean canJump(int[] nums) {
3        int d=0;
4
5        for(int i=0;i<nums.length;i++){
6            if(i>d) return false;
7            d = Math.max(d,i+nums[i]);
8            if(d>=nums.length-1) return true;
9        }
10
11        return false;
12    }
13}