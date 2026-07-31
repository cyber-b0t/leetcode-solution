// Last updated: 7/31/2026, 5:42:14 PM
1class Solution {
2    public boolean search(int[] nums, int target) {
3        int L = 0;
4        int R = nums.length-1;
5
6        while(L<=R){
7            int mid=L+(R-L)/2;
8
9            if(nums[mid]==target){
10                return true;
11            }
12
13            if (nums[L] == nums[mid] && nums[mid] == nums[R]) {
14                L++;
15                R--;
16                continue;
17            }
18
19            if(nums[L]<=nums[mid]){
20                if(nums[L]<=target && target<nums[mid]){
21                    R = mid-1;
22                }else{
23                    L = mid+1;
24                }
25            }else{
26                if(nums[mid]<target && target<=nums[R]){
27                    L=mid+1;
28                }else{
29                    R=mid-1;
30                }
31            }
32        }
33
34        return false;
35
36    }
37}