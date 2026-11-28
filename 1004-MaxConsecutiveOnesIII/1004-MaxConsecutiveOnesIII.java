// Last updated: 11/28/2026, 5:26:46 PM
1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int L=0;
4        int ans=0;
5        int zeroCount=0;
6        for(int R=0;R<nums.length;R++){
7            int n = nums[R];
8
9            if(n==0){
10                zeroCount++;
11            }
12            while(zeroCount>k){
13                if(nums[L]==0){
14                    zeroCount--;
15                }
16                L++;
17            }
18            ans = Math.max(ans,R-L+1);
19        }
20
21        return ans;
22    }
23}