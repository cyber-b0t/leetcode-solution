// Last updated: 7/31/2026, 7:01:06 PM
1class Solution {
2
3    public int eatingTime(int[] piles , int k){
4        int h=0;
5        for(int i=0;i<piles.length;i++){
6            int n = piles[i];
7            h+=(n+k-1)/k;
8        }
9
10        return h;
11    }
12    public int minEatingSpeed(int[] piles, int h) {
13        int L = 1;
14        int R = Arrays.stream(piles).max().getAsInt();
15
16        while(L<R){
17            int mid = L+(R-L)/2;
18            int time = eatingTime(piles,mid);
19            if(time>h){
20                L = mid+1;
21            }else{
22                R = mid;
23            }
24        }
25
26        return L;
27    }
28}