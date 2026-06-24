// Last updated: 6/24/2026, 8:53:49 PM
class Solution {
    public int kDiffInt(int[] nums,int k){
        int cnt=0;
        int L=0;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        
        for(int R=0;R<nums.length;R++){
            int n = nums[R];
            mpp.put(n,mpp.getOrDefault(n,0)+1);

            while(mpp.size()>k){
                int x = nums[L];
                mpp.put(x,mpp.getOrDefault(x,0)-1);

                if(mpp.get(x)==0){
                    mpp.remove(x);
                }

                L++;
            }

            cnt+=R-L+1;
        }

        return cnt;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
         return kDiffInt(nums,k) - kDiffInt(nums,k-1);
    }
}