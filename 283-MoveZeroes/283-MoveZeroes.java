// Last updated: 8/4/2026, 3:34:17 AM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int i=0;
4        int j=1;
5
6        while(j<nums.length){
7            if(nums[i]!=0){
8                i++;
9                j=Math.max(j,i+1);
10            }else if(nums[j]==0){
11                j++;
12            }else{
13                nums[i]=nums[j];
14                nums[j]=0;
15                i++;
16                j++;
17            }
18        }        
19    }
20}