// Last updated: 6/24/2026, 8:54:06 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1=0;
        int cnt1=0;

        int c2=0;
        int cnt2=0;

        for(int i=0;i<nums.length;i++){
            if(c1==nums[i]){
                cnt1++;
            }else if(c2==nums[i]){
                cnt2++;
            }else if(cnt1==0){    
                c1 = nums[i];
                cnt1 = 1;
            }else if(cnt2==0){
                c2 = nums[i];
                cnt2 = 1;
            }else{
                cnt1--;
                cnt2--;
            }
        }
        List<Integer> result = new ArrayList<>();

        cnt1 = 0; cnt2 = 0;
        for (int num : nums) {
            if (num == c1) cnt1++;
            else if (num == c2) cnt2++;
        }
        
        if (cnt1 > nums.length / 3) result.add(c1);
        if (cnt2 > nums.length / 3) result.add(c2);

        return result;
    }
}
