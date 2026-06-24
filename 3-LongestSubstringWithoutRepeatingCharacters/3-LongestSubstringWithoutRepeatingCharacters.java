// Last updated: 6/24/2026, 8:54:35 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int L=0;
        int R=0;

        int max=0;

        HashMap<Character,Integer> mpp = new HashMap<>();

        while(R<s.length()){
            char c = s.charAt(R);
            if(!mpp.containsKey(c)){
                mpp.put(c,R);
                max = Math.max(max,R-L+1);
            }else{
                L = Math.max(mpp.get(c)+1,L);
                mpp.put(c,R);
                max = Math.max(max,R-L+1);
            }
            R++;
        }

        return max;


    }
}