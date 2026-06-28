// Last updated: 6/28/2026, 8:43:10 PM
1class Solution {
2    public int maxScore(int[] cardPoints, int k) {  
3        int curr=0;
4
5        for(int i=0;i<k;i++){
6            curr+=cardPoints[i];
7        }
8
9        int max=curr;
10        int L=k-1;
11        int R=cardPoints.length-1;
12        while(L>=0){
13            curr-=cardPoints[L];
14            curr+=cardPoints[R];
15            max = Math.max(curr,max);
16            L--;
17            R--;
18        }
19        return max;
20    }
21}