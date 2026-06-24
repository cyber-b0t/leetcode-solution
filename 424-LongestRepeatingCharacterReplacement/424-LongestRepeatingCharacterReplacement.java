// Last updated: 6/24/2026, 8:54:02 PM
class Solution {
    public int characterReplacement(String s, int k){
        int[] freq = new int[26];
        int L=0;
        int R=0;

        int maxFreq=0; 
        int max=0;

        while(R<s.length()){
            char c = s.charAt(R);
            freq[c-'A']++;
            maxFreq = Math.max(maxFreq,freq[c-'A']);

            int winSize = R-L+1;

            if(winSize-maxFreq>k){
                char x = s.charAt(L);
                freq[x-'A']--;
                L++;
            }
            max = Math.max(max,R-L+1);
            R++;
        }

        return max;
    }
}