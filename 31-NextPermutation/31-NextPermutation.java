// Last updated: 6/30/2026, 3:01:08 AM
class Solution {
    public void reverse(int[] arr,int L,int R){
        while(L<R){
            int temp = arr[R];
            arr[R] = arr[L];
            arr[L] = temp;

            L++;
            R--;
        }
    }
    public void nextPermutation(int[] nums) {

        int pivot=-1;

        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                pivot=i-1;
                break;
            }
        }

        if(pivot==-1) {
            reverse(nums,0,nums.length-1);
            return;
        }
    
        for(int i=nums.length-1;i>=pivot;i--){
            if(nums[i]>nums[pivot]){
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
                break;
            }
        }

        reverse(nums,pivot+1,nums.length-1);
    }
}