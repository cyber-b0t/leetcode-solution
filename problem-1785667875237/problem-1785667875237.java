// Last updated: 8/2/2026, 4:21:15 PM
1class Solution {
2    public int myAtoi(String s) {
3        int i=0;
4        boolean isNegative=false;
5
6        while(i<s.length() && s.charAt(i)==' '){
7            i++;
8        }
9
10        if (i == s.length()) {
11            return 0;
12        }
13        
14        if(s.charAt(i)=='-'){
15            isNegative=true;
16            i++;
17        }else if(s.charAt(i)=='+'){
18            i++;
19        }
20
21        while(i<s.length() && s.charAt(i)=='0'){
22            i++;
23        }
24
25        long num=0;
26
27        while(i<s.length() && '0'<=s.charAt(i) && s.charAt(i)<='9'){
28            num = num*10 + s.charAt(i)-'0';
29            if(num>Integer.MAX_VALUE){
30                return isNegative?Integer.MIN_VALUE:Integer.MAX_VALUE;
31            }
32            i++;
33        }
34
35        return isNegative?(int)-num:(int)num;
36    }
37}