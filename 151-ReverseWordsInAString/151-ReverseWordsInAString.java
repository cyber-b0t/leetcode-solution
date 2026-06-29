// Last updated: 6/30/2026, 3:00:55 AM
class Solution {
    public String reverseWords(String s) {

        ArrayList<String> arr = new ArrayList<>();
        int R = s.length() - 1;

        StringBuilder sb = new StringBuilder();

        while (R >= 0) {
            char c = s.charAt(R);

            if (c != ' ') {
                sb.append(c);
            } else {
                if (sb.length() > 0) {
                    arr.add(sb.reverse().toString());
                    sb.setLength(0);
                }
            }
            R--;
        }

        if (sb.length() > 0) {
            arr.add(sb.reverse().toString());
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < arr.size(); i++) {
            result.append(arr.get(i));
            if (i != arr.size() - 1) {
                result.append(' ');
            }
        }

        return result.toString();
    }
}