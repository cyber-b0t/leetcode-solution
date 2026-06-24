// Last updated: 6/24/2026, 8:54:21 PM
class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int j=0;
        int k=nums.length-1;

        while(j<=k){
            if(nums[j]==0){
                int temp = nums[i];
                nums[i] = 0;
                nums[j] = temp;
                i++;
                j++;
            }else if(nums[j]==1){
                j++;
            }else{
                int temp = nums[k];
                nums[k] = 2;
                nums[j] = temp;
                k--;
            }
        }
    }
}