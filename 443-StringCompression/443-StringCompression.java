// Last updated: 7/12/2026, 7:36:03 PM
1class Solution {
2    public int compress(char[] chars) {
3        char el = chars[0];
4        int cnt = 0;
5        int idx = 0;
6
7        for (int i = 0; i < chars.length; i++) {
8            char c = chars[i];
9            if (el == c) {
10                cnt++;
11            } else {
12                chars[idx] = el;
13                idx++;
14                if (cnt > 1) {
15                    String num = String.valueOf(cnt);
16                    for (int j = 0; j < num.length(); j++) {
17                        chars[idx] = num.charAt(j);
18                        idx++;
19                    }
20                }
21                el = c;
22                cnt = 1;
23            }
24        }
25        chars[idx] = el;
26        idx++;
27        if (cnt > 1) {
28            String num = String.valueOf(cnt);
29            for (int j = 0; j < num.length(); j++) {
30                chars[idx] = num.charAt(j);
31                idx++;
32            }
33        }
34
35        return idx;
36    }
37}