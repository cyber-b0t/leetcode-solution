// Last updated: 8/1/2026, 12:59:30 AM
1class Solution {
2
3    public int divisorSum(int[] nums, int n){
4        int sum=0;
5        for(int i=0;i<nums.length;i++){
6            sum+=(nums[i]+n-1)/n;
7        }
8        return sum;
9    }
10    public int smallestDivisor(int[] nums, int threshold) {
11        int L=1;
12        int R=Arrays.stream(nums).max().getAsInt();
13
14        while(L<R){
15            int mid = L+(R-L)/2;
16
17            int g = divisorSum(nums,mid);
18
19            if(g<=threshold){
20                R = mid;
21            }else{
22                L = mid+1;
23            }
24
25        }
26
27        return L;
28    }
29}