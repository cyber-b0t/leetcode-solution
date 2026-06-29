// Last updated: 6/30/2026, 3:01:14 AM
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n==1) return s;
        int i=0;

        int max=1;
        int start=0;

        while(i<2*n-1){
            int L=0,R=0;
            if(i%2==1){
                L = i/2;
                R = L+1;
            }else{
                L=i/2-1;
                R=i/2+1;
            }

            while(L>=0 && R<=n-1 && s.charAt(L) == s.charAt(R)){
                if(R - L + 1 > max){
                    max = R-L+1;
                    start=L;
                }
                L--;
                R++;

            }
            i++;
        }

        return s.substring(start,start+max);
    }
}