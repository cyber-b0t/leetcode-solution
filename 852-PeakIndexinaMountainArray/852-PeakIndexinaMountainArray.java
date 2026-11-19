// Last updated: 11/19/2026, 7:46:52 PM
1class Solution {
2    public int peakIndexInMountainArray(int[] arr) {
3        int L=0;
4        int H=arr.length-1;
5
6        while(L<H){
7            int M=L+(H-L)/2;
8
9            if(arr[M]<arr[M+1]){
10                L=M+1;
11
12            }else{
13                H=M;
14            }
15        }
16        return L;
17    }
18}