// Last updated: 7/10/2026, 8:05:49 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        HashMap<Integer,Integer> freq = new HashMap<>();
4        int[] arr = new int[2];
5
6        for(int i=0;i<nums.length;i++){
7            int n = nums[i];
8            int need = target-n;
9            
10            if(freq.containsKey(need)){
11                arr[0] = i;
12                arr[1] = freq.get(need);
13                break;
14            }else{
15                freq.put(n,i);
16            }
17        }
18
19        return arr;
20    }
21}