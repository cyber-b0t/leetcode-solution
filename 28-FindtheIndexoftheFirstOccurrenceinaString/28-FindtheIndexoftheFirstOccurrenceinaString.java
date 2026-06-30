// Last updated: 6/30/2026, 9:49:25 PM
1class Solution {
2    public int strStr(String haystack, String needle) {
3        
4        for(int i=0;i<=haystack.length()-needle.length();i++){
5            int j=0;
6            while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j)){
7                j++;
8            }
9
10            if(j==needle.length()){
11                return i;
12            }
13        }
14        return -1;
15    }
16}