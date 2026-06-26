// Last updated: 6/26/2026, 5:15:06 PM
1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        Stack<Integer> st = new Stack<>();
4        HashMap<Integer,Integer> mpp = new HashMap<>();
5
6        for(int i=nums2.length-1;i>=0;i--){
7
8            while(!st.isEmpty() && st.peek()<=nums2[i]){
9                st.pop();
10            }
11
12            if(st.isEmpty()){
13                mpp.put(nums2[i],-1);
14            }else{
15                mpp.put(nums2[i],st.peek());        
16            }   
17            st.push(nums2[i]); 
18        }
19
20        for(int i=0;i<nums1.length;i++){
21            nums1[i] = mpp.get(nums1[i]);
22        }
23
24        return nums1;
25    }
26}