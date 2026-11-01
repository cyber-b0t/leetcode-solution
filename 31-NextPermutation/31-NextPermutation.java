// Last updated: 11/2/2026, 1:42:34 AM
1class Solution {
2    public void reverse(int[] nums,int x,int y){
3        while(x<y){
4            int temp = nums[y];
5            nums[y] = nums[x];
6            nums[x] = temp;
7            x++;
8            y--;
9        }
10    }
11    public void nextPermutation(int[] nums) {
12        int pivot=-1;
13
14        for(int i=nums.length-1;i>=0;i--){
15            if(i!=0 && nums[i-1]<nums[i]){
16                pivot = i-1;
17                break;
18            }
19        }
20
21        if(pivot==-1){
22            reverse(nums,0,nums.length-1);
23            return;
24        }
25
26        for(int i=nums.length-1;i>=0;i--){
27            if(nums[i]>nums[pivot]){
28                int temp=nums[i];
29                nums[i]=nums[pivot];
30                nums[pivot]=temp;
31                break;
32            }
33        }
34
35        reverse(nums,pivot+1,nums.length-1);
36
37
38
39
40
41
42
43    }
44}