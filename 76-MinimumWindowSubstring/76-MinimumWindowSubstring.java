// Last updated: 7/17/2026, 5:38:33 PM
1class Solution {
2    public String minWindow(String s, String t) {
3
4        HashMap<Character, Integer> tFreq = new HashMap<>();
5
6        for (int i = 0; i < t.length(); i++) {
7            char c = t.charAt(i);
8            tFreq.put(c, tFreq.getOrDefault(c, 0) + 1);
9        }
10
11        HashMap<Character, Integer> sFreq = new HashMap<>();
12
13        int L = 0;
14        int start = 0;
15        int minLen = Integer.MAX_VALUE;
16
17        int required = tFreq.size(); 
18        int formed = 0;         
19
20        for (int R = 0; R < s.length(); R++) {
21
22            char c = s.charAt(R);
23
24            if (tFreq.containsKey(c)) {
25                sFreq.put(c, sFreq.getOrDefault(c, 0) + 1);
26
27                if (sFreq.get(c).intValue() == tFreq.get(c).intValue()) {
28                    formed++;
29                }
30            }
31
32            while (formed == required) {
33
34                if (R - L + 1 < minLen) {
35                    minLen = R - L + 1;
36                    start = L;
37                }
38
39                char left = s.charAt(L);
40
41                if (tFreq.containsKey(left)) {
42
43                    sFreq.put(left, sFreq.get(left) - 1);
44
45                    if (sFreq.get(left) < tFreq.get(left)) {
46                        formed--;
47                    }
48
49                    if (sFreq.get(left) == 0) {
50                        sFreq.remove(left);
51                    }
52                }
53
54                L++;
55            }
56        }
57
58        return minLen == Integer.MAX_VALUE ? "": s.substring(start, start + minLen);
59    }
60}