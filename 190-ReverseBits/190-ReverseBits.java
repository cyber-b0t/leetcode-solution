// Last updated: 7/14/2026, 6:02:07 PM
1class Solution {
2    public int reverseBits(int n) {
3        int res=0;
4
5        for(int i=0;i<32;i++){
6            int bit = (n>>i)&1;
7            res = res|(bit<<(31-i));
8        }
9
10        return res;
11    }
12}