// Last updated: 7/26/2026, 1:37:18 AM
1class Solution {
2    public int[] asteroidCollision(int[] asteroids) {
3        Stack<Integer> st = new Stack();
4
5        for(int asteroid:asteroids){
6            boolean alive=true;
7            if (asteroid>0) {
8                st.push(asteroid);
9            }
10            if(asteroid<0){
11                int n = -asteroid;
12                while(!st.isEmpty() && st.peek()>0){
13                    if(st.peek()<n){
14                        st.pop();
15                    }else if(st.peek()==n){
16                        st.pop();
17                        alive=false;
18                        break;
19                    }else{
20                        alive=false;
21                        break;
22                    }
23                }
24                if(alive) st.push(asteroid);
25            }
26        }
27
28        int[] arr = new int[st.size()];
29
30        for(int i=st.size()-1;i>=0;i--){
31            arr[i] = st.pop();
32        }
33
34        return arr;
35    }
36}