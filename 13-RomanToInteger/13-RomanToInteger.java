// Last updated: 6/30/2026, 3:01:11 AM
class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> mpp = new HashMap<>();

        mpp.put('I', 1);
        mpp.put('V', 5);
        mpp.put('X', 10);
        mpp.put('L', 50);
        mpp.put('C', 100);
        mpp.put('D', 500);
        mpp.put('M', 1000);

        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            int curr = mpp.get(s.charAt(i));

            if (i + 1 < s.length() && curr < mpp.get(s.charAt(i + 1))) {
                ans -= curr;
            } else {
                ans += curr;
            }
        }

        return ans;
    }
}