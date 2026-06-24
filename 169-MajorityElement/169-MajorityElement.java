// Last updated: 6/24/2026, 8:54:09 PM
class Solution {
    public int majorityElement(int[] nums) {
        int el=nums[0];
        int count=0;

        for(int i=0;i<nums.length;i++){
            if(el==nums[i]){
                count++;
            }else{
                count--;
                if(count==0){
                    el = nums[i];
                    count++;
                }
            }
        }

        return el;
    }
}