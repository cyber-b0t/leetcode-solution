// Last updated: 7/13/2026, 12:46:03 AM
1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3        if(s2.length()<s1.length()) return false;
4        int[] s1_freq = new int[26];
5
6        for(int i=0;i<s1.length();i++){
7            char c = s1.charAt(i);
8
9            s1_freq[c-'a']++;
10        }
11
12        int L=0;
13        int[] s2_freq = new int[26];
14
15        for(int R=0;R<s1.length();R++){
16            int c=s2.charAt(R);
17            s2_freq[c-'a']++;
18        }
19
20        if(Arrays.equals(s1_freq,s2_freq)) return true;
21
22        for(int R=s1.length();R<s2.length();R++){
23            char x = s2.charAt(L);
24            char c = s2.charAt(R);
25            s2_freq[x-'a']--;
26            s2_freq[c-'a']++;
27
28            if(Arrays.equals(s1_freq,s2_freq)){
29                return true;
30            }
31            L++;
32        }
33
34        return false;
35
36    }
37}