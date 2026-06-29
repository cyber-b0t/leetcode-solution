// Last updated: 6/30/2026, 3:00:50 AM
import java.util.Arrays;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int L=0,R=p.length();

        List<Integer> arr = new ArrayList<>();

        if (s.length() < p.length()) return arr;
        
        int[] pFreq = new int[26];
        int[] sFreq = new int[26];

        
        for(int i=0;i<p.length();i++){
            pFreq[p.charAt(i)-'a']++;
        }

        for(int i=0;i<p.length();i++){
            sFreq[s.charAt(i)-'a']++;
        }

        if(Arrays.equals(pFreq,sFreq)) arr.add(0);

        for(int i=R;i<s.length();i++){
            sFreq[s.charAt(L)-'a']--;
            sFreq[s.charAt(i)-'a']++;
            if(Arrays.equals(pFreq,sFreq)) arr.add(L+1);
            L++;
        }

        return arr;
    }
}