// Last updated: 7/7/2026, 9:01:28 PM
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        ArrayList<ArrayList<Integer>> arr = new ArrayList();
4        for(int i = 0; i <= nums.length; i++){
5            arr.add(new ArrayList<>());
6        }
7        int[] ans = new int[k];
8
9        HashMap<Integer,Integer> mpp = new HashMap<>();
10
11        for(int num:nums){
12            mpp.put(num,mpp.getOrDefault(num,0)+1);
13        }
14
15        for(Map.Entry<Integer,Integer> entry : mpp.entrySet()){
16            int num = entry.getKey();
17            int freq = entry.getValue();
18
19            arr.get(freq).add(num);
20        }
21
22        int x=0;
23
24        for(int i=arr.size()-1;i>=0;i--){
25            ArrayList<Integer> n = arr.get(i);
26
27            if(x<k && n.size()!=0){
28                for(int j=0;j<n.size();j++){
29                    int d = n.get(j);
30                    ans[x] = d;
31                    x++;
32
33                    if(x == k) return ans;
34                }
35            }
36        }
37
38        return ans;
39    }
40}