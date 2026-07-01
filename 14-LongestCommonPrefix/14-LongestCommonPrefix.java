// Last updated: 7/2/2026, 2:32:01 AM
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3
4        for (int i = 0; i < strs[0].length(); i++) {
5            char c = strs[0].charAt(i);
6
7            for (int j = 1; j < strs.length; j++) {
8                String s = strs[j];
9
10                if (i == s.length()) {
11                    return strs[0].substring(0, i);
12                }
13
14                char g = s.charAt(i);
15
16                if (c != g) {
17                    return strs[0].substring(0, i);
18                }
19            }
20        }
21
22        return strs[0];
23    }
24}