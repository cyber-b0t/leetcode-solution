// Last updated: 6/27/2026, 11:00:49 AM
1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3        List<Integer> arr = new ArrayList<>();
4
5        int top=0;
6        int down=matrix.length-1;
7        int left=0;
8        int right=matrix[0].length-1;
9
10        while(top<=down && left<=right){
11            if (top <= down) {
12                for (int i = left; i <= right; i++)
13                    arr.add(matrix[top][i]);
14                top++;
15            }
16
17            if (left <= right) {
18                for (int i = top; i <= down; i++)
19                    arr.add(matrix[i][right]);
20                right--;
21            }
22
23            if (top <= down) {
24                for (int i = right; i >= left; i--)
25                    arr.add(matrix[down][i]);
26                down--;
27            }
28
29            if (left <= right) {
30                for (int i = down; i >= top; i--)
31                    arr.add(matrix[i][left]);
32                left++;
33            }
34        }
35
36        return arr;
37    }
38}