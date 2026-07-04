// Last updated: 7/4/2026, 8:23:54 PM
1class Solution {
2    public boolean isMiddleElementUnique(int[] nums) {
3        int i=0;
4        int j=nums.length-1;
5
6        int mid = nums[j/2];
7
8        while(i<j){
9            if(nums[i]==mid) return false;
10
11            if(nums[j]==mid) return false;
12
13            i++;
14            j--;
15        }
16
17        return true;
18    }
19}