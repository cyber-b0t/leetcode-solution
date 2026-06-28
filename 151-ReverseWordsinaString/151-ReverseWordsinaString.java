// Last updated: 6/29/2026, 2:24:39 AM
1class Solution {
2    public String reverseWords(String s) {
3
4        ArrayList<String> arr = new ArrayList<>();
5        int R = s.length() - 1;
6
7        StringBuilder sb = new StringBuilder();
8
9        while (R >= 0) {
10            char c = s.charAt(R);
11
12            if (c != ' ') {
13                sb.append(c);
14            } else {
15                if (sb.length() > 0) {
16                    arr.add(sb.reverse().toString());
17                    sb.setLength(0);
18                }
19            }
20            R--;
21        }
22
23        if (sb.length() > 0) {
24            arr.add(sb.reverse().toString());
25        }
26
27        StringBuilder result = new StringBuilder();
28
29        for (int i = 0; i < arr.size(); i++) {
30            result.append(arr.get(i));
31            if (i != arr.size() - 1) {
32                result.append(' ');
33            }
34        }
35
36        return result.toString();
37    }
38}