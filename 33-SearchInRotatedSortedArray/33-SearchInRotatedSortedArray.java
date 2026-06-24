// Last updated: 6/24/2026, 8:54:30 PM
class Solution {
    public int search(int[] nums, int target) {
        int L = 0, R = nums.length - 1;

        while (L <= R) {
            int mid = L + (R - L) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[L] <= nums[mid]) {
                if (nums[L] <= target && target < nums[mid]) {
                    R = mid - 1;
                } else {
                    L = mid + 1;
                }
            }else {
                if (nums[mid] < target && target <= nums[R]) {
                    L = mid + 1;
                } else {
                    R = mid - 1;
                }
            }
        }

        return -1;
    }
}