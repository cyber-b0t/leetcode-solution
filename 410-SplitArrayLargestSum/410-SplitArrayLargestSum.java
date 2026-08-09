// Last updated: 8/9/2026, 7:02:31 PM
1class Solution {
2
3    public boolean canSplit(int[] nums, int k, int limit) {
4        int groups = 1;
5        int sum = 0;
6
7        for (int num : nums) {
8            if (sum + num <= limit) {
9                sum += num;
10            } else {
11                groups++;
12                sum = num;
13            }
14        }
15
16        return groups <= k;
17    }
18
19    public int splitArray(int[] nums, int k) {
20
21        int left = 0;
22        int right = 0;
23
24        for (int num : nums) {
25            left = Math.max(left, num);
26            right += num;
27        }
28
29        while (left < right) {
30            int mid = left + (right - left) / 2;
31
32            if (canSplit(nums, k, mid)) {
33                right = mid;
34            } else {
35                left = mid + 1;
36            }
37        }
38
39        return left;
40    }
41}
42