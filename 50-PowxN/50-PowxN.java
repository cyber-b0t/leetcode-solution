// Last updated: 6/24/2026, 8:54:28 PM
class Solution {
    public double myPow(double x, int n) {
        long N = n;
        double res = 1.0;

        if(N<0){
            x = 1/x;
            N=-N;
        }

        while(N>0){
            if(N%2==1){
                res = res*x;
            }
            x=x*x;
            N=N/2;
        }

        return res;
    }
}