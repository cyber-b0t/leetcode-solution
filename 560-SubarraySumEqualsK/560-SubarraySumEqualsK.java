// Last updated: 8/22/2026, 2:34:35 AM
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        HashMap<Integer,Integer> mpp = new HashMap<>();
4        int sum=0;
5        int cnt=0;
6        mpp.put(0,1);
7        for(int i=0;i<nums.length;i++){
8            sum+=nums[i];
9            int need = sum-k;
10            cnt+=mpp.getOrDefault(need,0);
11            mpp.put(sum,mpp.getOrDefault(sum,0)+1);
12        }
13        return cnt;
14    }
15        
16}