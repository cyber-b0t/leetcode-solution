// Last updated: 8/5/2026, 3:33:31 AM
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3
4        HashMap<Integer,Integer> mpp = new HashMap<>();
5
6        for(int num:nums){
7            mpp.put(num,mpp.getOrDefault(num,0)+1);
8        }
9
10        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> mpp.get(a) - mpp.get(b));
11
12        for (int num : mpp.keySet()) {
13            pq.offer(num);
14
15            if (pq.size() > k) {
16                pq.poll();
17            }
18        }
19
20        int[] ans = new int[k];
21
22        for (int i = k - 1; i >= 0; i--) {
23            ans[i] = pq.poll();
24        }
25
26        return ans;
27
28
29
30
31
32
33    }
34}