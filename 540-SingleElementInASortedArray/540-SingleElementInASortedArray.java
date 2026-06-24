// Last updated: 6/24/2026, 8:53:58 PM
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int a=0;
        for(int n:nums){
            a = a^n;
        }

        return a;
    }
}