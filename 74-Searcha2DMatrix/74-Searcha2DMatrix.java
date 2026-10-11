// Last updated: 10/11/2026, 8:33:33 PM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int L=0;
4        int R=matrix.length*matrix[0].length-1;
5        int m=matrix.length;
6        int n=matrix[0].length;
7        while(L<=R){
8            int mid= L+(R-L)/2;
9            int row=mid/n;
10            int col=mid%n;
11
12            if(matrix[row][col]==target){
13                return true;
14            }else if(matrix[row][col]<target){
15                L = mid+1;
16            }else{
17                R = mid-1;
18            }
19        }
20        return false;
21    }
22}