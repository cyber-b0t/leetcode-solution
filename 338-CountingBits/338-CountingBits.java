// Last updated: 7/14/2026, 4:42:36 PM
1class Solution {
2    public int countSetBits(int n){
3        int cnt = 0;
4        while (n != 0) {
5            n &= (n - 1);
6            cnt++;
7        }
8        return cnt;
9    }
10    public int[] countBits(int n) {
11        int[] arr = new int[n+1];
12
13        for(int i=0;i<arr.length;i++){
14            arr[i] = countSetBits(i);
15        }
16
17        return arr;
18    }
19}