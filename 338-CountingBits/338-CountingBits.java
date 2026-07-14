// Last updated: 7/14/2026, 4:45:33 PM
1class Solution {
2    public int[] countBits(int n) {
3        int[] bits = new int[n + 1];
4
5        for (int i = 1; i <= n; i++) {
6            bits[i] = bits[i & (i - 1)] + 1;
7        }
8
9        return bits;
10    }
11}