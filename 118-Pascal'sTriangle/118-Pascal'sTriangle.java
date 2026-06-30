// Last updated: 6/30/2026, 1:36:44 PM
1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3        List<List<Integer>> ans = new ArrayList<>();
4
5        if(numRows==1){
6            List<Integer> arr = new ArrayList<>();
7            arr.add(1);
8            ans.add(arr);
9            return ans;
10        }
11
12        
13
14        for(int i=0;i<numRows;i++){
15            List<Integer> arr = new ArrayList<>();
16
17            if(i==0){
18                arr.add(1);
19                ans.add(arr);
20            }else if(i==1){
21                arr.add(1);
22                arr.add(1);
23                ans.add(arr);
24            }else{
25                arr.add(1);
26                int x=0,y=1;
27                while(y<i){
28                    int n = ans.get(i-1).get(x);
29                    int m = ans.get(i-1).get(y);
30
31                    int s = n+m;
32                    arr.add(s);
33                    x++;
34                    y++;
35                }
36
37                arr.add(1);
38                ans.add(arr);
39            }          
40        }
41
42        return ans;
43    }
44}