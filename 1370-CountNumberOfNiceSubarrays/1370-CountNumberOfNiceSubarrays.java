// Last updated: 6/24/2026, 8:53:48 PM
class Solution {
    public int kOdds(int[] nums , int k){
        int cnt=0;
        int oc=0;
        int L=0;

        for(int R=0;R<nums.length;R++){
            int n = nums[R];
            if(n%2==1) oc++;

            while(oc>k && L<=R){
                int x = nums[L];
                if(x%2==1){
                    oc--;
                }
                L++;
            }
            cnt += R-L+1;
        }

        return cnt;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return kOdds(nums,k) - kOdds(nums,k-1);
    }
}