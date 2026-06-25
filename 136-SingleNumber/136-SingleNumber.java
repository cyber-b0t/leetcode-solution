// Last updated: 6/25/2026, 5:09:53 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3        int x=0;
4
5        for(int i=0;i<nums.length;i++){
6            x = x^nums[i];
7        }
8
9        return x;
10    }
11}