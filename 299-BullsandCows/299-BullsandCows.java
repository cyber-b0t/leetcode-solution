// Last updated: 7/17/2026, 6:22:41 PM
1class Solution {
2
3    public int countBulls(String s,String g){
4        int cnt=0;
5
6        for(int i=0;i<s.length();i++){
7            char x = s.charAt(i);
8            char y = g.charAt(i);
9
10            if(x==y){
11                cnt++;
12            }
13        }
14
15        return cnt;
16    }
17
18    public int countCows(String s, String g){
19        HashMap<Character,Integer> mpp = new HashMap<>();
20        int cnt=0;
21
22        for(int i=0;i<s.length();i++){
23            char c = s.charAt(i);
24            mpp.put(c,mpp.getOrDefault(c,0)+1);
25        }
26
27        for(int i=0;i<g.length();i++){
28            char c=g.charAt(i);
29            if(mpp.containsKey(c)){
30                cnt++;
31                mpp.put(c,mpp.getOrDefault(c,0)-1);
32                if(mpp.get(c)==0){
33                    mpp.remove(c);
34                }
35            }
36        }
37
38        return cnt;
39    }
40    public String getHint(String secret, String guess) {
41        StringBuilder sb = new StringBuilder();
42
43        int bulls = countBulls(secret,guess);
44        int cows = countCows(secret,guess) - bulls;
45
46        sb.append(bulls);
47        sb.append('A');
48        sb.append(cows);
49        sb.append('B');
50
51        return sb.toString();
52    }
53}