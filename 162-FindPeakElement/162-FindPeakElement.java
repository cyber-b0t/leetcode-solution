// Last updated: 7/12/2026, 2:14:59 AM
1class Solution {
2    public int findPeakElement(int[] nums) {
3        int L=0;
4        int R=nums.length-1;
5       
6        while(L<R){
7            int mid = L+(R-L)/2;
8
9            if(nums[mid]>nums[mid+1]){
10                R = mid;
11            }else{
12                L = mid+1;
13            }
14        }
15
16        return L;
17    }
18}