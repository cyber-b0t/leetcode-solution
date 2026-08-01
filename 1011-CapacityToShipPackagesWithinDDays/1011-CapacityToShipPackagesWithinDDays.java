// Last updated: 8/2/2026, 3:39:58 AM
1class Solution {
2
3    public boolean canShip(int[] weights, int days, int capacity) {
4        int currentLoad = 0;
5        int requiredDays = 1;
6
7        for (int w : weights) {
8            if (currentLoad + w > capacity) {
9                requiredDays++;
10                currentLoad = 0;
11            }
12
13            currentLoad += w;
14        }
15
16        return requiredDays <= days;
17    }
18
19    public int shipWithinDays(int[] weights, int days) {
20        int left = 0;
21        int right = 0;
22
23        for (int w : weights) {
24            left = Math.max(left, w);
25            right += w;
26        }
27
28        while (left < right) {
29            int mid = left + (right - left) / 2;
30
31            if (canShip(weights, days, mid)) {
32                right = mid;
33            } else {
34                left = mid + 1;
35            }
36        }
37
38        return left;
39    }  
40}
41