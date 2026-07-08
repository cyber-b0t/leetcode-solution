// Last updated: 7/8/2026, 8:09:53 PM
1class Solution {
2    public String decodeString(String s) {
3        Stack<String> st_string = new Stack<>();
4        Stack<Integer> st_int = new Stack<>();
5        int k = 0;
6        String ns = new String();
7
8        for(int i=0;i<s.length();i++){
9            char c = s.charAt(i);
10
11            if(c>='0' && c<='9'){
12                k = k*10+(c-'0');
13            }else if(c=='['){
14                st_int.push(k);
15                st_string.push(ns);
16                k=0;
17                ns="";
18            }else if(c==']'){
19                String gs = st_string.pop();
20                int n = st_int.pop();
21
22                StringBuilder sb = new StringBuilder();
23                sb.append(gs);
24                
25                for(int j=0;j<n;j++){
26                    sb.append(ns);
27                }
28                ns = sb.toString();
29            }else{
30                ns = ns + Character.toString(c);
31            }
32        }
33
34        return ns;
35    }
36}