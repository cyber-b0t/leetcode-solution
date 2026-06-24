// Last updated: 6/24/2026, 8:53:15 PM
1class Solution {
2    public int[][] merge(int[][] intervals) {
3        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
4
5        List<int[]> res = new ArrayList<>();
6
7        for(int i=0;i<intervals.length;i++){
8            int start = intervals[i][0];
9            int end = intervals[i][1];
10
11            for(int j=i+1;j<intervals.length;j++){
12                if(intervals[j][0]<=end){
13                    end = Math.max(end,intervals[j][1]);
14                    i = j;
15                }else{
16                    break;
17                }
18            }
19            int[] a = new int[2];
20            a[0] = start;
21            a[1] = end;
22            res.add(a);
23        }
24
25        return res.toArray(new int[res.size()][]);
26    }
27}