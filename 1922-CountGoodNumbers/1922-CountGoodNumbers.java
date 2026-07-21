// Last updated: 7/21/2026, 9:54:29 PM
1class Solution {
2    static final long MOD = 1000000007;
3    public long pow(long n, long x) {
4        if (x == 0) return 1;
5        if (x == 1) return n % MOD;
6
7        long p = pow(n, x / 2);
8
9        long ans = (p * p) % MOD;
10
11        if (x % 2 == 1) {
12            ans = (ans * n) % MOD;
13        }
14
15        return ans;
16    }
17
18    public int countGoodNumbers(long n) {
19        long even = (n+1)/2;
20        long odd = n/2;
21
22        long ans = (pow(5,even)*pow(4,odd))%MOD;
23
24        return (int) ans;
25    }
26}