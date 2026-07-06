// Last updated: 7/7/2026, 12:04:53 AM
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int first = findFirst(nums, target);
4
5        if (first == -1) {
6            return new int[]{-1, -1};
7        }
8
9        int last = findLast(nums, target);
10
11        return new int[]{first, last};
12    }
13
14    private int findFirst(int[] nums, int target) {
15        int low = 0, high = nums.length - 1;
16        int ans = -1;
17
18        while (low <= high) {
19            int mid = low + (high - low) / 2;
20
21            if (nums[mid] == target) {
22                ans = mid;
23                high = mid - 1;  
24            } else if (nums[mid] < target) {
25                low = mid + 1;
26            } else {
27                high = mid - 1;
28            }
29        }
30
31        return ans;
32    }
33
34    private int findLast(int[] nums, int target) {
35        int low = 0, high = nums.length - 1;
36        int ans = -1;
37
38        while (low <= high) {
39            int mid = low + (high - low) / 2;
40
41            if (nums[mid] == target) {
42                ans = mid;
43                low = mid + 1;   
44            } else if (nums[mid] < target) {
45                low = mid + 1;
46            } else {
47                high = mid - 1;
48            }
49        }
50
51        return ans;
52    }
53}