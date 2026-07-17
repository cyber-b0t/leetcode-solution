// Last updated: 7/17/2026, 8:28:58 PM
1class Solution {
2    public List<String> topKFrequent(String[] words, int k) {
3        List<String> list = new ArrayList<>();
4        HashMap<String,Integer> mpp = new HashMap<>();
5
6        for(int i=0;i<words.length;i++){
7            String s = words[i];
8            mpp.put(s,mpp.getOrDefault(s,0)+1);
9        }
10
11        ArrayList<ArrayList<String>> arr = new ArrayList<>();
12        for (int i = 0; i <= words.length; i++) {
13            arr.add(new ArrayList<>());
14        }
15
16        for (Map.Entry<String, Integer> entry : mpp.entrySet()) {
17            String word = entry.getKey();
18            int freq = entry.getValue();
19
20            arr.get(freq).add(word);
21        }
22
23        for(int i=arr.size()-1;i>=0;i--){
24            if(list.size()==k) break;
25            ArrayList<String> temp = arr.get(i);
26            if(!temp.isEmpty()){
27                Collections.sort(temp);
28                for(String s:temp){
29                    if(list.size()==k) break;
30                    list.add(s);
31                }
32            }
33        }
34
35        return list;
36    }
37}