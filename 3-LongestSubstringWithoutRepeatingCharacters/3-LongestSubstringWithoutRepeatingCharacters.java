// Last updated: 11/28/2026, 5:09:32 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int L=0;
4        HashMap<Character,Integer> mpp = new HashMap<>();
5        int len=0;
6
7        for(int R=0;R<s.length();R++){
8            char c = s.charAt(R);
9
10            while(mpp.containsKey(c)){
11                mpp.remove(s.charAt(L));
12                L++;
13            }
14
15            mpp.put(c,R);
16            len = Math.max(len,R-L+1);
17
18        }
19
20        return len;
21    }
22}