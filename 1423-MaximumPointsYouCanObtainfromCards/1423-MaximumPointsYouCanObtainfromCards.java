// Last updated: 11/6/2026, 1:02:31 AM
1class Solution {
2    public int maxScore(int[] cardPoints, int k) {
3        int leftSum=0;
4        int x=k-1;
5
6        for(int i=0;i<k;i++){
7            leftSum+=cardPoints[i];
8        }
9
10        int maxSum=leftSum;
11
12        for(int i=cardPoints.length-1;i>cardPoints.length-1-k;i--){
13            leftSum = leftSum-cardPoints[x];
14            leftSum+=cardPoints[i];
15            maxSum = Math.max(maxSum,leftSum);
16            x--;
17        }
18
19        return maxSum;
20    }
21}