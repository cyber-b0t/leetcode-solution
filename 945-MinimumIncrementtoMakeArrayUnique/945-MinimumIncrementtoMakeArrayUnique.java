// Last updated: 11/9/2026, 4:47:16 PM
1class Solution {
2    public int minIncrementForUnique(int[] nums) {
3        Arrays.sort(nums);
4        int cost = 0;
5
6        for(int i=0;i<nums.length-1;i++){
7            int curr = nums[i];
8
9            while(nums[i+1]<=curr){
10                nums[i+1] = nums[i+1]+1;
11                cost++;
12            }    
13            
14        }
15
16        return cost;
17    }
18}