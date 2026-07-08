// Last updated: 7/8/2026, 8:43:37 PM
1class Solution {
2    public int trap(int[] height) {
3        int L = 0, R = height.length - 1;
4        int Lmax = 0, Rmax = 0;
5        int water = 0;
6
7        while (L < R) {
8            if (height[L] < height[R]) {
9                if (height[L] >= Lmax) Lmax = height[L];
10                else water += Lmax - height[L];
11                L++;
12            } else {
13                if (height[R] >= Rmax) Rmax = height[R];
14                else water += Rmax - height[R];
15                R--;
16            }
17        }
18        return water;
19    }
20}