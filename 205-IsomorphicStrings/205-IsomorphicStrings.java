// Last updated: 7/1/2026, 8:55:36 PM
1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        HashMap<Character, Character> StoT = new HashMap<>();
4        HashMap<Character, Character> TtoS = new HashMap<>();
5
6        for (int i = 0; i < s.length(); i++) {
7            char c1 = s.charAt(i);
8            char c2 = t.charAt(i);
9
10            if (StoT.containsKey(c1)) {
11                if (StoT.get(c1) != c2) return false;
12            } else {
13                if (TtoS.containsKey(c2)){
14                    if (TtoS.get(c2) != c1) return false;
15                }
16            }
17            StoT.put(c1,c2);
18            TtoS.put(c2,c1);
19        }
20        return true;
21    }
22}