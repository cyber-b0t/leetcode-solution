// Last updated: 6/30/2026, 3:00:48 AM
class Solution {
    public int[] nextGreaterElements(int[] nums) {

        Stack<Integer> st = new Stack<>();

        int n = nums.length;

        int[] nge = new int[nums.length];

        for(int i=2*nums.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums[i%n]){
                st.pop();
            }

            if(st.isEmpty()){
                nge[i%n] = -1;
            }else{
                nge[i%n] = st.peek();
            }
            st.push(nums[i%n]);
        }

        return nge;
    }
}