// Last updated: 6/24/2026, 8:54:17 PM
class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int min=Integer.MAX_VALUE;

        int res=0;

        for(int i=0;i<prices.length;i++){
            max = Math.max(max,prices[i]);
            if(prices[i]<min){
                min=prices[i];
                max=0;
            }

            res = Math.max(res,max-min);
        }

        return res==0?0:res;
    }
}