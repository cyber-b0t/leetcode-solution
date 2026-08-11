// Last updated: 8/12/2026, 2:38:53 AM
1class Solution {
2    Boolean[][] dp;
3    public boolean backtrack(String s , int idx , int openCount){
4        if(openCount<0) return false;
5        if(idx==s.length()){
6            return openCount==0;
7        }
8
9        if (dp[idx][openCount] != null){
10            return dp[idx][openCount];
11        }
12        
13        char c = s.charAt(idx);
14
15        if(c=='*'){
16            dp[idx][openCount] = backtrack(s,idx+1,openCount+1) || backtrack(s,idx+1,openCount) || backtrack(s,idx+1,openCount-1);
17            return dp[idx][openCount];
18        }
19        if(c=='('){
20            dp[idx][openCount] = backtrack(s,idx+1,openCount+1);
21            return dp[idx][openCount];
22        }
23        if(c==')'){
24            dp[idx][openCount] = backtrack(s,idx+1,openCount-1);
25            return dp[idx][openCount];
26        }
27
28        return false;
29    }
30    public boolean checkValidString(String s) {
31        dp = new Boolean[s.length() + 1][s.length() + 1];
32        return backtrack(s,0,0);
33    }
34}