// Last updated: 7/5/2026, 9:19:25 PM
1class Solution {
2    Map<Integer, Integer> memo = new HashMap<>();
3
4    int fib(int n) {
5        if (n <= 1) return n;
6        if (memo.containsKey(n)) return memo.get(n);
7        int result = fib(n-1) + fib(n-2);
8        memo.put(n, result);                             
9        return result;
10    }
11}