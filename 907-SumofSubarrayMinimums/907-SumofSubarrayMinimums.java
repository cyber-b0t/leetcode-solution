// Last updated: 7/24/2026, 6:54:49 PM
1class Solution {
2    int MOD = 1000000007;
3    public int[] pse(int[] arr){
4        Deque<Integer> st = new ArrayDeque<>();
5        int[] ans = new int[arr.length];
6
7        for(int i=0;i<arr.length;i++){
8            int n = arr[i];
9            while(!st.isEmpty() && arr[st.peek()]>=n){
10                st.pop();
11            }
12            if(st.isEmpty()){
13                ans[i] = -1;
14            }else{
15                ans[i] = st.peek();
16            }
17            st.push(i);
18        }
19
20        return ans;
21        
22    }
23    public int[] nse(int[] arr){
24        Deque<Integer> st = new ArrayDeque<>();
25        int[] ans = new int[arr.length];
26        for(int i=arr.length-1;i>=0;i--){
27
28            int n = arr[i];
29            
30            while(!st.isEmpty() && arr[st.peek()]>n){
31                st.pop();
32            }
33            if (st.isEmpty()) {
34                ans[i] = arr.length;
35            } else {
36                ans[i] = st.peek();
37            }
38            st.push(i);
39        }
40        return ans;
41    }
42
43    public int sumSubarrayMins(int[] arr) {
44        int[] nse = nse(arr);
45        int[] pse = pse(arr);
46
47        long cnt = 0;
48
49        for(int i = 0; i < arr.length; i++){
50
51            long left = i - pse[i];
52            long right = nse[i] - i;
53
54            long c = ((long) arr[i] * left % MOD) * right % MOD;
55
56            cnt = (cnt + c) % MOD;
57        }
58
59        return (int) cnt;
60    }
61
62}