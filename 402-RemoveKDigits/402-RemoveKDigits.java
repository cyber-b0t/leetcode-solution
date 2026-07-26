// Last updated: 7/26/2026, 5:31:53 PM
1class Solution {
2    public String removeKdigits(String num, int k) {
3        Stack<Integer> st = new Stack<>();
4
5        for(int i=0;i<num.length();i++){
6            int n = num.charAt(i)-'0';
7
8            while(!st.isEmpty() && st.peek()>n && k>0){
9                st.pop();
10                k--;
11            }
12            st.push(n);
13        }
14
15        while (k > 0) {
16            st.pop();
17            k--;
18        }
19
20        StringBuilder sb = new StringBuilder();
21        while(!st.isEmpty()){
22            sb.append(st.pop());
23        }
24
25        for(int i=sb.length()-1;i>=0;i--){
26            if(sb.charAt(i)!='0'){
27                break;
28            }
29            if(sb.charAt(i)=='0'){
30                sb.deleteCharAt(i);
31            }
32        }
33
34        if(sb.length()==0) return "0";
35
36        return sb.reverse().toString();
37    }
38}