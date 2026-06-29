// Last updated: 6/30/2026, 1:35:37 AM
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
13        int num = 0;
14
15        int L = 0, R = 1;
16
17        while (R < s.length()) {
18            int a = mpp.get(s.charAt(L));
19            int b = mpp.get(s.charAt(R));
20
21            if (a < b) {
22                num += (b - a);
23                L += 2;
24                R += 2;
25            } else {
26                num += a;
27                L++;
28                R++;
29            }
30        }
31
32        // Process any remaining character
33        while (L < s.length()) {
34            num += mpp.get(s.charAt(L));
35            L++;
36        }
37
38        return num;
39    }
40}