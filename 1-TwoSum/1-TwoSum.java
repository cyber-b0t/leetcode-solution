// Last updated: 6/24/2026, 8:54:39 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mpp = new HashMap<>();

        int[] ans = new int[2];

        for(int i=0;i<nums.length;i++){
            int need = target-nums[i];

            if(!mpp.containsKey(need)){
                mpp.put(nums[i],i);
            }else{
                ans[0] = mpp.get(need);
                ans[1] = i;
                break;
            }
        }

        return ans;
    }
}