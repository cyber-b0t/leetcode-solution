// Last updated: 7/8/2026, 10:45:33 AM
1class Solution {
2    public String sortVowels(String s) {
3         Map<Character, Integer> mpp = Map.ofEntries(
4            Map.entry('A', 0),
5            Map.entry('E', 1),
6            Map.entry('I', 2),
7            Map.entry('O', 3),
8            Map.entry('U', 4),
9            Map.entry('a', 5),
10            Map.entry('e', 6),
11            Map.entry('i', 7),
12            Map.entry('o', 8),
13            Map.entry('u', 9)
14        );
15
16        char[] vowels = {'A','E','I','O','U','a','e','i','o','u'};
17
18        int[] arr = new int[10];
19
20        for(int i=0;i<s.length();i++){
21            char c = s.charAt(i);
22            if(mpp.containsKey(c)){
23                int idx = mpp.get(c);
24                arr[idx]++;
25            }
26        }
27        
28        StringBuilder sb = new StringBuilder();
29        
30        for(int i=0;i<s.length();i++){
31            char c = s.charAt(i);
32            if(mpp.containsKey(c)){
33                for(int x=0;x<arr.length;x++){
34                    if(arr[x]!=0){
35                        sb.append(vowels[x]);
36                        arr[x]--;
37                        break;
38                    }
39                }
40            }else{
41                sb.append(c);
42            }
43        }
44
45        return sb.toString();
46    }
47}