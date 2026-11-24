// Last updated: 11/24/2026, 7:37:01 PM
1class Solution {
2    public int eatingTime(int[] piles,int speed){
3        int time=0;
4
5        for(int i=0;i<piles.length;i++){
6            time += (piles[i] + speed - 1) / speed;
7        }
8        return time;
9    }
10    public int minEatingSpeed(int[] piles, int h) {
11        int L=1;
12        int R=Arrays.stream(piles).max().getAsInt();
13
14        while(L<R){
15            int mid = L+(R-L)/2;
16
17            int time = eatingTime(piles,mid);
18
19            if(time<=h){
20                R = mid;
21            }else{
22                L = mid+1;
23            }
24        }
25
26        return L;
27    }
28}