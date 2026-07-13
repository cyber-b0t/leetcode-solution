// Last updated: 7/14/2026, 12:08:52 AM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int L=0;
4        int R = matrix.length*matrix[0].length-1;
5        int n = matrix[0].length;
6        
7        while(L<=R){
8            int mid = L+(R-L)/2;
9
10            int row = mid/n;
11            int col = mid%n;
12
13            int x = matrix[row][col];
14
15            if(x==target){
16                return true;
17            }else if(x<target){
18                L = mid+1;
19            }else{
20                R = mid-1;
21            }
22        }
23
24        return false;
25    }
26}