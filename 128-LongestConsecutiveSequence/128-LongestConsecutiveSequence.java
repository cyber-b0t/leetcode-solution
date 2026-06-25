// Last updated: 6/26/2026, 2:52:43 AM
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        HashSet<Integer> set = new HashSet<>();
4
5        for(int i=0;i<nums.length;i++){
6            set.add(nums[i]);
7        }
8
9        int len=0;
10
11        for(int i:set){
12            if(!set.contains(i-1)){
13                int L = 0;
14                int n = i;
15                while(set.contains(n)){
16                    n++;
17                    L++;
18                }
19                len = Math.max(len,L);
20            }
21        }
22
23        return len;
24    }
25}