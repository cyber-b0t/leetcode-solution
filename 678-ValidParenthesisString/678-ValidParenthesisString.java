// Last updated: 7/27/2026, 2:55:22 AM
1class Solution {
2    Boolean[][] dp;
3    public boolean backtrack(String s,int idx,int openCount){
4
5        
6        if(idx==s.length() && openCount==0){
7            return true;
8        }
9        if(idx==s.length() && openCount>0){
10            return false;
11        }
12        if(openCount<0){
13            return false;
14        }
15
16        if(dp[idx][openCount]!=null){
17            return dp[idx][openCount];
18        }
19
20        char c = s.charAt(idx);
21
22        if(c=='*'){
23            dp[idx][openCount] = (backtrack(s,idx+1,openCount+1) || backtrack(s,idx+1,openCount-1) || backtrack(s,idx+1,openCount));
24            
25            return dp[idx][openCount];
26        }else if(c=='('){
27            dp[idx][openCount] = backtrack(s,idx+1,openCount+1);
28            return dp[idx][openCount];
29        }else{
30            dp[idx][openCount] = backtrack(s,idx+1,openCount-1);
31            return dp[idx][openCount];
32        }
33    }
34    public boolean checkValidString(String s) {
35        dp = new Boolean[s.length()+1][s.length()+1];
36        return backtrack(s,0,0);
37    }
38}