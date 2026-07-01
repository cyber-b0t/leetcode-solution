// Last updated: 7/2/2026, 12:47:12 AM
1class Solution {
2    public String largestOddNumber(String num) {
3        
4        for(int i=num.length()-1;i>=0;i--){
5            char c = num.charAt(i);
6            if ((c-'0')%2==1){
7                return num.substring(0,i+1);
8            }
9        }
10
11        return "";
12    }
13}