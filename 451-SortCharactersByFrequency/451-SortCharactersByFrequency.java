// Last updated: 7/2/2026, 4:54:01 PM
1class Solution {
2    public String frequencySort(String s) {
3        Map<Character,Integer> mpp = new HashMap<>();
4
5        for(int i=0;i<s.length();i++){
6            char c = s.charAt(i);
7            mpp.put(c,mpp.getOrDefault(c,0)+1);
8        }
9
10        List<Map.Entry<Character, Integer>> list = new ArrayList<>(mpp.entrySet());
11
12        list.sort((e1, e2) -> e2.getValue() - e1.getValue());
13
14        StringBuilder sb = new StringBuilder();
15
16        for (Map.Entry<Character, Integer> entry : list) {
17            char ch = entry.getKey();
18            int freq = entry.getValue();
19
20            for (int i = 0; i < freq; i++) {
21                sb.append(ch);
22            }
23        }
24
25        return sb.toString();
26
27    }
28}