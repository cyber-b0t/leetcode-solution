// Last updated: 7/7/2026, 9:51:13 PM
1class Solution {
2    public boolean isMonotonic(int[] nums) {
3        boolean increasing=true;
4        boolean decreasing=true;
5        for(int j=1;j<nums.length;j++){
6            int i=j-1;
7            int x=nums[i];
8            int y=nums[j];
9
10            if(x<y) decreasing=false;
11            if(x>y) increasing=false;
12        }
13
14        return increasing || decreasing;
15    }
16}