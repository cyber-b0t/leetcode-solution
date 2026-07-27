// Last updated: 7/28/2026, 12:33:56 AM
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        Set<Integer> set = new HashSet<>();
4
5        for(int num:nums){
6            set.add(num);
7        }
8        int max=0;
9
10        for(int n:set){
11            if(!set.contains(n-1)){
12                int el=n;
13                int cnt=0;
14                while(set.contains(el)){
15                    cnt++;
16                    el++;
17                }
18                max = Math.max(max,cnt);
19            }
20        }
21
22        return max;
23    }
24}