// Last updated: 6/24/2026, 8:53:42 PM
class Solution {
    public boolean consecutiveSetBits(int n) {
        int pairs = 0;
        int prev = 0;

        while (n > 0) {
            int b = n & 1;

            if (prev == 1 && b == 1) {
                pairs++;
            }

            prev = b;
            n >>= 1;
        }

        return pairs == 1;
    }
}