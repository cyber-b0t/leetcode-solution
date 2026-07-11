// Last updated: 7/11/2026, 6:59:58 PM
1class Solution {
2    public int majorityElement(int[] nums) {
3        int el=nums[0];
4        int cnt=1;
5        
6        for(int i=1;i<nums.length;i++){
7            if(el==nums[i]){
8                cnt++;
9            }else{
10                cnt--;
11                if(cnt==0){
12                    el=nums[i];
13                    cnt=1;
14                }
15            }
16        }
17        
18        return el;
19    }
20}