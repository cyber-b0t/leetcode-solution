// Last updated: 11/19/2026, 7:09:14 PM
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
14        int ans=-1;
15        while(L<=H){
16            int mid = L+(H-L)/2;
17
18            if(nums[mid]<=target){
19                L = mid+1;
20                ans = mid;
21            }else{
22                H = mid-1;
23            }
24        }
25
26        return ans;
27    }
28
29    public int lowerbound(int[] nums, int target){
30        int L=0;
31        int H=nums.length-1;
32        int ans=-1;
33        while(L<=H){
34            int mid = L+(H-L)/2;
35            if(nums[mid]<target){
36                L = mid+1;
37                ans = mid;
38            }else{
39                H = mid-1;
40            }
41        }
42
43        return ans+1;
44    }
45
46    } 
47