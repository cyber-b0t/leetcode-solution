// Last updated: 7/21/2026, 3:38:51 AM
1class Solution {
2    public void backtrack(int[] nums,List<Integer> arr,List<List<Integer>> res){
3        if(arr.size()==nums.length){
4            res.add(new ArrayList<>(arr));
5            return;
6        }
7
8        for(int i=0;i<nums.length;i++){
9            if(arr.contains(nums[i])) continue;
10
11            arr.add(nums[i]);
12            backtrack(nums,arr,res);
13            arr.remove(arr.size()-1);
14        }   
15    }
16    public List<List<Integer>> permute(int[] nums) {
17        List<List<Integer>> res = new ArrayList<>();
18        backtrack(nums,new ArrayList<>(),res);
19        return res;
20    }
21}