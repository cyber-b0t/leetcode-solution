// Last updated: 7/13/2026, 12:47:39 AM
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int L=0;
4        int R=numbers.length-1;
5
6        while(L<R){
7            int sum = numbers[L]+numbers[R];
8            if(sum>target){
9                R--;
10            }else if(sum<target){
11                L++;
12            }else{
13                return new int[]{L+1,R+1};
14            }
15        }
16        return new int[]{L+1,R+1};
17    }
18}