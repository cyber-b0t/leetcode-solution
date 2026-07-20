// Last updated: 7/21/2026, 2:59:18 AM
1class Solution {
2
3    public void backtrack(int[] nums,int idx,List<Integer> arr,List<List<Integer>> list){
4
5        if(idx==nums.length){
6            list.add(new ArrayList<>(arr));
7            return;
8        }
9
10        backtrack(nums,idx+1,arr,list);
11        arr.add(nums[idx]);
12        backtrack(nums,idx+1,arr,list);
13        arr.remove(arr.size()-1);
14    }
15    public List<List<Integer>> subsets(int[] nums) {
16        List<List<Integer>> list  = new ArrayList<>();
17        backtrack(nums,0,new ArrayList<>(),list);
18        return list;
19    }
20
21
22}