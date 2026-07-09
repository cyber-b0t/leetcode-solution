// Last updated: 7/9/2026, 6:45:54 PM
1class Solution {
2    public int characterReplacement(String s, int k) {
3        HashMap<Character,Integer> mpp = new HashMap<>();
4        int maxFreq=0;
5        int maxLen=0;
6        int L=0;
7        for(int R=0;R<s.length();R++){
8            char c = s.charAt(R);
9            mpp.put(c,mpp.getOrDefault(c,0)+1);
10            maxFreq = Math.max(maxFreq,mpp.get(c));
11            int currLen = R-L+1; 
12            while(currLen-maxFreq>k){
13                mpp.put(s.charAt(L),mpp.getOrDefault(s.charAt(L),0)-1);
14                L++;
15                currLen = R-L+1;
16            }
17
18            maxLen = Math.max(maxLen,currLen);
19        }
20
21        return maxLen;
22    }
23}