// Last updated: 7/14/2026, 4:26:38 PM
1class Solution {
2    public int hammingWeight(int n) {
3        int cnt = 0;
4        while (n != 0) {
5            n &= (n - 1);
6            cnt++;
7        }
8        return cnt;
9    }
10}