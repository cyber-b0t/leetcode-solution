// Last updated: 7/26/2026, 2:21:33 AM
1import java.util.*;
2
3class Solution {
4
5    public int[] pge(int[] nums) {
6        int n = nums.length;
7        int[] ans = new int[n];
8        Stack<Integer> st = new Stack<>();
9
10        for (int i = 0; i < n; i++) {
11            while (!st.isEmpty() && nums[st.peek()] <= nums[i]) {
12                st.pop();
13            }
14
15            ans[i] = st.isEmpty() ? -1 : st.peek();
16
17            st.push(i);
18        }
19
20        return ans;
21    }
22
23    public int[] nge(int[] nums) {
24        int n = nums.length;
25        int[] ans = new int[n];
26        Stack<Integer> st = new Stack<>();
27
28        for (int i = n - 1; i >= 0; i--) {
29            while (!st.isEmpty() && nums[st.peek()] < nums[i]) {
30                st.pop();
31            }
32
33            ans[i] = st.isEmpty() ? n : st.peek();
34
35            st.push(i);
36        }
37
38        return ans;
39    }
40
41    public int[] pse(int[] nums) {
42        int n = nums.length;
43        int[] ans = new int[n];
44        Stack<Integer> st = new Stack<>();
45
46        for (int i = 0; i < n; i++) {
47            while (!st.isEmpty() && nums[st.peek()] >= nums[i]) {
48                st.pop();
49            }
50
51            ans[i] = st.isEmpty() ? -1 : st.peek();
52
53            st.push(i);
54        }
55
56        return ans;
57    }
58
59    public int[] nse(int[] nums) {
60        int n = nums.length;
61        int[] ans = new int[n];
62        Stack<Integer> st = new Stack<>();
63        
64        for (int i = n - 1; i >= 0; i--) {
65            while (!st.isEmpty() && nums[st.peek()] > nums[i]) {
66                st.pop();
67            }
68
69            ans[i] = st.isEmpty() ? n : st.peek();
70
71            st.push(i);
72        }
73
74        return ans;
75    }
76
77
78    public long subArrayRanges(int[] nums) {
79
80        int n = nums.length;
81
82        int[] pge = pge(nums);
83        int[] nge = nge(nums);
84
85        int[] pse = pse(nums);
86        int[] nse = nse(nums);
87
88        long maxSum = 0;
89        long minSum = 0;
90
91        for (int i = 0; i < n; i++) {
92
93            long leftMax = i - pge[i];
94            long rightMax = nge[i] - i;
95
96            maxSum += (long) nums[i] * leftMax * rightMax;
97
98
99            long leftMin = i - pse[i];
100            long rightMin = nse[i] - i;
101
102            minSum += (long) nums[i] * leftMin * rightMin;
103        }
104
105        return maxSum - minSum;
106    }
107}
108