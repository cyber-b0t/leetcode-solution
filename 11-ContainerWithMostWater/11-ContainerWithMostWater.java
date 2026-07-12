// Last updated: 7/12/2026, 9:14:58 PM
1class Solution {
2    public int maxArea(int[] height) {
3        int L=0;
4        int R=height.length-1;
5        int max=0;
6        // int h1=height[0];
7        // int h2=height[height.length-1];
8
9        while(L<R){
10            int curr = R-L;
11            int c = Math.min(height[L],height[R]);
12            max = Math.max(max,curr*c);
13            if(height[L]<=height[R]){
14                L++;
15            }else{
16                R--;
17            }
18        }
19
20        return max;
21    }
22}