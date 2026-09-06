// Last updated: 9/6/2026, 8:26:30 PM
1class Solution {
2    public void reverse(int[] nums,int i,int j){
3        while (i < j) {
4            int temp = nums[i];
5            nums[i] = nums[j];
6            nums[j] = temp;
7            i++;
8            j--;
9        }
10    }
11    public void rotate(int[] nums, int k) {
12        
13        k=k%nums.length;
14        if(k==0) return;
15        reverse(nums,0,nums.length-1);
16        reverse(nums,0,k-1);
17        reverse(nums,k,nums.length-1);
18    }
19}