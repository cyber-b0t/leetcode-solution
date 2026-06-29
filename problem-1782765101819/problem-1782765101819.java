// Last updated: 6/30/2026, 2:01:41 AM
1class Solution {
2    public String genKey(String s){
3        int[] freq = new int[26];
4
5        for (char c : s.toCharArray()) {
6            freq[c - 'a']++;
7        }
8
9        StringBuilder key = new StringBuilder();
10
11        for (int i = 0; i < 26; i++) {
12            key.append(freq[i]).append('#');
13        }
14
15        return key.toString();
16    }
17    public List<Integer> findAnagrams(String s, String p) {
18        int L=0,R=p.length()-1;
19        String pKey = genKey(p);
20
21        List<Integer> arr = new ArrayList<>();
22
23        while (R < s.length()) {
24            String substring = s.substring(L, R + 1);
25
26            if (genKey(substring).equals(pKey)) {
27                arr.add(L);
28            }
29
30            L++;
31            R++;
32        }
33
34        return arr;
35    }
36}