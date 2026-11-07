// Last updated: 11/8/2026, 1:45:08 AM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int x=1;
4        int curr=nums[0];
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]!=curr){
7                nums[x] = nums[i];
8                x++;
9                curr = nums[i];
10            }
11        }
12
13        return x;
14    }
15}