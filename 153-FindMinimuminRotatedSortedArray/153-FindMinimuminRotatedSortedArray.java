// Last updated: 11/23/2026, 1:06:14 AM
1class Solution {
2    public int findMin(int[] nums) {
3        int L=0;
4        int R=nums.length-1;
5
6        while(L<R){
7            int mid = L+(R-L)/2;
8
9            if(nums[R]<nums[mid]){
10                L = mid+1;
11            }else{
12                R = mid;
13            }
14
15        }
16        return nums[L];
17    }
18}