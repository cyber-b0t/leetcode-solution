// Last updated: 6/30/2026, 1:36:28 AM
1class Solution {
2    public int romanToInt(String s) {
3        HashMap<Character, Integer> mpp = new HashMap<>();
4
5        mpp.put('I', 1);
6        mpp.put('V', 5);
7        mpp.put('X', 10);
8        mpp.put('L', 50);
9        mpp.put('C', 100);
10        mpp.put('D', 500);
11        mpp.put('M', 1000);
12
13        int ans = 0;
14
15        for (int i = 0; i < s.length(); i++) {
16            int curr = mpp.get(s.charAt(i));
17
18            if (i + 1 < s.length() && curr < mpp.get(s.charAt(i + 1))) {
19                ans -= curr;
20            } else {
21                ans += curr;
22            }
23        }
24
25        return ans;
26    }
27}