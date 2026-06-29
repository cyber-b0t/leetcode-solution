// Last updated: 6/30/2026, 3:00:42 AM
class Solution {
    public int maxScore(int[] cardPoints, int k) {  
        int curr=0;

        for(int i=0;i<k;i++){
            curr+=cardPoints[i];
        }

        int max=curr;
        int L=k-1;
        int R=cardPoints.length-1;
        while(L>=0){
            curr-=cardPoints[L];
            curr+=cardPoints[R];
            max = Math.max(curr,max);
            L--;
            R--;
        }
        return max;
    }
}