// Last updated: 11/12/2026, 2:38:56 AM
1class Solution {
2    public int maxSubarraySumCircular(int[] nums) {
3        int totalSum=nums[0];
4        int sum=0;
5        int minTotal=nums[0];
6        int minSum=0;
7        int total = 0;
8
9        int ans = 0;
10        for(int i=0;i<nums.length;i++){
11            sum+=nums[i];
12            totalSum = Math.max(sum,totalSum);
13            if(sum<0) {
14                sum = 0;
15            }
16
17            minSum+=nums[i];
18            minTotal = Math.min(minSum,minTotal);
19            if(minSum>0){
20                minSum=0;
21            }
22
23            total += nums[i];
24            ans = Math.max(total-minTotal,totalSum);
25        }
26
27        if(minTotal == total){
28            return totalSum;
29        }else{
30            return ans;
31        }
32
33        
34    }
35}