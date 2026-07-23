// Last updated: 7/23/2026, 8:46:34 PM
1class MyHashMap {
2
3    int[] mpp;
4
5    public MyHashMap() {
6        mpp = new int[1000001];
7        Arrays.fill(mpp,-1);
8    }
9    
10    public void put(int key, int value) {
11        mpp[key] = value;
12    }
13    
14    public int get(int key) {
15        return mpp[key];
16    }
17    
18    public void remove(int key) {
19        mpp[key] = -1;
20    }
21}
22
23/**
24 * Your MyHashMap object will be instantiated and called as such:
25 * MyHashMap obj = new MyHashMap();
26 * obj.put(key,value);
27 * int param_2 = obj.get(key);
28 * obj.remove(key);
29 */