// Last updated: 7/2/2026, 4:58:51 PM
1class Solution {
2    public int maxDepth(String s) {
3        int max=0;
4        int depth=0;
5
6        for(int i=0;i<s.length();i++){
7            char c = s.charAt(i);
8
9            if(c=='('){
10                depth++;
11            }
12
13            if(c==')'){
14                depth--;
15            }
16
17            max = Math.max(max,depth);
18        }
19
20        return max;
21    }
22}