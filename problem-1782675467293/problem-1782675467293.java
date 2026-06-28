// Last updated: 6/29/2026, 1:07:47 AM
1class Solution {
2    public String longestPalindrome(String s) {
3        int n = s.length();
4        if(n==1) return s;
5        int i=0;
6
7        int max=1;
8        int start=0;
9
10        while(i<2*n-1){
11            int L=0,R=0;
12            if(i%2==1){
13                L = i/2;
14                R = L+1;
15            }else{
16                L=i/2-1;
17                R=i/2+1;
18            }
19
20            while(L>=0 && R<=n-1 && s.charAt(L) == s.charAt(R)){
21                if(R - L + 1 > max){
22                    max = R-L+1;
23                    start=L;
24                }
25                L--;
26                R++;
27
28            }
29            i++;
30        }
31
32        return s.substring(start,start+max);
33    }
34}