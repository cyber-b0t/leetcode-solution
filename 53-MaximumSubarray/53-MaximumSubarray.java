// Last updated: 7/9/2026, 7:04:04 PM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int maxSum=Integer.MIN_VALUE;
4        int currSum=0;
5
6        for(int i=0;i<nums.length;i++){
7            currSum+=nums[i];
8            if(currSum<0){
9                maxSum = Math.max(maxSum,currSum);
10                currSum=0;
11            }else{
12                maxSum = Math.max(maxSum,currSum);
13            }
14        }
15        return maxSum;
16    }
17}