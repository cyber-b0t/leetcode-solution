// Last updated: 11/9/2026, 3:20:24 PM
1class Solution {
2    public int largestInteger(int num) {
3        ArrayList<Integer> odd = new ArrayList<>();
4        ArrayList<Integer> even = new ArrayList<>();
5
6        int n = num;
7
8        while(n>0){
9            int d = n%10;
10            if(d%2==0){
11                even.add(d);
12            }else{
13                odd.add(d);
14            }
15            n = n/10;
16        }
17
18        Collections.sort(odd, Collections.reverseOrder());
19        Collections.sort(even, Collections.reverseOrder());
20
21        int ans=0;
22
23        String s = String.valueOf(num);
24
25        for(int i=0;i<s.length();i++){
26            int x = s.charAt(i)-'0';
27            if(x%2==0){
28                ans = ans*10+even.remove(0);
29            }else{
30                ans = ans*10+odd.remove(0);
31            }
32        }
33
34        return ans;
35    }
36}