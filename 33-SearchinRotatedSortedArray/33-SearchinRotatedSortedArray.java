// Last updated: 11/23/2026, 7:09:48 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int L = 0;
4        int R = nums.length-1;
5
6        while(L<R){
7            int mid=L+(R-L)/2;
8
9            if(nums[mid]==target){
10                return mid;
11            }
12
13            if(nums[L]<=nums[mid]){
14                if(nums[L]<=target && nums[mid]>target){
15                    R = mid;
16                }else{
17                    L = mid+1;
18                }
19            }else{
20                if(nums[R]>=target && nums[mid]<target){
21                    L = mid+1;
22                }else{
23                    R = mid;
24                }
25            }
26        }
27
28        return nums[L]==target ? L:-1;
29    }
30}