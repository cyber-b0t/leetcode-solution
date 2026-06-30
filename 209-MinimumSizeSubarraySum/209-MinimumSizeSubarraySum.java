// Last updated: 7/1/2026, 2:16:31 AM
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int min=Integer.MAX_VALUE;
4        int curr=0;
5        int L=0;
6
7        for(int R=0;R<nums.length;R++){
8            curr+=nums[R];
9
10            while(L<=R && curr>=target){
11                min = Math.min(min,R-L+1);
12                curr-=nums[L];
13                L++; 
14            }
15            
16        }
17
18        return (min==Integer.MAX_VALUE)?0:min;
19    }
20}