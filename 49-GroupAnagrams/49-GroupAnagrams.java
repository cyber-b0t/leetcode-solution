// Last updated: 6/28/2026, 9:05:43 PM
1class Solution {
2    public String sortString(String s){
3        char[] chars = s.toCharArray();
4        Arrays.sort(chars);
5        String sorted = new String(chars);
6
7        return sorted;
8    }
9    public List<List<String>> groupAnagrams(String[] strs) {
10        List<List<String>> arr = new ArrayList<>();
11
12        HashMap<String,List<String>> mpp = new HashMap<>();
13
14        for (int i = 0; i < strs.length; i++) {
15            String s = sortString(strs[i]);
16
17            if (!mpp.containsKey(s)) {
18                mpp.put(s, new ArrayList<>());
19            }
20            mpp.get(s).add(strs[i]);
21        }
22
23        for (List<String> list : mpp.values()) {
24            arr.add(list);
25        }
26
27        return arr;
28    }
29}