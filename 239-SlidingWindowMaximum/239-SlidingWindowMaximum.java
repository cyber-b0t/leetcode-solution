// Last updated: 7/17/2026, 2:50:41 AM
1class Solution {
2    public int[] maxSlidingWindow(int[] nums, int k) {
3
4        Deque<Integer> dq = new ArrayDeque<>();
5        int[] ans = new int[nums.length - k + 1];
6        int idx = 0;
7
8        for (int i = 0; i < nums.length; i++) {
9
10            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
11                dq.pollFirst();
12            }
13
14            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
15                dq.pollLast();
16            }
17
18            dq.offerLast(i);
19
20            if (i >= k - 1) {
21                ans[idx++] = nums[dq.peekFirst()];
22            }
23        }
24
25        return ans;
26    }
27}