// Last updated: 7/14/2026, 6:04:18 PM
1class Solution {
2    public int reverseBits(int n) {
3        int res=0;
4
5        for(int i=31;i>=0;i--){
6            int bit = n&1;
7            res = res + (bit<<i);
8            n = n>>1;
9        }
10
11        return res;
12    }
13}