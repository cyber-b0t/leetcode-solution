// Last updated: 11/5/2026, 11:55:15 PM
1class Solution {
2    public int totalFruit(int[] fruits) {
3        HashMap<Integer,Integer> freq = new HashMap<>();
4
5        int L=0;
6        int winSize=0;
7
8        for(int R=0;R<fruits.length;R++){
9            int n = fruits[R];
10            freq.put(n,freq.getOrDefault(n,0)+1);
11
12            while(freq.size()>2){
13                int x = fruits[L];
14                freq.put(x,freq.get(x)-1);
15                
16                if(freq.get(x)==0){
17                    freq.remove(x);
18                }
19                L++;
20            }
21
22            winSize = Math.max(winSize,R-L+1);
23        }
24
25        return winSize;
26    }
27}