// Last updated: 11/8/2026, 5:48:43 PM
1class Solution {
2    public String genRLE(String s){
3        StringBuilder sb = new StringBuilder();
4
5        int counter = 0;
6        char c = s.charAt(0);
7
8        for(int i=0;i<s.length();i++){
9            char x = s.charAt(i);
10            
11            if(x!=c){
12                sb.append(counter);
13                sb.append(c);
14                c = x;
15                counter=1;
16            }else{
17                counter++;
18            }
19        }
20        sb.append(counter);
21        sb.append(c);
22
23        return sb.toString();
24
25    }
26    public String countAndSay(int n) {
27        String ans = "1";
28        for(int i=1;i<n;i++){
29            ans = genRLE(ans);
30        }
31
32        return ans;
33    }
34}