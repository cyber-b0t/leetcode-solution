// Last updated: 11/19/2026, 7:24:45 PM
1class Solution {
2    
3    public int[] searchRange(int[] nums, int target) {
4        int first = lowerbound(nums,target);
5        int last = upperbound(nums,target);
6        if (first>last){
7            return new int[]{-1,-1};
8        }
9        return new int[]{first,last};
10       }
11        public int upperbound(int[] nums, int target){
12        int L=0;
13        int H=nums.length-1;
14        
15        while(L<=H){
16            int mid = L+(H-L)/2;
17
18            if(nums[mid]>target){
19               H=mid-1;
20            }else{
21               L=mid+1;
22            }
23        }
24
25        return L-1;
26    }
27
28    public int lowerbound(int[] nums, int target){
29        int L=0;
30        int H=nums.length-1;
31        
32        while(L<=H){
33            int mid = L+(H-L)/2;
34            if(nums[mid]>=target){
35                H=mid-1;
36            }else{
37               L=mid+1;
38        }
39
40        
41    }
42        return L;
43    }
44} 
45