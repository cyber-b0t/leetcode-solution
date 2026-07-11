// Last updated: 7/11/2026, 7:49:05 PM
1class Solution {
2    public boolean backspaceCompare(String s, String t) {
3        Stack<Character> st4s = new Stack<>();
4        Stack<Character> st4t = new Stack<>();
5        
6        // StringBuilder sb1 = new StringBuilder();
7        // StringBuilder sb2 = new StringBuilder();
8
9        for(int i=0;i<s.length();i++){
10            char c = s.charAt(i);
11            if(c=='#' && !st4s.isEmpty()){
12                st4s.pop();
13            }else{
14                if(c!='#') st4s.push(c);
15            }
16        }
17
18        for(int i=0;i<t.length();i++){
19            char c = t.charAt(i);
20            if(c=='#' && !st4t.isEmpty()){
21                st4t.pop();
22            }else{
23                if(c!='#') st4t.push(c);
24                
25            }
26        }
27
28        return st4s.equals(st4t);
29    }
30}