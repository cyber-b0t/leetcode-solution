// Last updated: 8/13/2026, 1:04:57 AM
1class RandomizedSet {
2    List<Integer> list;
3    HashMap<Integer,Integer> mpp;
4    Random random;
5    public RandomizedSet() {
6        list = new ArrayList<>();
7        mpp = new HashMap<>();
8        random = new Random();
9    }
10    
11    public boolean insert(int val) {
12        if(mpp.containsKey(val)){
13            return false;
14        }
15
16        mpp.put(val, list.size());
17        list.add(val);
18
19        return true;
20    }
21    
22    public boolean remove(int val) {
23        if (!mpp.containsKey(val)) {
24            return false;
25        }
26
27        int index = mpp.get(val);
28        int lastValue = list.get(list.size() - 1);
29
30        list.set(index, lastValue);
31        mpp.put(lastValue, index);
32
33        list.remove(list.size() - 1);
34        mpp.remove(val);
35
36        return true;
37    }
38    
39    public int getRandom() {
40        int index = random.nextInt(list.size());
41        return list.get(index);
42        
43    }
44}