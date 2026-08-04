// Last updated: 8/5/2026, 1:43:22 AM
1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3        PriorityQueue<Integer> q = new PriorityQueue<>();
4
5        for(int i=0;i<k;i++){
6            q.add(nums[i]);
7        }
8
9        for(int i=k;i<nums.length;i++){
10            if(q.peek()<nums[i]){
11                q.poll();
12                q.add(nums[i]);
13            }
14        }
15
16        return q.peek();
17    }
18}