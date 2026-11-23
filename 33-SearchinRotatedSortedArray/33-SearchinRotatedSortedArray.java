// Last updated: 11/23/2026, 7:07:25 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int L = 0;
4        int R = nums.length-1;
5
6        while(L<=R){
7            int mid=L+(R-L)/2;
8
9            if(nums[mid]==target){
10                return mid;
11            }else if(nums[L]<=nums[mid]){
12                if(nums[L]<=target && nums[mid]>target){
13                    R = mid-1;
14                }else{
15                    L = mid+1;
16                }
17            }else{
18                if(nums[R]>=target && nums[mid]<target){
19                    L = mid+1;
20                }else{
21                    R = mid-1;
22                }
23            }
24        }
25
26        return -1;
27    }
28}