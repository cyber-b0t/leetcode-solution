// Last updated: 6/24/2026, 8:53:50 PM
class Solution {
    public int atMost(int[] nums, int k) {

    if (k < 0) {
        return 0;
    }

    int left = 0;
    int windowSum = 0;
    int total = 0;

    for (int right = 0; right < nums.length; right++) {
        windowSum += nums[right];

        while (windowSum > k) {
            windowSum -= nums[left];
            left++;
        }

        total += (right - left + 1);
    }

    return total;
    }
    
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums,goal) - atMost(nums,goal-1);
    }
}