// Last updated: 8/2/2026, 11:46:41 PM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int x=1;
4        for(int i=1;i<nums.length;i++){
5            if(nums[i]!=nums[i-1]){
6                nums[x]=nums[i];
7                x++;
8            }
9        }
10        return x;
11    }
12}