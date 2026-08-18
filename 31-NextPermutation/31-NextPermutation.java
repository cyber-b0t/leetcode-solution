// Last updated: 8/18/2026, 5:57:21 PM
1class Solution {
2    public void reverse(int[] nums , int x , int y){
3        while(x<y){
4            int tmp = nums[x];
5            nums[x] = nums[y];
6            nums[y] = tmp;
7            x++;
8            y--;
9        }
10    }
11    public void nextPermutation(int[] nums) {
12        int drop_idx=-1;
13
14        for(int i=nums.length-1;i>=0;i--){
15            if(i!=0 && nums[i]>nums[i-1]){
16                drop_idx=i-1;
17                break;
18            }
19        }
20
21        if(drop_idx==-1){
22            reverse(nums,0,nums.length-1);
23            return;
24        }
25
26        for(int i=nums.length-1;i>=0;i--){
27            if(nums[i]>nums[drop_idx]){
28                int tmp = nums[drop_idx];
29                nums[drop_idx] = nums[i];
30                nums[i] = tmp;
31                break;       
32            }
33        }
34
35        reverse(nums,drop_idx+1,nums.length-1);
36    }
37}