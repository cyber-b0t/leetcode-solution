// Last updated: 8/7/2026, 3:19:13 AM
1class Solution {
2    public void backtrack(int n,int open,int close,String s,List<String> ans ){
3        if(open==n && close==n){
4            ans.add(s);
5            return;
6        }
7
8        if(open<n){
9            backtrack(n,open+1,close,s+'(',ans);
10        }
11
12        if(close<open){
13            backtrack(n,open,close+1,s+')',ans);
14        }
15    }
16    public List<String> generateParenthesis(int n) {
17        List<String> ans = new ArrayList<>();
18        backtrack(n,0,0,"",ans);
19        return ans;
20    }
21}