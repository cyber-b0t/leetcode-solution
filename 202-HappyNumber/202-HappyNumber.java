// Last updated: 8/5/2026, 2:50:46 PM
1class Solution {
2    public int nextNum(int n){
3        int num = 0;
4
5        while(n!=0){
6            int digit = n%10;
7            num+=digit*digit;
8            n=n/10;
9        }
10
11        return num;
12    }
13    public boolean isHappy(int n) {
14        int slow=n;
15        int fast=n;
16
17        while(slow!=1){
18            slow = nextNum(slow);
19            fast = nextNum(nextNum(fast));
20
21            if(fast==slow && slow != 1){
22                return false;
23            }
24        }
25
26        return true;
27    }
28}