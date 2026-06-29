// Last updated: 6/30/2026, 3:00:39 AM
import java.util.Arrays;
class Solution {
    public int maxVowels(String s, int k) {
        List<Character> vowels = Arrays.asList('a','e','i','o','u');

        int L=0;
        int max=0;
        int curr=0;

        for(int i=0;i<k;i++){
            if(vowels.contains(s.charAt(i))){
                curr++;
            }
        }

        max=curr;

        for(int R=k;R<s.length();R++){
            if(vowels.contains(s.charAt(R))){
                curr++;
            }

            if(vowels.contains(s.charAt(L))){
                curr--;
            }

            max = Math.max(curr,max);

            L++;
        }

        return max;
    }
}