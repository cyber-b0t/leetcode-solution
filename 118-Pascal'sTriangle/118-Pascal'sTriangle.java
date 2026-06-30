// Last updated: 6/30/2026, 1:37:11 PM
1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3        List<List<Integer>> ans = new ArrayList<>();
4
5        for(int i=0;i<numRows;i++){
6            List<Integer> arr = new ArrayList<>();
7
8            if(i==0){
9                arr.add(1);
10                ans.add(arr);
11            }else if(i==1){
12                arr.add(1);
13                arr.add(1);
14                ans.add(arr);
15            }else{
16                arr.add(1);
17                int x=0,y=1;
18                while(y<i){
19                    int n = ans.get(i-1).get(x);
20                    int m = ans.get(i-1).get(y);
21
22                    int s = n+m;
23                    arr.add(s);
24                    x++;
25                    y++;
26                }
27
28                arr.add(1);
29                ans.add(arr);
30            }          
31        }
32
33        return ans;
34    }
35}