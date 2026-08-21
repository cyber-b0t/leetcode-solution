// Last updated: 8/22/2026, 3:22:52 AM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int min = Integer.MAX_VALUE;
4        int max = Integer.MIN_VALUE;
5
6        int profit = 0;
7
8        for(int i=0;i<prices.length;i++){
9            int n = prices[i];
10            if(n<min){
11                min = n;
12                max = -1;
13            }else{
14                max = Math.max(max,n);
15                profit = Math.max(profit,max-min);
16            }
17        }
18
19        return profit;
20    }
21}