// Last updated: 7/21/2026, 7:58:47 PM
1class Solution {
2    public void backtrack(int[] candidates ,int start,int remaining , List<Integer> arr , List<List<Integer>> list){
3        if(remaining==0){
4            list.add(new ArrayList<>(arr));
5            return;
6        }
7        for (int i = start; i < candidates.length; i++) {
8            if(candidates[i]>remaining) continue;
9            
10            arr.add(candidates[i]);
11            backtrack(candidates,i,remaining - candidates[i], arr , list);
12            arr.remove(arr.size()-1);
13        }
14    }
15
16    public List<List<Integer>> combinationSum(int[] candidates, int target) {
17        List<List<Integer>> list = new ArrayList<>();
18        backtrack(candidates,0,target,new ArrayList<>(),list);
19        return list;
20    }
21}