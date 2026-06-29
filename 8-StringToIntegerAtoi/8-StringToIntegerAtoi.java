// Last updated: 6/30/2026, 3:01:12 AM
class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if(s.isEmpty()) return 0;
        char sign = s.charAt(0);
        int L=0;

        if (sign=='-'){
            L++;
        }else if(sign=='+'){
            L++;
        }

        int num=0;

        while(L<s.length()){
            int c = s.charAt(L)-'0';
            if(0<=c && c<=9){
                if (num > (Integer.MAX_VALUE - c) / 10) {
                    if (sign == '-') {
                        return Integer.MIN_VALUE;
                    } else {
                        return Integer.MAX_VALUE;
                    }
                }
                num = num*10+c;
            }else{
                break;
            }
            L++;
        }

        if(sign=='-') return 0-num;

        return num;
    }
}