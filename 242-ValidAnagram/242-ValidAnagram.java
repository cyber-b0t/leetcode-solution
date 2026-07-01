// Last updated: 7/2/2026, 3:39:44 AM
1import java.util.Arrays;
2class Solution {
3    public boolean isAnagram(String s, String t) {
4        if(s.length()!=t.length()) return false;
5        int[] sFreq = new int[26];
6        int[] tFreq = new int[26];
7
8        for(int i=0;i<s.length();i++){
9            char c1 = s.charAt(i);
10            char c2 = t.charAt(i);
11            sFreq[c1-'a']++;
12            tFreq[c2-'a']++;
13        }
14
15        return Arrays.equals(sFreq,tFreq) ? true:false;
16    }
17}