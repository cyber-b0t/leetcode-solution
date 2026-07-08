// Last updated: 7/8/2026, 5:03:06 PM
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> st = new Stack<>();
4
5        for(int i=0;i<s.length();i++){
6            char c = s.charAt(i);
7            if(c=='(' || c=='{' || c=='['){
8                st.push(c);
9            }else{
10                if (st.isEmpty()) return false;
11                char top = st.pop();
12                if (c == ')' && top == '(') {
13                } else if (c == '}' && top == '{') {
14                } else if (c == ']' && top == '[') {
15                } else {
16                    return false;
17                }
18            }
19        }
20
21        return st.isEmpty();
22    }
23}