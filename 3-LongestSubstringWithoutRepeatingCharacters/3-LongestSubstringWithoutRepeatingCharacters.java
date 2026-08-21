// Last updated: 8/22/2026, 3:07:02 AM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        HashMap<Character,Integer> mpp = new HashMap<>();
4        int L=0;
5        int max=0;
6        for(int R=0;R<s.length();R++){
7            char c = s.charAt(R);
8            if(mpp.containsKey(c)){
9                L = Math.max(mpp.get(c)+1,L);
10            }
11            mpp.put(c,R);
12            max = Math.max(max,R-L+1);
13        }
14
15        return max;
16    }
17}