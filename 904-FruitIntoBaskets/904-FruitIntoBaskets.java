// Last updated: 11/28/2026, 5:43:09 PM
1class Solution {
2    public int totalFruit(int[] fruits) {
3        int L=0;
4        HashMap<Integer,Integer> mpp = new HashMap<>();
5        int ans=0;
6
7        for(int R=0;R<fruits.length;R++){
8            int n = fruits[R];
9
10            mpp.put(n,mpp.getOrDefault(n,0)+1);
11
12            while(mpp.size()>2){
13                int x = fruits[L];
14                mpp.put(x,mpp.get(x)-1);
15                if(mpp.get(x)==0){
16                    mpp.remove(x);
17                }
18                L++;
19            }
20
21            ans = Math.max(ans,R-L+1);
22
23        }
24
25        return ans;
26    }
27}