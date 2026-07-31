// Last updated: 8/1/2026, 12:29:58 AM
1class Solution {
2    public int countBouquets(int[] bloomDay, int m, int k){
3        int count=0;
4        int g=0;
5        for(int i=0;i<bloomDay.length;i++){
6            if(bloomDay[i]<=m){
7                count++;
8                if(count==k){
9                    g++;
10                    count=0;
11                }
12            }else{
13                count=0;
14            }
15        }
16
17        return g;
18
19    }
20    public int minDays(int[] bloomDay, int m, int k) {
21        int L=0;
22        int R = Arrays.stream(bloomDay).max().getAsInt();
23
24        if ((long)m * k > bloomDay.length) {
25            return -1;
26        }
27
28        while(L<R){
29            int mid = L+(R-L)/2;
30
31            int bouquetCount = countBouquets(bloomDay, mid, k);
32
33            if(bouquetCount>=m){
34                R = mid;
35            }else{
36                L = mid+1;
37            }
38        }
39
40        return L;
41    }
42}