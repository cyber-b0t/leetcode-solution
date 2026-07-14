// Last updated: 7/14/2026, 4:24:58 PM
1class Solution {
2    public int hammingWeight(int n) {
3        int cnt=0;
4        while(n!=0){
5            if((n&1)==1) cnt++;
6            n = n>>1;
7        }
8        return cnt;
9    }
10}