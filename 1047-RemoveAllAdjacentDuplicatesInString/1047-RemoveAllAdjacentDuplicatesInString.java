// Last updated: 7/9/2026, 12:55:26 PM
1class Solution {
2    public String removeDuplicates(String s) {
3        StringBuilder sb = new StringBuilder();
4
5        for (int i=0;i<s.length();i++) {
6            char c = s.charAt(i);
7            int len = sb.length();
8
9            if (len > 0 && sb.charAt(len - 1) == c) {
10                sb.deleteCharAt(len - 1); 
11            } else {
12                sb.append(c);             
13            }
14        }
15
16        return sb.toString();
17    }
18}