// Last updated: 6/30/2026, 2:27:00 AM
1import java.util.Arrays;
2
3class Solution {
4    public List<Integer> findAnagrams(String s, String p) {
5        int L=0,R=p.length();
6
7        List<Integer> arr = new ArrayList<>();
8
9        if (s.length() < p.length()) return arr;
10        
11        int[] pFreq = new int[26];
12        int[] sFreq = new int[26];
13
14        
15        for(int i=0;i<p.length();i++){
16            pFreq[p.charAt(i)-'a']++;
17        }
18
19        for(int i=0;i<p.length();i++){
20            sFreq[s.charAt(i)-'a']++;
21        }
22
23        if(Arrays.equals(pFreq,sFreq)) arr.add(0);
24
25        for(int i=R;i<s.length();i++){
26            sFreq[s.charAt(L)-'a']--;
27            sFreq[s.charAt(i)-'a']++;
28            if(Arrays.equals(pFreq,sFreq)) arr.add(L+1);
29            L++;
30        }
31
32        return arr;
33    }
34}