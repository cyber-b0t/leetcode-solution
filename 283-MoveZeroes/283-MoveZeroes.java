// Last updated: 11/8/2026, 2:12:10 AM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int i=0;
4        int zeroPointer=0;
5
6        while(i<nums.length && zeroPointer<nums.length){
7
8            while(zeroPointer<nums.length && nums[zeroPointer]!=0){
9                zeroPointer++;
10            }
11            i = zeroPointer+1;
12
13            while(i<nums.length && nums[i]==0){
14                i++;
15            }
16
17            if(i<nums.length && zeroPointer<nums.length){
18                int temp = nums[i];
19                nums[i] = 0;
20                nums[zeroPointer] = temp;
21                i++;
22            }
23        }
24    }
25}