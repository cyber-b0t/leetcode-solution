// Last updated: 7/25/2026, 1:37:33 AM
1class Allocator {
2    int[] arr;
3    int idx=0;
4
5    public Allocator(int n) {
6        arr = new int[n];
7        Arrays.fill(arr,0);
8    }
9    
10    public int allocate(int size, int mID) {
11
12        for(int i=0;i<=arr.length-size;i++){
13            if(arr[i]==0){
14                int idx=0;
15                while(idx<size){
16                    if(arr[i+idx]!=0){
17                        break;
18                    }
19                    idx++;
20                }
21                if (idx==size){
22                    for(int j=i;j<i+size;j++){
23                        arr[j]=mID;
24                    }
25                    return i;
26                }
27                
28            }
29        }
30        return -1;
31    }
32    
33    public int freeMemory(int mID) {
34        int cnt=0;
35        for(int i=0;i<arr.length;i++){
36            if(arr[i]==mID){
37                arr[i]=0;
38                cnt++;
39            }
40        }
41        return cnt;
42    }
43}
44
45/**
46 * Your Allocator object will be instantiated and called as such:
47 * Allocator obj = new Allocator(n);
48 * int param_1 = obj.allocate(size,mID);
49 * int param_2 = obj.freeMemory(mID);
50 */