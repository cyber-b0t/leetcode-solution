// Last updated: 7/22/2026, 12:51:49 AM
1class Solution {
2    public int[] asteroidCollision(int[] asteroids) {
3        Stack<Integer> stack = new Stack<>();
4
5        for (int asteroid : asteroids) {
6            boolean alive = true;
7
8            while (alive && asteroid < 0 && !stack.isEmpty() && stack.peek() > 0) {
9                if (stack.peek() < -asteroid) {
10                    stack.pop();               
11                } else if (stack.peek() == -asteroid) {
12                    stack.pop();             
13                    alive = false;
14                } else {
15                    alive = false;             
16                }
17            }
18            if (alive) {
19                stack.push(asteroid);
20            }
21        }
22
23        int[] ans = new int[stack.size()];
24        for (int i = 0; i < stack.size(); i++) {
25            ans[i] = stack.get(i);
26        }
27
28        return ans;
29    }
30}