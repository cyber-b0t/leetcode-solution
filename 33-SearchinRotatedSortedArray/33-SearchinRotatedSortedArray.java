// Last updated: 7/31/2026, 5:11:42 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int L=0;
4        int R=nums.length-1;
5
6        while(L<=R){
7            int mid=L+(R-L)/2;
8
9            if(nums[mid]==target){
10                return mid;
11            }
12
13            if(nums[L]<=nums[mid]){
14                if(nums[L]<=target && target<nums[mid]){
15                    R = mid-1;
16                }else{
17                    L = mid+1;
18                }
19            }else{
20                if(nums[mid]<target && target<=nums[R]){
21                    L=mid+1;
22                }else{
23                    R=mid-1;
24                }
25            }
26        }
27
28        return -1;
29    }
30}