// Last updated: 6/24/2026, 8:53:56 PM
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int sum=0;
        int count=0;
        mpp.put(0,1);

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int need = sum-k;

            if(!mpp.containsKey(need)){
                mpp.put(sum,mpp.getOrDefault(sum,0)+1);
            }else{
                count+=mpp.get(need);
                mpp.put(sum,mpp.getOrDefault(sum,0)+1);
            }

        }

        return count;
    }
}