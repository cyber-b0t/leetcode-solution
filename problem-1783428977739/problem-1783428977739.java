// Last updated: 7/7/2026, 6:26:17 PM
1class Solution {
2    int[][] dp;
3    public int findPaths(int i,int j,int m,int n){
4        if(i==m-1 && j==n-1) return 1;
5        if(i>=m || j>=n) return 0;
6        if(dp[i][j]!=-1) return dp[i][j];
7
8        int right = findPaths(i,j+1,m,n);
9        int down = findPaths(i+1,j,m,n);
10
11        return dp[i][j] = right+down;
12    }
13    public int uniquePaths(int m, int n) {
14        dp = new int[m][n];
15        for (int[] row : dp) Arrays.fill(row, -1);
16        return findPaths(0,0,m,n);
17    }
18}