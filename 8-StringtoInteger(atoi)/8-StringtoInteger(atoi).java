// Last updated: 6/29/2026, 7:39:14 PM
1class Solution {
2    public int myAtoi(String s) {
3        s = s.trim();
4        if(s.isEmpty()) return 0;
5        char sign = s.charAt(0);
6        int L=0;
7
8        if (sign=='-'){
9            L++;
10        }else if(sign=='+'){
11            L++;
12        }
13
14        int num=0;
15
16        while(L<s.length()){
17            int c = s.charAt(L)-'0';
18            if(0<=c && c<=9){
19                if (num > (Integer.MAX_VALUE - c) / 10) {
20                    if (sign == '-') {
21                        return Integer.MIN_VALUE;
22                    } else {
23                        return Integer.MAX_VALUE;
24                    }
25                }
26                num = num*10+c;
27            }else{
28                break;
29            }
30            L++;
31        }
32
33        if(sign=='-') return 0-num;
34
35        return num;
36    }
37}