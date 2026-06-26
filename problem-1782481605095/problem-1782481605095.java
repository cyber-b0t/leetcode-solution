// Last updated: 6/26/2026, 7:16:45 PM
1class Solution {
2    public int[] nextGreaterElements(int[] nums) {
3
4        Stack<Integer> st = new Stack<>();
5
6        int n = nums.length;
7
8        int[] nge = new int[nums.length];
9
10        for(int i=2*nums.length-1;i>=0;i--){
11            while(!st.isEmpty() && st.peek()<=nums[i%n]){
12                st.pop();
13            }
14
15            if(st.isEmpty()){
16                nge[i%n] = -1;
17            }else{
18                nge[i%n] = st.peek();
19            }
20            st.push(nums[i%n]);
21        }
22
23        return nge;
24    }
25}