// Last updated: 6/27/2026, 2:00:46 AM
1class Solution {
2    public int trap(int[] height) {
3        Stack<Integer> st = new Stack<>();
4
5        int i=0,j=height.length-1;
6        int Lmax=-1,Rmax=-1;
7
8        int lvl=0;
9
10        while(i<j){
11            Lmax = Math.max(Lmax,height[i]);
12            Rmax = Math.max(Rmax,height[j]);
13
14            if(Lmax>Rmax){
15                lvl += Rmax-height[j];
16                j--;
17            }else{
18                lvl += Lmax-height[i];
19                i++;
20            }
21
22        }
23
24        return lvl;
25
26    }
27}