// Last updated: 6/24/2026, 8:53:52 PM
class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int L=0;
        int R=0;
        int max=0;

        while(R<fruits.length){

            mpp.put(fruits[R],mpp.getOrDefault(fruits[R],0)+1);

            if(mpp.size()>2){
                mpp.put(fruits[L],mpp.get(fruits[L])-1);
                if(mpp.get(fruits[L])==0){
                    mpp.remove(fruits[L]);
                }
                L++;   
            }  
            max=Math.max(max,R-L+1);
            R++;
        }

        return max;
    }
}