// Last updated: 11/7/2026, 5:40:58 PM
1class Solution {
2    private String s1,s2,s3;
3    private int m,n;
4    private Boolean[][] dp;
5
6    public boolean isInterleave(String s1, String s2, String s3) {
7        this.s1 = s1;
8        this.s2 = s2;
9        this.s3 = s3;
10        this.m = s1.length();
11        this.n = s2.length();
12
13        if(m+n != s3.length()) return false;
14
15        dp = new Boolean[m+1][n+1];
16
17        return solve(0,0,0);
18    }
19
20    public boolean solve(int i,int j,int k){
21        if(k==s3.length()){
22            return i==s1.length() && j==s2.length();
23        }
24
25        if(dp[i][j]!=null) return dp[i][j];
26
27        boolean x = false; 
28        boolean y = false;
29
30        if(i<s1.length() && s1.charAt(i)==s3.charAt(k)){
31            x = solve(i+1,j,k+1);
32        }
33
34        if(j<s2.length() && s2.charAt(j)==s3.charAt(k)){
35            y = solve(i,j+1,k+1);
36        }
37
38        dp[i][j] = x || y;
39
40        return x || y;
41    }
42}