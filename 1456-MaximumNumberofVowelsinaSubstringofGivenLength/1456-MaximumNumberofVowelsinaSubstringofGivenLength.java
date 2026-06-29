// Last updated: 6/30/2026, 2:58:46 AM
1import java.util.Arrays;
2class Solution {
3    public int maxVowels(String s, int k) {
4        List<Character> vowels = Arrays.asList('a','e','i','o','u');
5
6        int L=0;
7        int max=0;
8        int curr=0;
9
10        for(int i=0;i<k;i++){
11            if(vowels.contains(s.charAt(i))){
12                curr++;
13            }
14        }
15
16        max=curr;
17
18        for(int R=k;R<s.length();R++){
19            if(vowels.contains(s.charAt(R))){
20                curr++;
21            }
22
23            if(vowels.contains(s.charAt(L))){
24                curr--;
25            }
26
27            max = Math.max(curr,max);
28
29            L++;
30        }
31
32        return max;
33    }
34}