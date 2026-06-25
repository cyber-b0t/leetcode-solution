// Last updated: 6/25/2026, 6:11:34 PM
1class Solution {
2    public void reverse(int[] arr,int L,int R){
3        while(L<R){
4            int temp = arr[R];
5            arr[R] = arr[L];
6            arr[L] = temp;
7
8            L++;
9            R--;
10        }
11    }
12    public void nextPermutation(int[] nums) {
13
14        int pivot=-1;
15
16        for(int i=nums.length-1;i>0;i--){
17            if(nums[i]>nums[i-1]){
18                pivot=i-1;
19                break;
20            }
21        }
22
23        if(pivot==-1) {
24            reverse(nums,0,nums.length-1);
25            return;
26        }
27    
28        for(int i=nums.length-1;i>=pivot;i--){
29            if(nums[i]>nums[pivot]){
30                int temp = nums[i];
31                nums[i] = nums[pivot];
32                nums[pivot] = temp;
33                break;
34            }
35        }
36
37        reverse(nums,pivot+1,nums.length-1);
38    }
39}