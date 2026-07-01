// Last updated: 7/2/2026, 3:40:53 AM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if (s.length() != t.length()) return false;
4
5        int[] freq = new int[26];
6
7        for (int i = 0; i < s.length(); i++) {
8            freq[s.charAt(i) - 'a']++;
9            freq[t.charAt(i) - 'a']--;
10        }
11
12        for (int count : freq) {
13            if (count != 0) return false;
14        }
15
16        return true;
17    }
18}