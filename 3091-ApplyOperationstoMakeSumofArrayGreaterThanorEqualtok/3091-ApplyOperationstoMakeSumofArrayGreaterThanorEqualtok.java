// Last updated: 11/9/2026, 3:58:09 PM
1class Solution {
2    public int minOperations(int k) {
3
4        if(k==1) return 0;
5        int ans = Integer.MAX_VALUE;
6        for(int i=1;i<Math.sqrt(k)+1;i++){
7            int x = i-1 + (int)Math.ceil((double)k/i)-1;
8            ans = Math.min(ans,x);
9        }
10
11        return ans;
12
13    }
14}