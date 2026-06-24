// Last updated: 6/25/2026, 2:34:15 AM
1import java.util.Arrays;
2
3class Solution {
4    public List<List<Integer>> fourSum(int[] nums, int target) {
5        Arrays.sort(nums);
6        List<List<Integer>> ans = new ArrayList<>();
7
8        for(int i=0;i<nums.length;i++){
9            if(i>0 && nums[i]==nums[i-1]) continue;
10
11            for(int j=i+1;j<nums.length;j++){
12                if(j>i+1 && nums[j]==nums[j-1]) continue;
13                int k=j+1,l=nums.length-1;
14                while(k<l){
15                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
16                    if(sum<target){
17                        k++;
18                    }else if(sum>target){
19                        l--;
20                    }else{
21                        List<Integer> quad = new ArrayList<>();
22                        quad.add(nums[i]);
23                        quad.add(nums[j]);
24                        quad.add(nums[k]);
25                        quad.add(nums[l]);
26
27                        ans.add(quad);
28                        k++;
29                        l--;
30                        while(k<l && nums[k]==nums[k-1]) k++;
31                        while(k<l && nums[l]==nums[l+1]) l--;
32                    }
33                }
34            }
35        }
36        return ans;
37    }
38}