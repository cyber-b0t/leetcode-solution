// Last updated: 8/6/2026, 3:03:33 AM
1class Solution {
2    public void backtrack(String digits,int idx, String[] map, List<String> ans, String s){
3        if(s.length()==digits.length()){
4            ans.add(s);
5            return;
6        }
7        if(idx==digits.length()){
8            return;
9        }
10
11        int c = digits.charAt(idx)-'0';
12
13        for(int i=0;i<map[c].length();i++){
14            backtrack(digits,idx+1,map,ans,s+map[c].charAt(i));
15        }
16    }
17    public List<String> letterCombinations(String digits) {
18        
19        String[] map = {
20            "",     // 0
21            "",     // 1
22            "abc",  // 2
23            "def",  // 3
24            "ghi",  // 4
25            "jkl",  // 5
26            "mno",  // 6
27            "pqrs", // 7
28            "tuv",  // 8
29            "wxyz"  // 9
30        };
31
32        List<String> ans = new ArrayList<>();
33
34        if (digits.length() == 0) return ans;
35
36
37        backtrack(digits,0,map,ans,"");
38
39        return ans;
40    }
41}