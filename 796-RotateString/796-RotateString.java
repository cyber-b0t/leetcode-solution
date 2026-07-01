// Last updated: 7/2/2026, 3:18:20 AM
1class Solution {
2    public boolean rotateString(String s, String goal) {
3        if(s.length()!=goal.length()) return false;
4        String newString = s+s;
5
6        for(int i=0;i<s.length();i++){
7            int j=0;
8            while(j<goal.length() && newString.charAt(i+j)==goal.charAt(j)){
9                j++;
10            }
11
12            if(j==goal.length()){
13                return true;
14            }
15        }
16
17        return false;
18    }
19}